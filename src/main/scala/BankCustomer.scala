object BankCustomer extends App {
  val account = new BankAccount
  account deposit(100)
  println(account.balance)
}
