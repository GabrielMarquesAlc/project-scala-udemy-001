package lectures.part1basics

object Expressions extends App {

    val x = 1 + 2 //EXPRESSIONS
    println(x)
    println(99 + 12 * 11)
    //INSTRUCTIONS (DO) VS EXPRESSIONS (VALUE)
    val aCondition = true

    //if expression
    val aConditionedValue = if(aCondition) 5 else 3 /// isto eh uma expressao e nao uma instrução
    println(aConditionedValue)
    var i = 0
    val aWhile = while (i < 10){
      println(i)
      i += 1
    }

    //NEVER WRITE THIS AIGAN
    //EVERYTHING in Scala is an Expression!
    var aVariable = 2

    val aWeirdValue = (aVariable = 3) //Unit === void

    // Code Blocks
      val aCodeBlock ={
          val y = 2
          val z = y + 1

          if (z>2) "hello" else "goodbye"
      }
      //1. difference between "hello world" vs println ("hello world")?
      //  r. The diference this "hello world" is a literal something, but println("hello world"), is a Expression

     ///2.
     //   r. The value adquired for the Expression is a boolean (True), and other value the of second function a have a return for the number 42
      val someValue = {
          2 < 3
      }
      println(someValue)
      val someOtherValue = {
        if (someValue) 239 else 986
        42
      }
      println(someOtherValue)

}
