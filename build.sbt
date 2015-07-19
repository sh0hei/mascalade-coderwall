name := "mascalade-coderwall"

version := "0.0.1"

scalaVersion := "2.11.7"

organization := "com.github.sh0hei"

libraryDependencies ++= {
  Seq(
    "com.github.nscala-time" %% "nscala-time" % "2.0.0",
    "org.json4s" %% "json4s-native" % "3.2.11",
    "org.specs2" %% "specs2-core" % "3.6.2" % "test",
    "org.scalaj" %% "scalaj-http" %  "1.1.5"
  )
}

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")

