import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

val file = new FileReader("input.txt")
try {
  // Do Something
} catch {
  case ex: FileNotFoundException =>
    println("File Not Found")
  case ex: IOException =>
    println("IOException")
} finally {
  file.close()
}
