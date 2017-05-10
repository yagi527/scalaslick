package structural ;
/**
  * Created by osboxes on 10/04/17.
  */
trait Reader {

  def read(): String
}

class InputReader () extends Reader {
  def read():String = {
    return scala.io.StdIn.readLine()
  }
}

class FileReader1 (plik:String) extends Reader {
  def read():String = {
    return scala.io.Source.fromFile(plik).mkString
  }
}

class UpperCaseReader (reader: Reader) extends Reader {
  override def read():String = {
    return reader.read().toUpperCase()
  }
}

class WhiteSpaceCleanReader (reader: Reader) extends Reader {
  override def read():String = {
    return reader.read().replaceAll("\\s+", "")
  }
}

