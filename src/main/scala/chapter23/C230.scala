package chapter23

object C230 extends App {

  case class Person(name: String, isMale: Boolean, children: Person*)

  val lara = Person("Lara", false)
  val bob = Person("Bob", true)
  val julie = Person("Julie", false, lara, bob)
  val persons = List(lara, bob, julie)

  // filter
  println(persons.filter(p => !p.isMale)
    .flatMap(p => p.children.map(c => (p.name, c.name))))

  // withFilter
  println(persons.withFilter(!_.isMale)
    .flatMap(p => p.children.map(c => (p.name, c.name))))

  // for expression
  println(for (p <- persons; if !p.isMale; c <- p.children) yield (p.name, c.name))
}
