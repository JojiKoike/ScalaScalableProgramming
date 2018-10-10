package chapter24

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object C249 extends App {

  // Actual Mutable Collection Class

  // ArrayBuffer
  val arrBuf = ArrayBuffer.empty[Int]
  println(arrBuf)
  println(arrBuf += 1)
  println(arrBuf += 10)
  println(arrBuf.toArray.mkString(","))

  // ListBuffer
  val liBuf = ListBuffer.empty[Int]
  println(liBuf += 1)
  println(liBuf += 10)
  println(liBuf.toList.mkString(","))

  // StringBuilder
  val sb = new mutable.StringBuilder
  println(sb)
  sb += 'a'
  println(sb)
  sb ++= "bcdef"
  println(sb)
  println(sb.toString)

  // Queue (for FIFO)
  val queue = new mutable.Queue[String]
  queue += "a"
  println(queue)
  queue ++= List("b", "c")
  println(queue)
  println(queue.dequeue)
  println(queue)

  // Stack (for LIFO)
  val stack = new mutable.Stack[Int]
  stack.push(1)
  println(stack)
  stack.push(2)
  println(stack)
  println(stack.top)
  println(stack)
  println(stack.pop)
  println(stack)

  // Hash Table
  val map = mutable.HashMap.empty[Int, String]
  map += (1 -> "January")
  println(map)
  map += (3 -> "March")
  println(map)
  println(map(1))
  println(map contains 2)


  // BitSet
  val bits = mutable.BitSet.empty
  bits += 1
  println(bits)
  bits += 3
  println(bits)


}
