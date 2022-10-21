// Operators in kotlin
var a = 10;
var b = 43;
var c = false;

// main 
fun main() {
    // Arithmetic Operators
    println("\nArithmetic Operators In Kotlin\n");
    println("Addition | a + b = ${a + b}"); // a.plus(b)
    println("Subtraction | a - b = ${a - b}"); // a.minus(b)
    println("Multiplication | a * b = ${a * b}"); // a.times(b)
    println("Division | a / b = ${a / b}"); // a.div(b)
    println("Remainder | a % b = ${a % b}"); // a.rem(b)

    // Comparing Operators
    println("\nComparing Operators In Kotlin\n");
    println("Greater Than | a > b = ${a > b}"); // a.compareTo(b) > 0
    println("Less Than | a < b = ${a < b}"); // a.compareTo(b) < 0
    println("Greater Than Or Equal To | a >= b = ${a >= b}"); // a.compareTo(b) >= 0
    println("Less Than Or Equal To | a <= b = ${a <= b}"); // a.compareTo(b) <= 0
    println("Equal To | a == b = ${a == b}"); // Strict
    println("Not Equal To | a != b = ${a != b}"); // Strict

    // Unary Operators
    println("\nUnary Operators In Kotlin\n");
    println("Increase | ++a or a++ = ${++a}"); // a.inc()
    println("Descrease | --b or b-- = ${--b}"); // b.dec()

    // Logical Operators
    println("\nLogical Operators In Kotlin\n");
    
    if(c && true) {
        println("&& Operator = if all expressions true");
    }; if(c || true) {
        println("|| Operator = if any one expression is true");
    }; if(!c) {
        println("! Operator = return complement of the expression "); //a.not()
    }

    /* Bitwise & Assigment Operators lATER */
}