object LazyInitializeDemoApp extends App {
  // Non Lazy Initializing
  object Demo {
    val x = {println("Initializing x"); "done"}
  }
  println(Demo)
  println()
  println(Demo.x)

  // Lazy Initializing
  object DemoLazy {
    lazy val x = {println("Lazy Initializing x"); "lazy done"}
  }
  println(DemoLazy)
  println()
  println(DemoLazy.x)
}
