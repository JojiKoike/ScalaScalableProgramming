// Immutable Set
val immutableSet = Set(1,2,3)
println(immutableSet)

// Mutable Set
val mutableSet = scala.collection.mutable.Set(4,5,6)
mutableSet += 7
println(mutableSet)

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
map.keys.foreach(println)
map.values.foreach(println)
