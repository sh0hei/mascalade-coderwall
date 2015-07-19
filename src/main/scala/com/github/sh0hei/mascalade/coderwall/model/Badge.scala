package com.github.sh0hei.mascalade.coderwall.model

import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat
import org.json4s.DefaultFormats
import org.json4s.JsonAST.JValue

case class Badge(name: String, description: String, created: DateTime, badge: String)

object Badge {

  private[this] case class DataHolder(name: String, description: String, created: DateTime, badge: String)

  private[this] val p = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ssZ")

  def apply(value: JValue): Badge = {
    implicit val formats = DefaultFormats
    val holder = value.extract[DataHolder]
    Badge(holder.name, holder.description, holder.created, holder.badge)
  }
}
