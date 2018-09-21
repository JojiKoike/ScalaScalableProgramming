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

