package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Gabriel",27)

  println(person.age)
  person.greet("Thiago")
  person.greet()
}

// Constructor
// When in the constructor have somethings name and type is are parameters, but "val" is a field the class
class Person(name: String, val age: Int = 0){
// body
  val x: Int = 2


  // is possible methods overloading, the compiler not confunding
  def greet(name: String): Unit = println(s"${this.name} say: Hi, $name")
  def greet(): Unit = println(s"Hi, i am $name")

  //multiple constructors
    def this(name: String) = this(name,0)
    def this() = this("Gabriel Marques")

}

///// EXERCISES
/*
  Novel and a Writer

  Writer: first name, surname, year
    - method fullname

  Novel: name, year of release, author
  - authorAge
  - isWrittenBy(author)
  - copy (new year of release) = new instance of Novel
 */
class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
 */
class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)  // immutability
  }

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter =
    if (n <= 0) this
    else dec.dec(n-1)

  def print = println(count)
}

// class parameters are NOT FIELDS
