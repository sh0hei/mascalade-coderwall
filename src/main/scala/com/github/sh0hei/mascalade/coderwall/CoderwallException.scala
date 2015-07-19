package com.github.sh0hei.mascalade.coderwall

import scalaj.http.HttpException

class CoderwallException private (val message: String, val cause: Exception) extends Exception(message, cause)

object CoderwallException {
  def apply(cause: HttpException): CoderwallException = {
    implicit val formats = DefaultFormats
    val message = (parse(cause.body) \ "error" \ "message").extract[String]
    new CoderwallException(s"${cause.code}: ${cause.message} (${message})", cause)
  }
  def apply(message: String): CoderwallException = {
    new CoderwallException(message, null)
  }
}
