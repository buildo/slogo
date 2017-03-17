lazy val log4j2version = "2.8.1"
lazy val log4j2scala = "org.apache.logging.log4j" %% "log4j-api-scala" % log4j2version
lazy val log4j2api = "org.apache.logging.log4j" % "log4j-api" % log4j2version
lazy val log4j2core = "org.apache.logging.log4j" % "log4j-core" % log4j2version


lazy val slog = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "io.buildo",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    libraryDependencies ++= Seq(
      log4j2api,
      log4j2core
    )
  )
