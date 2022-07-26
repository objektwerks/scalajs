package objektwerks

import org.scalajs.dom
import org.scalajs.dom.document

object ScalajsApp:
  def main(args: Array[String]): Unit =
    document.addEventListener("DOMContentLoaded", { (_: dom.Event) =>
      val paragraph = document.createElement("p")
      paragraph.id = "pid"
      paragraph.textContent = "Scalajs web app!"
      document.body.appendChild(paragraph)

      val button = document.createElement("button")
      button.id = "bid"
      button.textContent = "Click me!"
      button.addEventListener("click", { (_: dom.MouseEvent) =>
        println("*** [println] Button clicked!")
      })
      document.body.appendChild(button)
    })

    val consoleText = "Scalajs console app!"
    println(s"*** [println] text: $consoleText")
    scribe.info(s"*** [scribe] text: $consoleText")