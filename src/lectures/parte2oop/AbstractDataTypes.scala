package lectures.parte2oop

object AbstractDataTypes extends App{

  //abstract
  abstract  class Animal{
    val creatureType: String
    def eat: Unit

  }

  class Dog extends Animal{
    override val creatureType: String = "Canino"
    def eat: Unit = println("crunch crunch")
  }

  //traits
  trait Carnivoro{
    def eat(animal: Animal):Unit
  }

  class Crocodilo extends Animal with Carnivoro{
    val creatureType: String = "croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"Eu sou um crocodilo e estou comendo ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodilo
  croc.eat(dog)



  /*diferença de traits e abastract classes

  1- traits não possui parametros de construtor
  2- multiplos traits  herdados pela mesma classe
  3 - a classe animal descreve o que é o animal e traits são o que eles fazem.
   */

}
