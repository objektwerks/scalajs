package objektwerks

import org.scalajs.dom

import scala.concurrent.ExecutionContext.Implicits.global
import scala.scalajs.js.Thenable.Implicits._

import utest._

object ScalajsAsyncTest extends TestSuite {
  def parse(joke: String): String = {
    val json = ujson.read(joke)
    json("value").obj("joke").str
  }

  val tests = Tests {
    test("fetch") {
      ( for {
        response <- dom.fetch("http://api.icndb.com/jokes/random/")
        json     <- response.text()
        text     =  parse(json)
      } yield {
        text
      } ).recover { case error: Exception => error.getMessage }
    }
  }

  TestRunner.runAsync(tests).map { asyncResults =>
    val results = asyncResults.leaves.toSeq
    assert(results.head.value.isSuccess)
    assert(results.tail.head.value.isSuccess)
  }
}