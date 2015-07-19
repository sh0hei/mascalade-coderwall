package com.github.sh0hei.mascalade.coderwall

import com.github.sh0hei.mascalade.coderwall.model.{Account, Badge, User}

import scala.io._
import org.json4s._
import scalaj.http._

class CoderwallClient(name: String) {

  def info: User = {
    User("username", "name", "Sapporo", 0, None, Account, Badge)
  }
}

private[coderwall] trait BaseClient {
  private[this] val host = "coderwall.com"

  protected[this] def httpExecute(method: String)(path: String, params: Map[String, String]): (Int, Map[String, String], String) = {
    val req = Http(s"https://${host}/${path}").params(params).method(method).timeout(connTimeoutMs = 5000, readTimeoutMs = 5000)
    val res = req.asString
    if (res.isError) {
      throw CoderwallException(res.code, res.body)
    }
    (res.code, res.headers.toMap, res.body)
  }
}

private[coderwall] object HttpClient extends BaseClient {
  protected[this] def execute(params: Map[String, Any]): String = {
    val apiParams = value2String(params)
    logger.debug(s"params  = ${apiParams}")

    val (code, headers, body) = callApi(s"${apiMethod}", apiParams)

    logger.debug(s"code    = ${code}")
    logger.debug(s"headers = ${headers}")
    logger.debug(s"body    = ${body}")

    body
  }
}