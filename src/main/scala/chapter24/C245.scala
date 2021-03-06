package chapter24

import scala.collection.mutable

object C245 extends App {
  // Sequence
  val seqSample = Seq(1, 2, 3, 4, 3, 2, 3, 4, 5)
  println(seqSample.mkString(","))

  // Refer by index, Calculate Length
  println(seqSample(1))
  println(seqSample length)
  println(seqSample.indices.mkString(","))

  // Sequence search
  println(seqSample indexOf 3)
  println(seqSample lastIndexOf 3)
  println(seqSample indexOfSlice Seq(2, 3))
  println(seqSample lastIndexOfSlice Seq(2, 3))
  println(seqSample indexWhere(_ == 2))

  // Add
  println((10 +: seqSample).mkString(","))
  println((seqSample :+ 100).mkString(","))

  // Patch
  println((seqSample patch(1, Seq(4, 5, 6), 2)).mkString(","))

  // Updated
  println((seqSample updated (2, 4)).mkString(","))

  // Sort
  println((seqSample sorted).mkString(","))
  println((seqSample reverse).mkString(","))

  // Comparison
  println(seqSample startsWith Seq(1, 2))
  println(seqSample startsWith Seq(3, 4))
  println(seqSample contains 3)
  println(seqSample containsSlice Seq(3, 4, 5))

  // Set Calculation
  val seqSample1 = Seq(1, 2, 3, 4, 5)
  println((seqSample intersect seqSample1).mkString(","))
  println((seqSample diff seqSample1).mkString(","))
  println((seqSample1 diff seqSample).mkString(","))
  println((seqSample union seqSample1).mkString(","))
  println(seqSample.distinct.mkString(","))

  // Buffer
  val bufSample: mutable.Buffer[Int] = mutable.Buffer()
  println(bufSample.mkString(","))

  // Append
  bufSample += 1
  println(bufSample.mkString(","))
  bufSample += (2, 3, 4)
  println(bufSample.mkString(","))
  bufSample ++= Seq(9, 10, 11, 12)
  println(bufSample.mkString(","))
  -1 +=: bufSample
  println(bufSample.mkString(","))
  Seq(-5, -4, -3, -2) ++=: bufSample
  println(bufSample.mkString(","))
  bufSample.insert(bufSample.indexOf(1), 0)
  println(bufSample.mkString(","))
  bufSample.insertAll(bufSample.indexOf(9), Seq(5, 6, 7, 8))
  println(bufSample.mkString(","))

  // Remove
  bufSample -= -5
  println(bufSample.mkString(","))
  bufSample remove bufSample.indexOf(0)
  println(bufSample.mkString(","))
  bufSample remove(bufSample.indexOf(10), 3)
  println(bufSample.mkString(","))
  bufSample trimStart 4
  println(bufSample.mkString(","))
  bufSample trimEnd 4
  println(bufSample.mkString(","))
  bufSample.clear()
  println(bufSample.mkString(","))

  // Clone
  bufSample ++= Seq(1, 2, 3, 4, 5, 6)
  val bufSampleClone = bufSample.clone()
  println(bufSampleClone.mkString(","))
  println(bufSample.mkString(","))

}
