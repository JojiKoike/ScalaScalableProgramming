package com.jojikoike.recipe

object GotApples  {
  def main(args: Array[String]) = {
    val db: Database =
      if (args.length > 0) {
        if (args( 0 ) == "student") {
          StudentDatabase
        } else {
          SimpleDataBase
        }
      } else {
        SimpleDataBase
      }
    object browser extends Browser {
      override val database: Database = db
    }
    val apple = SimpleDataBase.foodNamed("Apple").get
    for (recipe <- browser.recipesUsing(apple))
      println(recipe)
  }
}
