package lectures.parte1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String ={
    a + " " + b
  }

  println(aFunction("Hello",3))

  def aParameterlessFunctions(): Int = 42
  println(aParameterlessFunctions())
  println(aParameterlessFunctions)

  def aRepeatedFunction(aString: String,n: Int): String={
    if (n==1) aString
    else aString + " " + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello",3))

  //QUANDO PRECISAR DE LOOPS, USE RECURSIVIDADE.
  // UMA DAS PIORES COISAS DE UM PROGRAMADOR SCALA É USAR CÓDIGO IMPERATIVO EM UMA SINTAXE SCALA

  def umafuncaoComEfeitosColaterais(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction (a: Int, b: Int): Int = a + b
    aSmallerFunction(n,n-1)
  }

  //exercícios

  def greetingFunction(name: String,age:Int): Unit={

    println(s"Hi, my name is $name and I am $age years old")

  }

  greetingFunction("harrison", 28)

 def fatorialFunction(n:Int):Int={
  if (n <= 0) 1
  else n * fatorialFunction(n-1)

 }

  def fibonacci (n: Int): Int =
    if ( n <= 2) 1
    else fibonacci( n-1) + fibonacci(n-2)


  def primo(n:Int): Boolean ={
    def isPrimeUntil(t:Int):Boolean =
      if (t <=1) true
      else n % t != 0 && isPrimeUntil(t-1)
      isPrimeUntil(n/2)

  }


}
