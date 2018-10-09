package chapter24

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

}
