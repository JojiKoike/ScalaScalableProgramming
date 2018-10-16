package com.jojikoike.recipe

object Tester extends App {
  val apple = SimpleDataBase.foodNamed("Apple").get
  println(apple)
}
