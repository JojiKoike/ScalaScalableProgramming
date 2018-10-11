package chapter24

import scala.collection.mutable
import scala.reflect.ClassTag

object C2410 extends App {

  // Array
  val a1 = Array(1,2,3,4,5)
  println(a1.mkString(","))
  val a2 = a1 map(_ * 3)
  println(a2.mkString(","))
  val a3 = a2 filter(_ % 2 != 0)
  println(a3.mkString(","))
  println(a3.reverse.mkString(","))
  val seq: Seq[Int] = a1
  println(seq)
  println(seq.reverse)
  val a4: Array[Int] = seq.toArray
  println(a4)
  println(a1 eq a4)
  val ops: mutable.ArrayOps[Int] = a1
  println(ops.reverse.mkString(","))

  // Class Tag
  def evenElems[T: ClassTag] (xs: Vector[T]): Array[T] = {
    val arr = new Array[T]((xs.length + 1) / 2)
    for (i <- 0 until xs.length by 2)
      arr(i/ 2) = xs(i)
    arr
  }
  println(Vector(1,2,3,4,5).mkString(","))
  println(evenElems(Vector(1,2,3,4,5)).mkString(","))

}
