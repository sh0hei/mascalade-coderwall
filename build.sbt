name := "mascalade-coderwall"

version := "0.0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  Seq(
    "org.json4s" %% "json4s-native" % "3.2.11",
    "org.specs2" %% "specs2-core" % "3.6.4" % "test",
    "org.scalaj" %% "scalaj-http" %  "1.1.5",
    "joda-time" % "joda-time" % "2.3",
    "org.joda" % "joda-convert" % "1.6"
  )
}

scalacOptions in Test ++= Seq("-Yrangepos")

