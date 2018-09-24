// Immutable Set
val immutableSet = Set(1,2,3)
println(immutableSet)
val nums = Set(1,2,3)
println(nums)
println(nums + 5)
println(nums)
println(nums - 3)
println(nums)
println(nums.size)
println(nums.contains(3))

// Mutable Set
val mutableSet = scala.collection.mutable.Set(4,5,6)
mutableSet += 7
println(mutableSet)
val texts = scala.collection.mutable.Set.empty[String]
println(texts)
println(texts += "the")
println(texts)
println(texts -= "the")
println(texts)
println(texts ++= List("a", "b", "c", "d"))
println(texts)
println(texts.clear)
println(texts)

// Set Use Sample
val text = "See Spot run. Run, Spot. Run!"
val wordsArray = text.split("[ !,.]+")
val words = scala.collection.mutable.Set.empty[String]
for (word <- wordsArray)
  words += word.toLowerCase
println(words.mkString(","))

// Map
val map = scala.collection.mutable.Map.empty[String, Int]
map("hello") = 1
map("there") = 2
map.foreach(println)
for (key <- map.keys.toList) {
  println(map(key))
}
