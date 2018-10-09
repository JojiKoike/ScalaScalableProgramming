package chapter24

import scala.collection.mutable

object C246 extends App {

  // Immutable Set
  // Test
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

  // Binomial Calculation
  println((fruit & Set("apple", "peach", "mango", "pine")).mkString(","))
  println((fruit intersect  Set("apple", "peach", "mango", "pine")).mkString(","))
  println((fruit | Set("apple", "peach", "mango", "pine")).mkString(","))
  println((fruit union Set("apple", "peach", "mango", "pine")).mkString(","))
  println((fruit &~ Set("apple", "peach", "mango", "pine")).mkString(","))
  println((fruit diff Set("apple", "peach", "mango", "pine")).mkString(","))

  // Mutable Set
  val numberSet = mutable.Set(1, 2, 3)

  // Append
  numberSet += 4
  numberSet += 1
  println(numberSet.mkString(","))
  numberSet += (4, 5, 6)
  println(numberSet.mkString(","))
  numberSet ++= Set(7, 8, 9)
  println(numberSet.mkString(","))
  println(numberSet add 10)
  println(numberSet.mkString(","))
  println(numberSet add 10)
  println(numberSet.mkString(","))

  // Remove
  numberSet -= 4
  println(numberSet.mkString(","))
  numberSet -= (4, 5, 6)
  println(numberSet.mkString(","))
  numberSet --= Set(7, 8, 9)
  println(numberSet.mkString(","))
  println(numberSet remove 10)
  println(numberSet.mkString(","))
  println(numberSet remove 10)

}
