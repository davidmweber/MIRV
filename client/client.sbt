import com.typesafe.sbt.packager.Keys._

packageArchetype.java_application

exportJars := true

packageDescription in Debian := "Multi-module client"

maintainer in Debian := "David Weber"

version in Debian := version.value

libraryDependencies ++= List(
  "org.scalatest" %% "scalatest" % Common.scalaTest % "test"
)
