import scala.io.StdIn._
object HelloWorld extends App {
  val n = readLine.toInt
  for (i <- 0 until n) {
    val Array(a, b) = readLine.split(",")
    println("Hello = %s world = %s".format(a, b))
  }
}
