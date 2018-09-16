/**
  * List Append
  * @param xs List[T]
  * @param ys List[T]
  * @tparam T
  * @return List[T]
  */
def append[T] (xs: List[T], ys: List[T]): List[T] =
  xs match {
    case List() => ys
    case x :: xs1 => x :: append(xs1, ys)
  }

append(List(), List(1,2,3)).foreach(print)
println()
append(List(1,2,3), List()).foreach(print)
println()
append(List(1,2,3), List(4,5,6)).foreach(print)

// Length
println("List Length = " + List(1,2,3,4).length)

// Access to List Tail
val abcde = List('a', 'b', 'c', 'd', 'e')
println("Last = " + abcde.last)
println("Init = " + abcde.init)

// Reverse List
println("Reversed = " + abcde.reverse)
println("Original = " + abcde)

/**
  * Custom List Reverse Function
  * @param xs List[T]
  * @tparam T
  * @return List[T]
  */
def rev[T] (xs: List[T]): List[T] = xs match {
  case List() => xs
  case x :: xs1 => rev(xs1) ::: List(x)
}
println("Test rev function =" + rev(abcde))

// Prefix and Suffix
println("take 2 = " + abcde.take(2))
println("drop 2 = " + abcde.drop(2))
println("splitAt 2 = " + abcde.splitAt(2))

// Select Element
println("apply 2 = " + abcde.apply(2))
println("abcde(2) = " + abcde(2))
println("indices = " + abcde.indices)

// Flatten
println("Flatten = " + List(List(1,2), List(3), List(), List(4,5)).flatten)

// Zipper
println("zip (Same Length) = " + abcde.indices.zip(abcde))
println("zip (Different Length) = " + abcde.zip(List(1,2,3)))
println("zip with index = " + abcde.zipWithIndex)
val zipped = abcde.zip(List(1,2,3))
println("unzip =" + zipped.unzip)

// Display List
println("toString = " + abcde.toString)
println("mkString with pre, sep, post = " + abcde.mkString("{", ",", "}"))
println("mkString with sep(,) = " + abcde.mkString(","))
println("mkString with sep() = " + abcde.mkString(""))
println("mkString with with no params = " + abcde.mkString)
val buf = new StringBuilder
println("addString = " + abcde.addString(buf, "(", ":", ")"))

// List Conversion
println("toArray = " + abcde.toArray.mkString("{", ",", "}"))
println("toList = " + abcde.toArray.toList)
val arr2 = new Array[Int](10)
List(1,2,3).copyToArray(arr2, 3)
println("copyToArray = " + arr2.mkString("{", ",", "}"))

// Iterator
val it = abcde.iterator
var index = 0
while (it.hasNext) {
  println("abcde[" + index + "] = " + it.next)
  index += 1
}
