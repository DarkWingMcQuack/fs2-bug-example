import Dependencies._

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "fs2-bug-example",
    libraryDependencies += "co.fs2" %% "fs2-core" % "3.0.4",
    libraryDependencies += "co.fs2" %% "fs2-io" % "3.0.4",
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0",
    libraryDependencies += "org.typelevel" %% "cats-effect" % "3.1.0",
    libraryDependencies += scalaTest % Test
  )
