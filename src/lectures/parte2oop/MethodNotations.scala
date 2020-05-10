package lectures.parte2oop

object MethodNotations extends App {
  class Person(val name: String, favoriteMovie: String, val age: Int = 0){
    def likes(movie:String):Boolean = movie == favoriteMovie
    def +(person:Person):String = s"${this.name} is hanging out with ${person.name}"
   /*1*/def +(nickame:String):Person = new Person(s"$name ($nickame)",favoriteMovie,age)
    def unary_! :String = s"$name, what the heck?!"
   /*2*/def unary_+ : Person = new Person(name,favoriteMovie,age +1)
   /*3*/ def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this.learns("Scala") // ou this learns "Scala"


    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name  and I like $favoriteMovie"
    def apply(vezes: Int): String =s"$name watched $favoriteMovie $vezes times"
  }

  val mary = new Person("Mary", "Inception",20)
  println(mary.likes(("Inception")))
  println(mary likes "Inception") //equivalente
  //infix notation = operator notation

  //"operators" in Scala
  val tom = new Person("Tom", "Fight Club",25)
  //println(mary hangOutWith tom)
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS.

  // prefix notation
  val x = -1 //equivalent with 1.urnary_-
  val y = 1.unary_-
  //unary_prefix only works with - + - !

  println(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println((mary())) //equivalente


  //exercicios
//1 pverçpad tje + operator   | mary + "the rocketsar" => new person "Mary (the rockstar)"
  println("1")
  println((mary + "the Rockstar")())
  println((mary + "the Rockstar").apply())// mesmo efeito
//2 add an age to the person class, add a unary+ operator => new person with the age +1
  println("2")
  println((+mary).age)
  //3 add a "learns" method in the person class => "Mary learns Scala", add a learnsScala method, calls learns method with "Scala".
  println("3")
  println(mary learnsScala)

  //4 overload the apply method, mary.apply(2) => "mary whatec inception 2 times"
  println("4")
  println(mary.apply(2))
  //ou
  println(mary(10))
}
