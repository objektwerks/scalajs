Scalajs
-------
>ScalaJs feature tests.

Install
-------
>jsdom **must** be installed locally - **not** globally!
1. brew install node
2. npm install jsdom

Build
-----
1. sbt clean compile fastLinkJS

Test
----
1. sbt test | sbt clean compile fastLinkJS test

Run
---
>Console:
1. sbt clean compile fastLinkJS run
>Browser:
1. sbt clean compile fastLinkJS
2. Open src/main/resources/index.html.
3. Select brower option from editor popup.
4. Select newly opened tab to see index.html.
5. Open Developer Tools to see browser console.