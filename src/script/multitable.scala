def makeRawSeq(row: Int) =
  for (column <- 1 to 10) yield {
    val product = (row * column).toString
    val padding = " " * (4 - product.length)
    padding + product
  }

def makeRow(row: Int) = makeRawSeq(row).mkString

def multiTable() = {
  val tableSequence =
    for (row <- 1 to 10) yield makeRow(row)
  tableSequence.mkString("\n")
}

println(multiTable())
