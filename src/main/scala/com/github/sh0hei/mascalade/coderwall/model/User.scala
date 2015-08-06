package com.github.sh0hei.mascalade.coderwall.model

case class User(
  username: String,
  name: String,
  location: String,
  endorsements: Int,
  team: Option[String],
  accounts: Account,
  badges: List[Badge]
)