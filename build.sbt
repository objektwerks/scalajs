enablePlugins(ScalaJSPlugin)

lazy val public = "public"

name := "scalajs"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.3.0-RC5"
scalaJSUseMainModuleInitializer := true
libraryDependencies ++= {
  Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.4.0",
    "com.outr" %%% "scribe" % "3.11.1",
    "com.lihaoyi" %%% "utest" % "0.8.1" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
testFrameworks += new TestFramework("utest.runner.Framework")
Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / public
Compile / fullLinkJS / scalaJSLinkerOutputDirectory := target.value / public