package bobsrockets

object Fruits {
  object Apple extends Fruit("apple", "red")
  object Orange extends Fruit("orange", "orange")
  object Pear extends Fruit("pear", "yellowish")
  val menu = List(Apple, Orange, Pear)

  def showFruit(fruit: Fruit): Unit = {
    import fruit._
    println(name + "s are" + color)
  }
}
