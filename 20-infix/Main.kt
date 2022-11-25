// infix function -  infix keyword can also be called using infix notation means 
// calling without using parenthesis and dot
fun main() {
  // user defined infix function
	class TESTCLASS {
      // extension infix func 
      infix fun test(num: Int): Int {
          return num + num;
      }
   }
		
    // using infix
    val reply = TESTCLASS() test 3;
    println(reply)
}

/* Rules-
  It must be member function or extension function
  It must accepts a single parameter
  The parameter must not accept variable number of arguments and must have no default value
  It must be marked with infix keyword
*/
