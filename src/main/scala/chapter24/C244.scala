package chapter24

object C244 extends App {
  val xs = List(1,2,3,4,5)

  // grouped
  val git = xs grouped 3
  while (git.hasNext)
    println(git.next().mkString(","))

  val ys = List(3,4,5,6,7)
  println(xs.zip(ys).mkString(","))

  sealed abstract class Tree extends Traversable[Int] {
    def foreach[U](f: Int => U): Unit = this match {
      case Node(elem) => f(elem)
      case Branch(left, right) => left foreach f; right foreach f
    }
  }
  /*
  This implements has performance problem


  sealed abstract class Tree extends Iterable[Int] {
    override def iterator: Iterator[Int] = this match {
      case Node(elem) => Iterator.single(elem)
      case Branch(left, right) => left.iterator ++ right.iterator
    }
  }
  */
  case class Branch(left: Tree, right: Tree) extends Tree
  case class Node(elem: Int) extends Tree


}
