import com.typesafe.sbt.packager.Keys._

packageArchetype.java_application

exportJars := true

packageDescription in Debian := "Multi-module client"

maintainer in Debian := "David Weber"