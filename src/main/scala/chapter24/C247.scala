package chapter24

object C247 extends App {

  // Immutable Map
  val immutableMap = Map("Japan" -> "Tokyo", "Canada" -> "Ottawa", "USA"->"NewYork", "France"->"Paris")

  // Lookup
  println(immutableMap get "Japan")
  println(immutableMap getOrElse("England", "None"))
  println(immutableMap contains "France")
  println(immutableMap contains "England")

  // Append and Update
  println(immutableMap + ("England" -> "London"))
  println(immutableMap + ("England" -> "London", "Russia" -> "Moscow"))

  // Remove
  println(immutableMap - "Japan")
  println(immutableMap - ("Japan", "Canada", "USA"))

  // SubCollection
  println(immutableMap.keys.mkString(","))
  println(immutableMap.keySet.mkString(","))
  println(immutableMap.keysIterator.mkString(","))
  println(immutableMap.values.mkString(","))
  println(immutableMap.valuesIterator.mkString(","))

  // Apply for Cache Implementation (Using Mutable Map)
  def f(x: String) = {
    println("taking my time.")
    Thread.sleep(1000)
    x.reverse
  }
  val cache = collection.mutable.Map[String, String]()

  def cachedF(s: String) = cache.getOrElseUpdate(s, f(s))
  cachedF("abc")
  println(cache("abc"))
  cachedF("abc")
  println(cache("abc"))

}
