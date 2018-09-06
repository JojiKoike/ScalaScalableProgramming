class LineElement(s: String) extends Element {

  override def contents: Array[String] = Array(s)
  override def width: Int = s.length
  override def height: Int = 1

}
