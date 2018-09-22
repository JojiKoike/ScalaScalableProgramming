// List
val colors = List("red", "blue", "green")
println(colors)
println(colors.head)
println(colors.tail)

// Array
val fiveInts = new Array[Int](5)
fiveInts.foreach(print)
println
val oneToFive = Array(1,2,3,4,5)
oneToFive.foreach(print)
println
fiveInts(0) = oneToFive(4)
fiveInts.foreach(print)
println

// List Buffer
val buf = new scala.collection.mutable.ListBuffer[Int]
// Add Tail
buf += 1
buf += 2
buf.toList.foreach(print)
println
// Add Head
3 +=: buf
buf.toList.foreach(print)
println

// Array Buffer
val abuf = new scala.collection.mutable.ArrayBuffer[Int]()
abuf += 12
abuf += 15
abuf.toArray.foreach(print)
println
20 +=: abuf
abuf.toArray.foreach(print)
println
println(abuf.length)
println(abuf(1))

// StringOps
def hasUpperCase(s: String): Boolean = s.exists(_.isUpper)
println(hasUpperCase("Robert Frost"))
