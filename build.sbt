enablePlugins(ScalaJSPlugin)

lazy val public = "public"

name := "scalajs"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.3.1"
scalaJSUseMainModuleInitializer := true
libraryDependencies ++= {
  Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.7.0",
    "com.outr" %%% "scribe" % "3.12.2",
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
