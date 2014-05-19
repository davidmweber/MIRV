
scalaVersion in ThisBuild := "2.11.0"

scalacOptions in ThisBuild ++= Seq("-feature", "-language:postfixOps")

lazy val root = project in file(".") aggregate(lib,client,server)

lazy val lib = project in file("lib") settings(
  version := "1.0.0"
)

lazy val client = project in file("client") settings(
  version := "1.0.1",
  name := "mirv-client"
) dependsOn(lib)

lazy val server = project in file("server") settings(
  version := "1.0.2",
  name:="mirv-server"
) dependsOn(lib)

