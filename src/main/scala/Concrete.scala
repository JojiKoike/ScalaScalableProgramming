class Concrete extends Abstract {
  override type T = String

  override def transform(x: String): String = x + x

  override val initial: String = "hi"
  override val current: String = initial
}
