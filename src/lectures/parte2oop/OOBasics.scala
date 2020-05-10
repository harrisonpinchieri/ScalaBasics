package lectures.parte2oop

import javax.print.attribute.standard.JobHoldUntil

object OOBasics extends App{

  val person = new Person("John",26)
  println(person.age)
  println(person.x)
  person.greet("Daniel")
  person.greet()

}

//constructor
class Person(name: String, val age:Int = 0){

  val x =2

  //metodo
  def greet(name: String):Unit = println(s"${this.name} says: Hi, $name")

  //overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors

  def this(name: String) = this(name,0)
  def this() = this("John Doe")
}

//class parameters are NOT FIELDS

