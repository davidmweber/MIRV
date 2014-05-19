import com.typesafe.sbt.packager.Keys._

packageArchetype.java_server

exportJars := true

packageDescription in Debian := "Multi-module server"

maintainer in Debian := "David Weber"

version in Debian := version.value

libraryDependencies ++= List(
  "org.scalatest" %% "scalatest" % "2.1.3" % "test"
)
