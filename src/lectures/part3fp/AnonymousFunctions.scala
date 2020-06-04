package lectures.part3fp

object AnonymousFunctions extends App {

  //anonymous function(LAMBDA)
  val doubler = (x: Int) => x * 2

  //multiple params in a lambda
  val adder:(Int,Int) =>Int = (a: Int,b:Int) => a + b

  // no params
  val justDoSomething: () => Int = () => 3

  //careful
  println(justDoSomething) //function itself
  println(justDoSomething) // call

  // curly braces with lambdas

  val stringToInt = {(str:String) =>
    str.toInt
  }
  // MOAR syntactic sugar
  val niceIncrimenter: Int => Int = _ + 1 // equivalente a x => x + 1
  val niceAdder:(Int,Int) => Int = _ + _ // equivalente a (a,b)  => a + b




}
