var assertionsEnabled = true
def myAssert(predicate: () => Boolean): Unit =
  if (assertionsEnabled && !predicate())
    throw new AssertionError


def byNameAssert(predicate: => Boolean): Unit =
    if (assertionsEnabled && !predicate)
        throw new AssertionError


myAssert(() => 5 > 3)
byNameAssert(5 > 3)
