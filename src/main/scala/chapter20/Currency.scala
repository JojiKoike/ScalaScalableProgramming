package chapter20

import chapter20.US.CurrencyUnit

abstract class CurrencyZone {
  type Currency <: AbstractCurrency
  def make(amount: Long): Currency
  val CurrencyUnit: Currency

  abstract class AbstractCurrency {
    val amount: Long
    def designation: String
    def + (that: Currency): Currency = make(this.amount + that.amount)
    def - (that: Currency): Currency = make(this.amount - that.amount)
    def * (x: Double): Currency = make((this.amount * x).toLong)
    def / (that: Currency): Double = this.amount.toDouble / that.amount
    def from(other: CurrencyZone#AbstractCurrency): Currency =
      make(math.round(
        other.amount.toDouble * Converter.exchangeRate(other.designation)(this.designation)
      ))
    private def decimals(n: Long): Int =
      if (n == 1) 0  else 1 + decimals(n /10)
    override def toString: String =
      ((amount.toDouble / CurrencyUnit.amount.toDouble)
        formatted("%." + decimals(CurrencyUnit.amount) + "f") + " " + designation)
  }
}

object CurrencyTest extends App {
  println(Japan.Yen.from(US.Dollar * 100))
  println(Europe.Euro.from(US.Dollar * 100))
  println(US.Dollar.from(Europe.Euro * 100))
  println(US.Dollar * 100 + (US.Dollar * 100))
}
