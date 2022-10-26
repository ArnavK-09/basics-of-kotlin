// Flow Control - If Else In Kotlin 
fun main() {
    /* If & Else */
    if(1==1) {
        println("'If' in kotlin triggered");
    } else {
        println("'else' in kotlin triggered");
    }

    /* If-Else as an variable */
    val num = 55;
    var isNumberPositive = if(num > 0) {
        true;
    } else {
        false;
    }
    println("If-Else as an variable : - $isNumberPositive");

    /* Else if */
    if(1==2) {
        println("'If' in kotlin triggered");
    } else if(1==1) {
        println("'else if' in kotlin triggered");
    } else {
        println("'else' in kotlin triggered");
    }

    /* Nested */
    val nestedIfElse= if(1==1) {
        if(1 > 0) {
            if(true == false) {
                "1 is Positive And True"
            } else {
                "1 is Positive But False"
            }
        } else {
            "1 is Negative"
        }
    } else {
        "Not Equal"
    }

    println("Nested If-Else:- $nestedIfElse")
}