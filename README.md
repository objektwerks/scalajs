Scalajs
-------
>ScalaJs feature tests using Scribe, uTest and Scala 3.

Install
-------
>jsdom **must** be installed locally - **not** globally!
1. brew install node
2. npm install jsdom
>See **package.json** for installable dependencies.

Build
-----
1. npm install ( only when package.json changes )
2. sbt clean compile fastLinkJS
>See **target/public** directory.

Test
----
1. sbt clean test fastLinkJS
>See **target/public** directory.

Dev
---
>Edits are reflected in both sessions.
1. sbt ( new session )
2. ~ fastLinkJS
3. npx snowpack dev ( new session )
>See **snowpack.config.json** and [Snowpack Config](https://www.snowpack.dev/reference/configuration) for configurable options.

Package
-------
1. sbt clean test fullLinkJS
2. npx snowpack build
>See **build** directory.

Console
-------
1. sbt clean compile fastLinkJS run

Browser
-------
1. sbt clean compile fastLinkJS
2. npx snowpack dev
