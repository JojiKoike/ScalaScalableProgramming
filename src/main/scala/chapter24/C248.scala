package chapter24

import scala.collection.immutable.{ListMap, Queue, Stack}

object C248 extends App {

  // Stream (List with Lazy Evaluation)
  val str = 1 #:: 2 #:: 3 #:: Stream.empty
  println(str)
  def fibFrom(a: Int, b: Int): Stream[Int] =
    a #:: fibFrom(b, a + b)
  println(fibFrom(1, 1).take(7).mkString(","))

  // Vector
  val vec = Vector.empty
  println(vec.mkString(","))
  val vec2 = vec :+ 1 :+ 2
  println(vec2.mkString(","))
  val vec3 = 100 +: vec2
  println(vec3.mkString(","))
  println(vec3(0))
  val vec4 = Vector(1, 2, 3)
  println(vec4 updated(2, 4) mkString "," )
  println(vec4.mkString(","))

  // Immutable Stack
  val stack = Stack.empty
  val hasOne = stack.push(1)
  println(stack)
  println(hasOne)
  println(hasOne.top)
  println(hasOne.pop)

  // Immutable Queue
  val empQueue = Queue[Int]()
  println(empQueue)
  val has1Queue = empQueue.enqueue(1)
  println(has1Queue)
  val has123Queue = has1Queue.enqueue(List(2, 3))
  println(has123Queue)
  val (element, has23) = has123Queue.dequeue
  println(element)
  println(has23)

  // Range
  println(1 to 3)
  println(5 to 14 by 3)
  println(1 until 3)

  // ListMap
  val lMap = ListMap(1 -> "January", 2 -> "February", 3 -> "March", 4 -> "April")
  println(lMap(2))

}
