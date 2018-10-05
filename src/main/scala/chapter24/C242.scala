package chapter24

import scala.collection.immutable.SortedSet

object C242 extends App {

  // Traversable Sample
  println(Traversable(1, 2, 3).mkString(","))

  // Iterable Sample
  println(Iterable("x", "y", "z").map(_.toUpperCase).mkString(","))

  // Set Sample
  println(Set(2, 3 ,4).map(_ * 3).mkString(","))

  // Sorted Set Sample
  println(SortedSet("world", "hello").map(_.toUpperCase).mkString(","))
  println(SortedSet(2,4,1,3,6,5).map(_ * 10).mkString(","))

  // List Sample
  println(List(1,2,3).map(_ + 1).mkString(","))

  // Set Sample
  println(Set(1,2,3).map(_ * 2).mkString(","))
}
