package Assignment_15

class simple_inheritance {
 var val1 = "Hi... i am inherited from superclass"
}

class subclass extends simple_inheritance{
  var val2 = "Hi... i am from subclass"
  println(val1)
  println(val2)
}

object MainObject{
  def main(args:Array[String]){
    new subclass()
  }
}
