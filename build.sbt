name := "mascalade-coderwall"

version := "0.0.1"

scalaVersion := "2.11.7"

organization := "com.github.sh0hei"

libraryDependencies ++= {
  Seq(
    "org.specs2" %% "specs2" % "2.3.4" % "test"
    "org.scalaj" %% "scalaj-http" %  "1.1.5"
  )
}
