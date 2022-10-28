// While in Kotlin - Like switch in Javascript 
fun main() {
    // Variable 
    var switchVar = 2;
    var num: Any = 2.3F;
    
    // when 
    when(switchVar) {
        0 -> {
            println("Bulb is Off");
        }
        1 -> {
            println("Bulb is On");
        }
        else -> {
            println("Unknown State of Bulb");
        } // else can ALSO be removed
    }

    // changing value for testing 
    switchVar = 1;

    // combine when 
    when(switchVar) {
        0, 1, -> {
            println("Known State of Bulb");
        }
        else -> {
            println("Unknown State of Bulb");
        }
    }

    // Range when 
    when(num) {
        in 0..9 -> println("Single Digit Number");
        !in 0..9 -> println("Not A Single Number");
    }
    
    // Check type 
	when(num) {
        is Int -> println("Integer");
        is Float -> println("Float");
        else -> println("IDK")
    }

    // changed value for testing 
    num = 3

    // with filters 
    fun isOdd(no: Int) = no % 2 != 0;
    fun isEven(no: Int) = no % 2 == 0;

    when {
        isOdd(num) -> println("Num is Odd");
        isEven(num) -> println("Num is Even");
        else -> println("IDK what num is")
    }
    
    // when function 
	fun stringLengthUsingWhen(name: Any) = when(name) {
        is String -> {
            name.length
        } 
        else -> {
            "Not a string"
        }
    }
    
    println(stringLengthUsingWhen("Name"))
}