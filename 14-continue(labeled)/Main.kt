// Unlabbeled Continue in Kotlin 
fun main() {
    // variables 
    var num: Int = 0;


    //  loop
    outerloop@ while (true) {
        innerloop@ do {
            // increasing value 
            ++num;
    
            // if statement 
            if(num != 6) {
                println("Continue....Value Of Num is $num");
                continue@innerloop;
            } else {
                 println("\nBreaking....");
                break@outerloop
            }
        } while(true);
    }
}