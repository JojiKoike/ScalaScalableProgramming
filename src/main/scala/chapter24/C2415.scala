package chapter24

object C2415 extends App {

  // Iterator
  val it = Iterator("a", "number", "of", "words")
  println(it)
  val it_len = it.map(_.length)
  println(it_len)
  println(it_len foreach println)

  val it1 = Iterator("this", "is", "a", "pen")
  println(it1 dropWhile(_.length < 3))
  println(it1.next())

  // Buffered Iterator
  val it2 = Iterator(1, 2, 3, 4)
  println(it2)
  val bit = it2.buffered
  println(bit)
  println(bit.head)
  println(bit.next())
  println(bit.next())
}
