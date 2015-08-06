package com.github.sh0hei.mascalade.coderwall

import java.text.SimpleDateFormat

import com.github.sh0hei.mascalade.coderwall.model.User
import org.json4s.DefaultFormats
import org.json4s.native.JsonMethods

import scala.io.Source

object Coderwall {

  val API_BASE_URL = "https://coderwall.com"

  val FORMAT = ".json"

  def userApiEndpoint(userName: String): String = s"${API_BASE_URL}/${userName}${FORMAT}"

  def getUser(userName: String): Option[User] = {

    implicit val formats = new DefaultFormats {
      override def dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
    }

    val jsonResponse = Source.fromURL(userApiEndpoint(userName), "utf-8").mkString
    val parsedJson = JsonMethods.parse(jsonResponse)
    val user = parsedJson.extract[User]
    Option(user)
  }
}