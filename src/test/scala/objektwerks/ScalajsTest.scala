package objektwerks

import org.scalajs.dom.document

import utest._

object ScalajsTest extends TestSuite {
  ScalajsApp.init()

  val tests = Tests {
    test("paragraph") {
      assert(
        document
          .querySelectorAll("p")
          .count(_.textContent == ScalajsApp.webText) == 1
      )
    }
    test("button") {
      assert(
        document
          .querySelectorAll("button")
          .count(_.textContent == ScalajsApp.buttonLabel) == 1
      )
    }
  }

  TestRunner.run(tests)
}