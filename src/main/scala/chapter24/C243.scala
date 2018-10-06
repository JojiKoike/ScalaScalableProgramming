package chapter24

object C243 extends App {

  val traversableSample = Traversable(1,2,3,4,5)

  // foreach
  traversableSample.foreach(print)
  println()

  // ++ & mkString
  val traversableSample2 = Traversable(6,7,8,9,10)
  println((traversableSample ++ traversableSample2).mkString(","))

  // map
  println(traversableSample.map(_ * 2).mkString(","))

  // flatMap
  println(traversableSample flatMap(_.toString))

  // head
  println(traversableSample.head)

  // headOption
  println(traversableSample.headOption)

  // last
  println(traversableSample.last)

  // lastOption
  println(traversableSample.lastOption)

  // find
  println(traversableSample.find(_ == 1))
  println(traversableSample.find(_ == 100))

  // tail
  println(traversableSample.tail.mkString(","))

  // init
  println(traversableSample.init.mkString(","))

  // slice
  println(traversableSample.slice(2,4).mkString(","))

  // take
  println(traversableSample.take(3).mkString(","))

  // drop
  println(traversableSample.drop(3).mkString(","))

  // groupBy
  case class Sale(itemCode: Int, number: Int)
  val saleList = Sale(1,2) :: Sale(1,3) :: Sale(2,4) :: Sale(2,6) :: Sale(3,1) :: Sale(3,3) :: Nil
  println(saleList.groupBy(_.itemCode).mkString(","))
  println(saleList.groupBy(_.itemCode).mapValues(_.foldLeft(0)(_ + _.number)))
  val traversableSample3 = Traversable(1,2,2,3,3,4,4,4,5,5,5,6)
  println(traversableSample3.groupBy(_ > 3).mkString(","))

  // forall
  println(traversableSample.forall(_ > 0))

  // exists
  println(traversableSample.exists(_ == 2))
  println(traversableSample.exists(_ == 1000))

  // sum, product, min, max
  println(traversableSample.sum)
  println(traversableSample.product)
  println(traversableSample.max)
  println(traversableSample.min)

  // view
  println(traversableSample.view.mkString(","))
  println(traversableSample.view(2,4).mkString(","))
}
