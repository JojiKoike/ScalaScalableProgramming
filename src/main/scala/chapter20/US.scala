package chapter20

object US extends CurrencyZone {
  abstract class Dollar extends AbstractCurrency {
    override def designation: String = "USD"
  }
  type Currency = Dollar
  def make(cents: Long) = new Dollar {
    override val amount: Long = cents
  }

  val Cent = make(1)
  val Dollar = make(100)
  override val CurrencyUnit: Dollar = Dollar
}
