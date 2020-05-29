package lectures.parte2oop

object classeAnonima extends App {

  abstract class Animal{
    def eat: Unit
  }

  //classe anonima
  val funnyAnimal: Animal = new Animal{
    override def eat: Unit = println("hahahahaha")
  }
  /*
   equivalente a:

  class AnonymousClasses$$anon$1 extends Animal {
    override def eat:Unit = println("hahahaha")
  }
  */
  println(funnyAnimal.getClass)


  class Person(name: String){
    def sayHi: Unit = println(s"hi , my name is $name, how can i help?")
  }

  val jim = new Person("Jim"){

    override def sayHi: Unit = println(s"Hi my name is Jim, how can i be of your service?")

  }

  println(jim)

}
