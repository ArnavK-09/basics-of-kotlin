// Lambda functions in Kotlin 
fun main() {
  // simple
  val simple = {
    println("Yes")
  }
  simple()
  simple.invoke()

  // syntax 
  val add: (Int, Int) -> Int = {
    a,
    b -> a + b
  }

  println(add(3, 2))

  val addToo = {
    a: Int,
    b: Int -> a + b
  }

  println(addToo(2, 3))

  /*  
    val lambda1: (Int) -> Int = (a -> a * a)
    val lambda2: (String,String) -> String = { a , b -> a + b }
    val lambda3: (Int)-> Unit = {print(Int)}
   */

  // Class Extension Lambda | this - refers to string | it - refers to arg
  val lambdaCl: String.(Float) -> String = {
    this + it
  }

  println("Kotlin^".lambdaCl(1.7F))

  // filter 
  val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println("Numbers Divisible By 2:- " + numbers.filter {
    i -> i % 2 == 0
  })

  println("")

  /* Anonymous Function */

  // single line 
  val anonymousFunc1 = fun(a: Int, b: Int): Int = a + b;

  // bock 
  val anonymousFunc2 = fun(a: Int, b: Int): Int {
    return a + b;
  }
  
  println(anonymousFunc1(2, 3))
  println(anonymousFunc2(3, 2))

  /* From GeeksForGeeks:- 
      Difference between lambda expressions and anonymous functions-
      The only difference is the behavior of non-local returns. A return statement without a label always returns from the function declared with the fun keyword. 
      This means that a return inside a lambda expression will return from the enclosing function, whereas a return inside an anonymous function will return from the 
      anonymous function itself.
  */
}
