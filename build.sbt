name := "webapi-scala"

version := "1.0"

scalaVersion := "2.11.7"

organization := "com.github.trananh"

libraryDependencies ++= Seq(
  "com.google.http-client" % "google-http-client-gson" % "1.17.0-rc",
  "com.google.apis" % "google-api-services-customsearch" % "v1-rev25-1.17.0-rc",
  "org.twitter4j" % "twitter4j-core" % "3.0.3",
  "org.twitter4j" % "twitter4j-stream" %  "3.0.3"
)
