package chapter20

object Japan extends CurrencyZone {
  abstract class Yen extends AbstractCurrency {
    override def designation: String = "JPY"
  }
  override type Currency = Yen

  override def make(yen: Long): Yen = new Yen {
    val amount = yen
  }
  val Yen = make( 1 )
  override val CurrencyUnit = Yen
}
