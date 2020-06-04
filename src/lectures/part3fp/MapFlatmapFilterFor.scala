package lectures.part3fp

object MapFlatmapFilterFor extends App {

  val list = List(1,2,3)
  println(list.head)
  println(list.tail)

  //map
  println(list.map(_ + 1))
  println(list.map(_ + "é um número"))

  //filter
  println(list.filter(_ % 2 == 0))

  // flatmap
  val toPair = (x: Int) => List(x, x+1)
  println(list.flatMap(toPair))

  //print all combinations between two lists
  val numbers = List(1,2,3,4)
  val char = List('a','b','c','d')
  val colors = List("black", "white")

  //interating
  val combinations = numbers.filter(_ %2 ==0).flatMap(n => char.flatMap(c => colors.map(color => "" + c + n + color)))
  println(combinations)

  //foreach
  list.foreach(println)

  // for-comprehensions
  val forCombinations = for {
    n <- numbers if n %2 == 0
    c <- char
    color <- colors
  }yield "" + c + n + "-" + color
  println(forCombinations)

  for{
    n <- numbers

  }println(n)

  // syntax overload
  list.map(x =>
    x * 2
  )




}
