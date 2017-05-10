package structural

/**
  * Created by osboxes on 15/04/17.
  */
object Application {

  def main(args: Array[String]): Unit = {
    var nazwa: String = "abc.json";
    val parser = new Parser();
    parser.parse(nazwa);

  }
}

class Parser {
  def selectParser(plik: String): Parser = {
    if (plik.endsWith("json")) {
      new JsonParser();

    }
    else {
      new CVSParser();

    }
  }

  def parse(plik: String): Unit = {
    selectParser(plik).parse(plik);
  }

}

class CVSParser extends Parser {

  override def parse(plik: String): Unit = {
    println("uzywa CVSParser");
  }

}

class JsonParser extends Parser {
  override def parse(plik: String): Unit = {
    println("uzywa json parser");
  }

}

