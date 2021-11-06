Scalajs
-------
>Scalajs feature tests.

Install
-------
1. npm install jsdom

Build
-----
1. sbt clean compile fastLinkJS

Test
----
1. sbt clean test

Run
---
>Console:
1. sbt clean compile fastLinkJS run
>Browser:
1. Open src/main/resources/index.html.
2. Select brower option from editor popup.
3. Select newly opened tab to see index.html.
4. Open Developer Tools to see browser console.