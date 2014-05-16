
version := "0.0.1"

scalaVersion := "2.10.4"

scalacOptions ++= Seq("-feature", "-language:postfixOps")

lazy val root = project in file(".") aggregate(lib,client,server)

lazy val lib = project in file("lib")

lazy val client = project in file("client") settings(name:="mirv-client") dependsOn(lib)

lazy val server = project in file("server") settings(name:="mirv-server") dependsOn(lib)



