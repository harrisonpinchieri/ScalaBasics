package exercises

object OOExercicio extends App {


  val author = new writer("harrison","pinchieri",1991)
  val novel = new novel("lord of the rings",2020,author)


  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc.print
  counter.inc(3).print


}
//1
class writer ( firstname:String, surname:String,val year:Int ){

  def fullname(): String ={
    firstname + " " + surname
  }
}

class novel (name:String,yearOfRelease:Int,author:writer){

  def authorAge = yearOfRelease - author.year

  def isWrittenBy(author:writer) = author == this.author

  def copy(newYear: Int): novel = new novel(name,newYear,author)
}//2-----------------------------------------------------------------------------------------

class Counter(val count:Int = 0){

  def inc= {
    println("incrementing")
    new Counter(count +1)
  }

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n:Int):Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
     // new Counter(count + n)
  }

  def dec(n:Int) : Counter = {
    if(n <= 0) this
    else dec.dec(n-1)
    //new Counter(count - n)
  }

  def print = println(count)




}
