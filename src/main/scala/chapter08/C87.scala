package chapter08

object C87 extends App {

  val more = 1
  val addMore = (x: Int) => x + more
  println(addMore(10))

  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  var sum = 0
  someNumbers.foreach(sum += _)
  println(sum)

  def makeIncreaser(more: Int): Int => Int = (x: Int) => x + more
  val inc1 = makeIncreaser(10)
  val inc2 = makeIncreaser(9999)
  println(inc1(10))
  println(inc2(10))
}
