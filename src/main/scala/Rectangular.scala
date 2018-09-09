trait Rectangular {
  def topLeft: Point
  def bottomRight: Point
  def left: Int = topLeft.x
  def right: Int = bottomRight.x
  def width: Int = right - left
  def top: Int = topLeft.y
  def bottom: Int = bottomRight.y
  def height: Int = top - bottom
}
