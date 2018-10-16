package chapter32

import scala.concurrent.{Future, Promise}
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

  // Future - failed
  val failed = Future.failed(new Exception("bummer!"))
  println(failed.value)

  // Future - fromTry
  import scala.util.{Success, Failure}
  val fromTrySuccess = Future.fromTry(Success {21 + 21})
  println(fromTrySuccess.value)
  val fromTryFailure = Future.fromTry(Failure(new Exception("Bummer!!")))
  println(fromTryFailure.value)

  // Promise
  val pro = Promise[Int]
  val fut4 = pro.future
  println(fut4.value)
  pro.success(77)
  println(fut4.value)

  // filter
  val fut5 = Future { 88 }
  val valid = fut5.filter(res => res > 0)
  Thread.sleep(100)
  println(valid.value)

  // Collect
  val collect = fut5 collect { case res if res > 0 => res + 46}
  Thread.sleep(100)
  println(collect.value)

  // failed
  val failure = Future {42 / 0}
  Thread.sleep(100)
  println(failure.value)
  val expectedFailure = failure.failed
  Thread.sleep(100)
  println(expectedFailure.value)

  // fallbackTo
  val success = Future { 42 / 1}
  Thread.sleep(100)
  println(success.value)
  val fallback = failure.fallbackTo(success)
  Thread.sleep(100)
  println(fallback.value)

  // recover
  val failedFallback = failure.fallbackTo(
    Future { val res = 42; require(res < 0); res}
  )
  Thread.sleep(100)
  println(failedFallback.value)
  val recovered = failedFallback.recover{
    case ex: ArithmeticException => -1
  }
  Thread.sleep(100)
  println(recovered.value)
  val alsoRecovered = failedFallback.recoverWith{
    case ex: ArithmeticException => Future { 88 + 77 }
  }
  Thread.sleep(100)
  println(alsoRecovered.value)

  // transform
  val first = success.transform(
    res => res * -1,
    ex => new Exception("see cause", ex)
  )
  Thread.sleep(100)
  println(first.value)
  val second = failure.transform(
    res => res * -1,
    ex => new Exception("see cause", ex)
  )
  Thread.sleep(100)
  println(second.value)

}
