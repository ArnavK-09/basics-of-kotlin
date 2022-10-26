// For loops in kotlin 
fun main() {
    /* Simple For Loop */
    for(i in 0..5) { // ..
        println("Simple Loop: $i")
    }

    println("")

    for(i in 5..0) {
        // Wil not print anything
        print("$");
    }; for(i in 5 downTo 0) { // use downTo
        println("Down to $i")
    }

    println("")

    for(i in 1..10 step 3) {
        println("Step in loops: $i");
    }
    
    println("")

    /* With array */
    val mouseArray = arrayOf("Jinmy", "Jimmy", "Jinny", "Jimny");
    for((index, mouse) in mouseArray.withIndex()) {
        println("Killed Mouse#${index + 1} ($mouse)")
    }

    println("")

    /* With String */
    val testString = "Killed All Mouses";
    for(letter in testString) {
        print("$letter ")
    };

    println("")

    for(indexOfletter in testString.indices) {
        print("$indexOfletter ")
    }
}