import scala.io.StdIn._
object InputTest extends App {
  val n = readLine.toInt
  for (i <- 0 until n) {
   val Array(a, b) = readLine.split(" ")
    println("hello = %s, world = %s".format(a, b))
  }
}
