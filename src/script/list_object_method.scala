// apply
println(List.apply(1,2,3))

// range
println(List.range(1,5))
println(List.range(1, 9, 2))
println(List.range(9, 1, -3))

// fill : all elements are filled with same value
println(List.fill(5)('a'))
println(List.fill(3)("Hello"))
println(List.fill(2, 2)("Test"))

// tabulate : all elements are filled with the value calculated by specified function
println(List.tabulate(5)(n => n * n))
println(List.tabulate(5,5)(_ * _))

// concat
println(List.concat(List('a', 'b') , List('c')))
println(List.concat(List(), List('b'), List('c')))

// Handling Multiple Lists
println((List(10, 20), List(3,4,5)).zipped.map(_ * _))
println((List("abc", "ef"), List(3, 2)).zipped.forall(_.length == _))
println((List("aaa", "bb"), List(3, 2)).zipped.exists(_.length != _))
