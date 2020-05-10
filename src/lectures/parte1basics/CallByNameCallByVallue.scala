package lectures.parte1basics

object CallByNameCallByVallue extends App {

  def calledByValue(x: Long):Unit ={
    println("by value: " + x) //166786090360500
    println("by value: " + x) //166786090360500
  }

  def calledByName(x: => Long):Unit ={
    println("by name: " + x) //System.nanoTime()
    println("by name: " + x) //System.nanoTime()
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int,y: => Int) = println(x)

  printFirst(34,infinite())

  // utilizando  call by name a função só vai ser ativado se for utilizada caso contrário não será executada.


  //Call by value:
  //value is computed before call
  //same value used everywhere


  //call by name
  //expression is passed literally
  //expression is evaluted at every use within

}
