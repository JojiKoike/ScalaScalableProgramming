package chapter24

object C2411 extends App {

  // String
  val str = "hello"
  println(str)
  println(str.reverse)
  println(str.map(_.toUpper))
  println(str drop 3)
  println(str slice (1, 4))
  val s: Seq[Char] = str // String is Char Sequence
  println(s)
}
