package chapter26

object UpperCase {
  def unapply(s: String): Boolean = s.toUpperCase == s

  def userTwiceUpper(s: String): String = s match {
    case EMail(Twice(x @ UpperCase()), domain) =>
      "match: " + x + " in domain " + domain
    case _ =>
      "no match"
  }
}
