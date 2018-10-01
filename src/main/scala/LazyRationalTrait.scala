trait LazyRationalTrait {
  val numerArg: Int
  val denomArg: Int

  // Lazy Initialized Params
  lazy val numer = numerArg / g
  lazy val denom = denomArg / g
  private lazy val g = {
    require(denomArg != 0)
    gcd(numerArg, denomArg)
  }

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
  override def toString: String = numer + "/" + denom
}

object LazyRationalTest extends App {
  val x = 2
  println(new LazyRationalTrait {
    override val numerArg: Int = 1 * x
    override val denomArg: Int = 2 * x
  })
}
