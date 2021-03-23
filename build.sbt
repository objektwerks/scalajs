lazy val scalajs = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "scalajs",
    organization := "objektwerks",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.13.5",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= {
      Seq(
        "com.lihaoyi" %% "utest" % "0.7.7" % Test
      )
    }
  )