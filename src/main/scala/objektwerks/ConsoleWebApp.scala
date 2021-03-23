package objektwerks

import org.scalajs.dom
import org.scalajs.dom.document

object ConsoleWebApp {
  def main(args: Array[String]): Unit = {
    document.addEventListener("DOMContentLoaded", { (_: dom.Event) =>
      init()
    })
    println("*** Scalajs console app! ***")
  }

  def init(): Unit = {
    val pElement = document.createElement("p")
    pElement.textContent = "*** Scalajs web app! ***"
    document.body.appendChild(pElement)

    val button = document.createElement("button")
    button.textContent = "Click me!"
    button.addEventListener("click", { (_: dom.MouseEvent) =>
      println("*** Button clicked! ***")
    })
    document.body.appendChild(button)
    ()
  }
}