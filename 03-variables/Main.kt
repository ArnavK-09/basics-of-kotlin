// Variables

/* TIP:-
    Naming Convention –
        + Every variable should be named using lowerCamelCase.
 */

fun main(){
    /* Immutable variables */
    val imImmutable: Boolean = true;

    // Proof
    try {
        // imImmutable = false; // throw err 
    }
    catch(e: Exception) {
        println("Err! $e")
    } finally {
        println("Value of imImmutable, + $imImmutable")
    }

    /* mutable variables */
    var mutable: Boolean = false;

    // Proof
    try {
        mutable = true; // will change value
    }
    catch(e: Exception) {
        println("Wait what")
    } finally {
        println("Changed value of mutable, + $mutable")
    }
}