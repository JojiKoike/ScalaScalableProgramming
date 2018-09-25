import scala.collection.immutable.{TreeMap, TreeSet}
import scala.collection.mutable

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
val numbers = Map("i" -> 1, "ii" -> 2)
numbers.foreach(println)
(numbers + ("vi" -> 6)).foreach(println)
numbers.foreach(println)


// CountWords
def countWords(text: String): mutable.Map[String, Int] = {
  val counts = scala.collection.mutable.Map.empty[String, Int]
  for (rawWord <- text.split("[ ,!.]+")) {
    val word = rawWord.toLowerCase
    val oldCount =
      if (counts.contains(word)) counts(word)
      else 0
    counts += (word -> (oldCount + 1))
  }
  counts
}
countWords("See Spot run! Run, Spot. Run!").foreach(println)

// Sorted Set
val ts = TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5)
ts.foreach(print)
println
val cs = TreeSet('f', 'u', 'n')
cs.foreach(print)
println

// Sorted Map
var tm = TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x')
tm.foreach(println)
tm += (2 -> 'x')
tm.foreach(println)

// Initialize TreeSet using List
val colors = List("blue", "yellow", "red", "green")
val treeSet = TreeSet[String]() ++ colors
treeSet.foreach(println)

// Convert to Array or List
treeSet.toList.foreach(println)
treeSet.toArray.foreach(println)
