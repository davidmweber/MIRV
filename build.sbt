import com.typesafe.sbt.packager.Keys._

name := "multi-module-example"

version := "0.0.1"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-feature", "-language:postfixOps")

lazy val root = project.in(file(".")).aggregate(lib,client,server)

lazy val lib = project.in(file("lib"))

lazy val client = project.in(file("client")).dependsOn(lib)

lazy val server = project.in(file("server")).dependsOn(lib)

packageArchetype.java_application

packageDescription in Debian := "Multimodule example"

maintainer in Debian := "David Weber"

