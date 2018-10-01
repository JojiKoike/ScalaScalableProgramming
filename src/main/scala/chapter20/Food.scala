package chapter20

class Food
abstract class Animal{
  // SuitableFood is Sut Type of Food
  type SuitableFood <: Food
  def eat(food: SuitableFood)
}

class Grass extends Food
class Cow extends Animal {
  // Define Actual SuitableFood Type
  override type SuitableFood = Grass
  override def eat(food: Grass): Unit = {}
}
