trait Queue[T] {
  def head: T
  def tail: Queue[T]
  def enqueue(x: T): Queue[T]
}

object Queue {
  def apply[T](xs :T*) = new QueueImpl[T](xs.toList, Nil)

  private class QueueImpl[T](private val leading: List[T],
                               private val trailing: List[T]) extends Queue[T] {

    private def mirror: QueueImpl[T] =
      if (leading.isEmpty)
        new QueueImpl(trailing.reverse, Nil)
      else
        this

    def head: T = mirror.leading.head
    def tail: Queue[T] = {
      val q = mirror
      new QueueImpl(q.trailing.tail, q.trailing)
    }
    def enqueue(x: T) =
      new QueueImpl(leading, x :: trailing)
  }
}
