enablePlugins(ScalaJSPlugin)

name := "scalajs"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.2.0-RC2"
scalaJSUseMainModuleInitializer := true
scalacOptions ++= Seq("-scalajs")
libraryDependencies ++= {
  Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.2.0",
    "com.outr" %%% "scribe" % "3.10.1",
    "com.lihaoyi" %%% "utest" % "0.8.0" % Test
  )
}
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
testFrameworks += new TestFramework("utest.runner.Framework")
