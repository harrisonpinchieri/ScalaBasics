package lectures.parte1basics

object Expressions extends  App {

  val x = 1+2
  println(x)

  println( 2 + 3 * 4)
  // + - * / & | ^ << >> >>>

  println(1 == x)
  // == != > >= <  <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // tbm funciona com -= *= /=
  println(aVariable)

  //Instructions vs Expressions

  // IF expression
  println("hey")
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF expression
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1+3)

  // nunca escreva isso em scala
  var i = 0
  while (i < 10){
    println(i)
    i +=1
  }
 // scala é uma linguagem funcional e tudo é voltada para expressão loops são de linguagens imperativas.
  // tudo em scala é uma expressão

  //var umaVariavel = ???

  //val umValorestranho = (umaVariavel = 3) ///
  //println(umValorestranho)

  //side effects: println(), whiles, reassigning

  //code blocks

  val aCodeBlock = {

    val y =2
    val z = y +1
    if (z > 2) "Hello" else "goodbye"

  }

  // Instruções significa faça alguma coisa versus a expressão que signfica me dê o valor de  alguma coisa

  // NÃO USAR LOOPS WHILE NO SCALA!!!

  println("exercicios")

  //1 diferença entre "hello world" e println("hello world")
  // o hello world é do tipo string enquanto o println("hello world") é uma expressão que é um efeito colateral que retorna um unit


  val someValue = {
    2 < 3
  }//retorna um boleano

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

}
