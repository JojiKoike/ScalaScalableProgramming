package chapter24

object C2414 extends App {

  def lazyMap[T, U](coll: Iterable[T], f: T => U) =
    new Iterable[U] {
      def iterator: Iterator[U] = coll.iterator.map(f)
    }

  val v = Vector(1 to 10: _*)
  println(v.mkString(","))
  // With Intermediate Vector
  println(v map (_ + 1) map (_ * 2) mkString ",")

  // Using View Reason 1 : Performance
  // Without Intermediate Vector (Using View)
  val vv = v.view
  val vvm = vv map (_ + 1)
  println(vvm)
  val vvmm = vvm map (_ * 2)
  println(vvmm)
  println(vvmm.force)

  // Using View Reason 2 : Mutable Sequence original benefit
  val arr = (0 to 9).toArray
  println(arr.mkString(","))
  val subarr = arr.view.slice(3, 6)
  println(subarr)

  def negate(xs: collection.mutable.Seq[Int]): Unit =
    for (i <- xs.indices) xs(i) = -xs(i)
  negate(subarr)
  println(arr.mkString(","))



}
