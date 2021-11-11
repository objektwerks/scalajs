package objektwerks

import org.scalajs.dom
import org.scalajs.dom.document

object ScalajsApp {
  val consoleText = "Scalajs console app!"
  val webText = "Scalajs web app!"
  val buttonLabel = "Click me!"
  val buttonText = "Button clicked!"

  def main(args: Array[String]): Unit = {
    document.addEventListener("DOMContentLoaded", { (_: dom.Event) =>
      init()
    })
    println(s"*** [println] text: $consoleText")
    scribe.info(s"*** [scribe] text: $consoleText")
  }

  def init(): Unit = {
    val paragraph = document.createElement("p")
    paragraph.textContent = webText
    document.body.appendChild(paragraph)

    val button = document.createElement("button")
    button.textContent = buttonLabel
    button.addEventListener("click", { (_: dom.MouseEvent) =>
      println(buttonText)
    })
    document.body.appendChild(button)
    ()
  }
}