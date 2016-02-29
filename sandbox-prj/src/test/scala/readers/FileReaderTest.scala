package readers

import org.scalatest.{Matchers, FlatSpec}

class FileReaderTest extends FlatSpec with Matchers {


  "FileReader" should "return a Buffered Reader." in {
    val reader = FileReader.loadFile("/tweet.txt")

    reader.ready() should be (true)
    reader.readLine() should be ("Alan> If you have a procedure with 10 parameters, you probably missed some.")
  }
}
