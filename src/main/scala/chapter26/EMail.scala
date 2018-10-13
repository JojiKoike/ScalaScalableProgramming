package chapter26

object EMail {
  // Injection Method
  def apply(user: String, domain: String): String = user + "@" + domain

  // Extraction Method
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }
}
