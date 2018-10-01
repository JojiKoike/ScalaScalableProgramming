package chapter20

object Color extends Enumeration {
  val Red, Green, Blue = Value
}

object Direction extends Enumeration {
  val North = Value("North")
  val East = Value("East")
  val South = Value("South")
  val West = Value("West")
}


object EnumerationTest extends App {

  def printEnumValues(enumeration : Enumeration) = {
    enumeration.values.foreach(value => {
      println(value.id + " : " + value)
    })
  }

  printEnumValues(Color)
  println()
  printEnumValues(Direction)
}
