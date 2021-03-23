package objektwerks

import org.scalajs.dom.document

object ConsoleWebApp {
  def main(args: Array[String]): Unit = {
    println("*** Scalajs console app! ***")
    val pElement = document.createElement("p")
    pElement.textContent = "*** Scalajs web app! ***"
    document.body.appendChild(pElement)
    ()
  }
}