// Unlabbeled Continue in Kotlin 
fun main() {
    // variables 
    var num: Int = 0;

    //  infinite loop
    infiniteloop@ do {
        // increasing value 
        ++num;

        // if statement 
        if(num != 6) {
            println("Continue....Value Of Num is $num");
            continue;
        } else {
             println("\nBreaking....");
            break@infiniteloop
        }
    } while(true);
}