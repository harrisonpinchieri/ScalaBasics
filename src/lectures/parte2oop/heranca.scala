package lectures.parte2oop

object heranca extends App {

  class Animal{
    val creatureType = "wild"
  //  protected def eat = println("nomnom")
   def eat = println("nomnom")
  }

  class Cat extends Animal{

     def crunch = {
      eat
      println("chunh crunch")}


  }

  val cat = new Cat
  cat.crunch


  //construtores
  class Person(name: String, age: Int){
    def this(name: String)= this(name,0)

  }
  class Adult(name: String,age: Int, idCard :String) extends Person(name)

  //overriding

/*  class Dog extends Animal{
    override val creatureType: String = "domestic"
    override  def eat = println("crunch crunch")

  }*/
class Dog (override  val creatureType:String) extends Animal{

  override  def eat = {
    super.eat // vai referenciar na classe animal
    println("crunch crunch")
  }

}

  //override sobrescreve o o valor da super classe
  val dog = new Dog("k9")
  dog.eat
  println(dog.creatureType)
  println(cat.creatureType)

  // type substitution (broad: polimorfismo)
  println("------------")
  val unknowanimal: Animal = new Dog("k9")
  unknowanimal.eat
 println(unknowanimal.creatureType)

//overrind vs overloading

  //super




}
