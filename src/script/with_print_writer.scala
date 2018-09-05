import java.io.{File, PrintWriter}


def withPrintWriter(file: File)(op: PrintWriter => Unit): Unit = {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}


withPrintWriter(new File("date.txt")) {
  writer => writer.println(new java.util.Date)
}
