package com.github.sh0hei.mascalade.coderwall.model

import org.joda.time.format.DateTimeFormat
import org.json4s.DefaultFormats
import org.json4s.JsonAST.JValue

case class User(username: String, name: String, location: String, endorsements: Int, team: Option[String], accounts: Account, badges: Badge)

object User {

  private[this] case class DataHolder(username: String, name: String, location: String, endorsements: Int, team: Option[String], accounts: Account, badges: Badge)

  private[this] val p = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ")

  def apply(value: JValue): User = {
    implicit val formats = DefaultFormats
    val holder = value.extract[DataHolder]
    User(holder.username, holder.name, holder.location, holder.endorsements, holder.team, holder.accounts, holder.badges)
  }
}