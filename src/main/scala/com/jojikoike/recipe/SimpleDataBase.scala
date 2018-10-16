package com.jojikoike.recipe

object SimpleDataBase extends Database {
  def allFoods = List(Apple, Orange, Cream, Sugar)
  def allRecipes: List[Recipe] = List(FruitSalad)
  private var categories = List(
    FoodCategory("fruits", List(Apple, Orange)),
    FoodCategory("misc", List(Cream, Sugar))
  )
  override def allCategories: List[FoodCategory] = categories
}
