enablePlugins(ScalaJSPlugin)

lazy val public = "public"

name := "scalajs"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.2.2"
scalaJSUseMainModuleInitializer := true
scalacOptions ++= Seq("-scalajs")
libraryDependencies ++= {
  Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.3.0",
    "com.outr" %%% "scribe" % "3.10.7",
    "com.lihaoyi" %%% "utest" % "0.8.1" % Test
  )
}
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
testFrameworks += new TestFramework("utest.runner.Framework")
Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / public
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / public
