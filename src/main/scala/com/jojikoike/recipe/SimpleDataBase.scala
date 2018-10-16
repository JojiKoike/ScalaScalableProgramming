package com.jojikoike.recipe

object SimpleDataBase {

  def allFoods = List(Apple, Orange, Cream, Sugar)
  def foodNamed(name: String): Option[Food] =
    allFoods.find(_.name == name)
  def allRecipes: List[Recipe] = List(FruitSalad)
  def recipeNamed(name: String): Option[Recipe] =
    allRecipes.find(_.name == name)
}

object SimpleBrowser {
  def recipesUsing(food: Food) =
    SimpleDataBase.allRecipes.filter(recipe => recipe.ingredients.contains(food))
}
