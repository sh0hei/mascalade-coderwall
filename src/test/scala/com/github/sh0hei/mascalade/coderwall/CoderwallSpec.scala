package com.github.sh0hei.mascalade.coderwall

import com.github.sh0hei.mascalade.coderwall.model.User
import org.specs2.mutable._

class CoderwallSpec extends Specification {

  "mascalade-coderwall" should {

    "calls User API" in {
      val user = Coderwall.getUser("sh0hei")
      println(user)
      user must beSome[User]
    }
  }
}
