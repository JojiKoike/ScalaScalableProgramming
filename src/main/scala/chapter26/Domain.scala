package chapter26

object Domain {

  // Injection Method (Optional)
  def apply(parts: String*): String =
    parts.reverse.mkString(",")

  // Extraction Method (Mandatory)
  def unapplySeq(whole: String): Option[Seq[String]] =
    Some(whole.split("\\.").reverse)
}
