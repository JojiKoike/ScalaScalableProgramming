package chapter24

object C245 extends App {
  // Sequence
  val seqSample = Seq(1, 2, 3, 4, 3, 2, 3, 4, 5)
  println(seqSample.mkString(","))

  // Sequence search
  println(seqSample indexOf 3)
  println(seqSample lastIndexOf 3)
  println(seqSample indexOfSlice Seq(2, 3))
  println(seqSample lastIndexOfSlice Seq(2, 3))
  println(seqSample indexWhere(_ == 2))

  // Add
  println((10 +: seqSample).mkString(","))
  println((seqSample :+ 100).mkString(","))

}
