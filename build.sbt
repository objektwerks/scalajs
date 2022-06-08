lazy val scalajs = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "scalajs",
    organization := "objektwerks",
    version := "0.1-SNAPSHOT",
    scalaVersion := "3.1.3-RC5"
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= {
      Seq(
        "org.scala-js" %%% "scalajs-dom" % "2.0.0",
        "com.outr" %%% "scribe" % "3.8.2",
        "com.lihaoyi" %%% "utest" % "0.7.11" % Test
      )
    },
    jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv(),
    testFrameworks += new TestFramework("utest.runner.Framework")
  )
