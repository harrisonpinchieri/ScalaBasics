package lectures.parte2oop

object Generics extends App {

  class MyList[+A]{
    //use the type A
    def add[B >: A](element: B): MyList[B] = ???
    /*
    A= Cat
    B= Dog = Animal
    B= Animal, tem que retornar uma lista de animais.
     */
  }




  class MyMap[key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic methods
  object MyList{
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //yes List[Cat] extends List[Animals] = COVARIANCE
  class CovariantList[+A]
  val animal:Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  //animalList.add(new Dog) ??? HARD QUESTION. => we return a list of Animals

  //2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //3. Hell, no! CONTRAVARIANCE
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]


  // bounded types
  class Cage[A <: Animal] (animal: A)   // <: significa que só aceita subtipos de Animal
  val cage = new Cage(new Dog)

/*  class Cage[A <: Animal] (animal: A)    >: significa que só aceita supertipos de Animal
  val cage = new Cage(new Dog)*/

  class Car //Scala pode não indicar o erro porém ao executar, gera um erro dizendo que Car não é subtipo de Animal
  // generic typeneeds proper bounced type
 // val newCage = new Cage(new Car)

  //bounded types resolve problemas de invariance
}
