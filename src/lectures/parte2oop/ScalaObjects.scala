package lectures.parte2oop

object ScalaObjects extends App {

  object Person { //type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2

    def canFly: Boolean = false

    //factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")


  }

  class Person(val name: String) {
    //instance-level functionality

  }
  println("0---------------")
  println(Person.N_EYES)
  println(Person.canFly)

  println("1---------------")

  // Scala object = Singleton instance

  val mary = new Person("Mary")
  val john = new Person("John")

  println(mary == john)

  println("2---------------")
  val person1= Person
  val person2= Person

  println(person1 == person2)


  val bobbie = Person(mary,john)

  // Scala Application = Scala object with
  // def main(args: Array[String]): Unit



}
