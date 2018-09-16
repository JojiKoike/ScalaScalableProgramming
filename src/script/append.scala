def append[T] (xs: List[T], ys: List[T]): List[T] =
  xs match {
    case List() => ys
    case x :: xs1 => x :: append(xs1, ys)
  }

append(List(), List(1,2,3)).foreach(print)
