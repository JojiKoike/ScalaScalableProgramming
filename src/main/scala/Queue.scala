class Queue[T] (private val leading: List[T], private val trailing: List[T]) {

  private def mirror =
    if (leading.isEmpty)
      new Queue(trailing.reverse, Nil)
    else
      this

  def head: T = mirror.leading.head
  def tail: Queue[T] = {
    val q = mirror
    new Queue(q.trailing.tail, q.trailing)
  }
  def enqueue(x: T) =
    new Queue(leading, x :: trailing)
}
