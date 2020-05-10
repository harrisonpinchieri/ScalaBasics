package lectures.parte1basics

import scala.annotation.tailrec

object Recursion extends  App {

  def factorial(n:Int):Int ={
    if (n <=1) 1
    else {
      println("Computing factorial of " + n + "- I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }
  }
  //println(factorial(5000))

  def anotherFactorial(n:Int):BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x -1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression

      factHelper(n,1)
    }

  /*
  anotherfactorial(10) = facthelper(10,1)
  = facthelper(9, 10*1)
  = facthelper(8,9 * 10 * 1)
  = facthelper(7,8*9*10*1)
  =facthelper(6, 7*8*9*10*1)
    ...
  facthelper (2, 3*4*5.. 10* 1)
  =facthelper ( 1, 1*2*3...*10
   */



  println(anotherFactorial(5000))


// when you need loops, use _TAIL_ RECURSION.

  /*
  1. Concatenate a string  n times
  2. isprime function tail recursive
  3. fibonacci function, tail recursive
   */


//1
  @tailrec
  def concatenateTailrec(asString: String, n: Int, accumulator: String): String =
    if(n<=0) accumulator
    else concatenateTailrec(asString, n-1, asString + accumulator)

  println(concatenateTailrec("hello ",3,""))


  def isPrime(n:Int): Boolean ={
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean):Boolean =
      if (!isStillPrime) false
      else if (t <= 1 ) true
      else isPrimeTailrec(t -1,n % t != 0 && isStillPrime)

    isPrimeTailrec( n/2,true)
  }

  println(isPrime(2003))
  println(isPrime(629))


  def fibonacci (n: Int):Int = {
    def fiboTailrec(i: Int,last:Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailrec( i + 1, last + nextToLast,last)
    if (n <=2) 1
    else fiboTailrec(2,1,1)

  }
println(fibonacci(8))
}
