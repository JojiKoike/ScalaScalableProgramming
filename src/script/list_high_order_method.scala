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

