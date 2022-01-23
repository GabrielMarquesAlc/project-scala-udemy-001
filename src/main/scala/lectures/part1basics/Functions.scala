package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {

  def aConcatenetedFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aConcatenetedFunction("hello", 3))

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " " + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))
  //QUANDO FOR NECESSÁRIO O USO DE LOOPS, UTILIZE RECURSIVIDADE

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  // 1. A greeting function (name, age) => "Hi, my name is $Name and i am $age years old"
  def aGreetingFunction(name: String, age: Int) = println(s"Hi, my name is $name and i am $age years old")

  //2 . factorial funcion
  def aFactorialFunction(value: Int): Int = {
    if (value <= 0) 1
    else value * aFactorialFunction(value - 1)
  }

  //3. fibonacci scale
  def asFunctionFibonacci(n: Int): Int = {
    if (n <= 2) 1
    else asFunctionFibonacci(n - 1) + asFunctionFibonacci(n - 2)
  }

  //3. teste if a nunber is prime
  def asTestNumberIsPrime(n: Int): String = {
    if ((n % 2) == 0) "Is not a prime"
    else "Is a prime"
  }

  def anotherFactorialFunction(n: Int): BigInt ={
      def factHelper(x: Int, acummulator: BigInt): BigInt = {
        if (x <= 1) acummulator
        else factHelper(x - 1, x * acummulator)
        }

        factHelper(n, 1)
  }

  println(anotherFactorialFunction(10));

}
