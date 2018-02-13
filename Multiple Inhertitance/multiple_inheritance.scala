package Assignment_15

trait inherit {
  def surprise() { }
}

trait class1 extends inherit {
  override def surprise() { println("Bang!") }
}

trait class2 extends inherit {
  override def surprise() { println("It was unexpected") }
}

class CowboyArtist extends class1 with class2

object Main extends App {
  (new CowboyArtist()).surprise()
}

