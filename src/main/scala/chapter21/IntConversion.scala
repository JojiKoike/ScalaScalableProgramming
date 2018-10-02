package chapter21

object IntConversion extends App {

  // Int -> String
  implicit def intToString(x: Int): String = x.toString
  val intString: String = 1
  println(intString)

  // Double -> Int
  implicit def doubleToInt(x: Double): Int = x.toInt
  val intValue :Int = 3.3333
  println(intValue)

  // Int -> Double
  implicit def intToDouble(x: Int): Double = x.toDouble
  val doubleValue :Double = 12345
  println(doubleValue)
}
