package chapter20

object Europe extends CurrencyZone {

  abstract class Euro extends AbstractCurrency {
    override def designation: String = "EUR"
  }

  override type Currency = Euro

  override def make(cents: Long): Euro = new Euro {
    override val amount: Long = cents
  }
  val Cent = make(1)
  val Euro = make(100)
  override val CurrencyUnit = Euro
}
