package printmenu

import bobsrockets.Fruits
import bobsrockets.showFruit

object PrintMenu {
  def main(args: Array[String]):Unit = {
    for (fruit <- Fruits.menu) {
      showFruit(fruit)
    }
  }
}
