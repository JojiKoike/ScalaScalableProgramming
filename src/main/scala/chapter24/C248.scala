package chapter24

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



}
