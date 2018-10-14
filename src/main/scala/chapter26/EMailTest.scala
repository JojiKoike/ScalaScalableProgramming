package chapter26

object EMailTest extends App {
  println(EMail.unapply("abc@cdef.com"))

  println(UpperCase.userTwiceUpper("DIDI@hotmail.com"))
  println(UpperCase.userTwiceUpper("DIDO@hotmail.com"))
  println(UpperCase.userTwiceUpper("didi@hotmail.com"))
}
