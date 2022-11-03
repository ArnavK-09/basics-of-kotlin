// Simple break 
fun main() {
    // variables 
    var x: Byte = 0;
    var target: Int = 16;

    // while loop for testing 
    while(x < target.toByte() + 1) {
        // printing value logs 
        println("Value Of X is $x!");

        // if meet req, will break 
        if(x == target.toByte()) {
            println("\n🛑 Breaking.....");
            // break 
            break;
        }

        // increasing count 
        ++x;
    }
}