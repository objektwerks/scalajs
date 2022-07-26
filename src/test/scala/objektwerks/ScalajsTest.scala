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
          .count(_.id == "pid") == 1
      )
    }
    test("button") {
      assert(
        document
          .querySelectorAll("button")
          .count(_.id = "bid") == 1
      )
    }
  }

  TestRunner.run(tests)
}