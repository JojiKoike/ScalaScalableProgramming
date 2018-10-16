package chapter32

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object C322 extends App {

  // Future
  val fut = Future { Thread.sleep(1000); 21 + 21}
  println(fut.isCompleted)
  println(fut.value)
  Thread.sleep(1100)
  println(fut.isCompleted)
  println(fut.value)

  // Exception
  val fut1 = Future {Thread.sleep(1000); 21 / 0}
  println(fut1.value)
  Thread.sleep(1100)
  println(fut1.value)

  // Map
  val result = fut.map(x => x + 1)
  println(result.value)
  Thread.sleep(1100)
  println(result.value)

  // For
  val fut2 = Future {Thread.sleep(1000); 21 + 21}
  val fut3 = Future {Thread.sleep(1000); 23 + 23}
  val result1 = for {
    x <- fut2
    y <- fut3
  } yield x + y
  Thread.sleep(1100)
  println(result1)
}
