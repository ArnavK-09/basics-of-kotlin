// While Loop In Kotlin 
fun main() {
    // Test variable 
    var count = 1;
    var target = 10;
    var subtractFrom = 10;
    var subtractHowMuch = 5;
    
    /* Simple while loop */ println("\nSimple while Loop:-\n");
    while(count < target + 1) {
        println("Count: $count");
        ++count
    }
    
    /* Do while Loop */ println("\nDo while Loop:-\n");
    do {
        println("Subtracted: $subtractFrom")
        --subtractFrom
        --subtractHowMuch
    } while(subtractHowMuch > -1)
}