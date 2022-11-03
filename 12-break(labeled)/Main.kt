// Labeled Break In @Kotlin
fun main() {
    // variables 
    var x: Int = 1;
    var target: Int = 10;
    var toBeBreaked: Boolean = true;


    // outer while
    first@ while(x < target) {
        // inner while 
        second@ while(x == 6) {
            // break if checked 
            if(toBeBreaked == true) {
                println("\n🛑 Breaking.....@first");
                break@first;
            };
        };

        // x log
        println("Value Of X is $x!");
        

        // increasing x 
        ++x;
    }
};