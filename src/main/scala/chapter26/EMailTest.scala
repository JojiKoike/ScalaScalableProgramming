package chapter26

object EMailTest extends App {
  println(EMail.unapply("abc@cdef.com"))

  println(UpperCase.userTwiceUpper("DIDI@hotmail.com"))
  println(UpperCase.userTwiceUpper("DIDO@hotmail.com"))
  println(UpperCase.userTwiceUpper("didi@hotmail.com"))

  def isTomInDotCom(s: String): Boolean = s match {
    case EMail("tom", Domain("com", _*)) => true
    case _ => false
  }

  println(isTomInDotCom("tom@sum.com"))

  val s = "tom@support.epfl.ch"
  val ExpandedEmail(name, topdom, subdoms @ _*) = s
  println(name)
  println(topdom)
  println(subdoms)
}
