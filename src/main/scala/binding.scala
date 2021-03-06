import java.io.File
import scala.io.Source
class binding {

  val filesHere: Array[File] = new File(".").listFiles

  def grep(pattern: String): Unit = {
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + ": " + trimmed)
  }

  def scalaFiles: Array[File] =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file

  val forlineLengths: Array[Int] =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length

  private def fileLines(file: java.io.File): List[String] = {
    Source.fromFile(file).getLines().toList
  }
}
