trait RationalTrait {
  val numerArg: Int
  val denomArg: Int
  require(denomArg != 0)
  private val g = gcd(numerArg, denomArg)
  val numer = numerArg / g
  val denom = denomArg / g
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  override def toString: String = numer + "/" + denom
}


object RationalTraitTest extends App {

  // Pre-Initialized Fields
  // 1. Unnamed Class Formula
  val rational = new {
    val numerArg = 1
    val denomArg = 2
  } with RationalTrait
  println(rational)

  // 2. Included in Object Definition
  object twoThirds extends {
    val numerArg = 2
    val denomArg = 3
  } with RationalTrait
  println(twoThirds)

  // 3. Included in Class Definition
  class RationalClass(n: Int, d: Int) extends {
    val numerArg = n
    val denomArg = d
  } with RationalTrait {
    def + (that: RationalClass) = new RationalClass(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  }
  val rationslClass = new RationalClass(2,5)
  println(rationslClass)
}
