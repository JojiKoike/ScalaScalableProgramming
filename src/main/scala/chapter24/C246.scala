package chapter24

object C246 extends App {

  // Set
  val fruit = Set("apple", "orange", "peach", "banana")
  println(fruit("peach"))
  println(fruit contains "peach")
  println(fruit("potato"))
  println(fruit contains "potato")
  println(Set("apple", "peach") subsetOf fruit)
  println(Set("potato", "apple") subsetOf fruit)


  // Append
  println((fruit + "mango").mkString(","))
  println(fruit.mkString(","))
  println((fruit + ("mango", "melon")).mkString(","))
  println(fruit.mkString(","))
  println((fruit ++ Set("mango", "melon", "pine")).mkString(","))
  println(fruit.mkString(","))

  // Remove
  println((fruit - "apple").mkString(","))
  println((fruit - ("apple", "orange", "peach")).mkString(","))
  println((fruit -- Seq("apple", "peach")).mkString(","))
  println(fruit.empty.mkString(","))


}
