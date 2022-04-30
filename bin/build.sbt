name := "scalapass"
organization := "com.outr"
version := "1.0.4"

scalaVersion := "2.13.0"
crossScalaVersions := List("2.13.0", "2.12.8", "2.11.12")
scalacOptions ++= Seq("-unchecked", "-deprecation")

publishTo := sonatypePublishTo.value
sonatypeProfileName := "com.outr"
publishMavenStyle := true
licenses := Seq("MIT" -> url("https://github.com/outr/scalapass/blob/master/LICENSE"))
sonatypeProjectHosting := Some(xerial.sbt.Sonatype.GitHubHosting("outr", "scalapass", "matt@outr.com"))
homepage := Some(url("https://github.com/outr/scalapass"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/outr/scalapass"),
    "scm:git@github.com:outr/scalapass.git"
  )
)
developers := List(
  Developer(id="darkfrog", name="Matt Hicks", email="matt@matthicks.com", url=url("http://matthicks.com"))
)


fork := true

libraryDependencies ++= Seq(
  "javax.xml.bind" % "jaxb-api" % "2.3.1",
  "org.mindrot" % "jbcrypt" % "0.4",
  "commons-codec" % "commons-codec" % "1.15"
)

mainClass := Some("example.Main")
