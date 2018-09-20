// map
val sample = List(1, 2, 3)
println(sample.map(_ + 1).mkString(","))
val sample_str = List("1", "2", "3")
println(sample_str.map(_.toInt).map(_ + 2).mkString(","))
val words = List("the", "quick", "brown", "fox")
println(words.map(_.length))
println(words.map(_.toList))
println(words.map(_.reverse.mkString))
println(words.flatMap(_.toList))
println(List.range(1, 5).flatMap(
  i => List.range(1, i).map(j => (i, j))
))

// foreach
(for (i <- List.range(1, 5); j <- List.range(1, i)) yield (i, j)).foreach(print)
println
var sum = 0
List(1, 2, 3, 4, 5).foreach(sum += _)
println(sum)

// filter
println(List(1, 2, 3, 4, 5).filter(_ % 2 == 0))
println(words.filter(_.length == 3))
println(List(1, 2, 3, 4, 5).partition(_ % 2 == 0))
println(List(1, 2, 3, 4, 5).find(_ % 2 == 0))
println(List(1, 2, 3, 4, 5).find(_ <= 0))
println(List(1, 2, 3, -4, 5).takeWhile(_ > 0))
println(words.dropWhile(_.startsWith("t")))
println(List(1, 2, 3, -4, 5).span(_ > 0))

def hasZeroRow(m: List[List[Int]]): Boolean =
  m exists(row => row forall(_ == 0))
println(hasZeroRow(List(List(1,2,3), List(0,0,0), List(4,5,6))))

def sum(xs: List[Int]): Int = (0 /: xs) (_ + _)
println(sum(List(1,2,3,4,5)))

def product(xs: List[Int]): Int = (1 /: xs) (_ * _)
println(product(List(1,2,3,4,5)))
