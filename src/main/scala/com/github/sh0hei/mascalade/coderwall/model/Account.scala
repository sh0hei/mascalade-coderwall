package com.github.sh0hei.mascalade.coderwall.model

import org.joda.time.format.DateTimeFormat
import org.json4s.DefaultFormats
import org.json4s.JsonAST.JValue

case class Account(github: Option[String], twitter: Option[String], linkedIn: Option[String])

object Account {

  private[this] case class DataHolder(github: Option[String], twitter: Option[String], linkedIn: Option[String])

  private[this] val p = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ")

  def apply(value: JValue): Account = {
    implicit val formats = DefaultFormats
    val holder = value.extract[DataHolder]
    Account(holder.github, holder.twitter, holder.linkedIn)
  }
}