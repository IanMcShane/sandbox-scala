package readers

import scala.io.Source

object FileReader {
  def loadFile(filePath: String) = Source.fromURL(getClass.getResource(filePath)).bufferedReader()
}
