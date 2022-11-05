// Strings in Kotlin 
fun main() {
    // Creating Strings
    val emptyString = String();
    val filledString: String = "String...";
   	
    println(emptyString);
    println(filledString);
    
    // First letter index of string is 0
	println(filledString[0]);
    
    // String template 
    println("'EmptyString' length is ${emptyString.length}");

    // Get by index 
    println("Second Letter Of String is ${filledString.get(1)}")

    // only some string 
    println("SubSequence of String is ${filledString.subSequence(2, 6)}");

    // multiline + raw
    val multilineStr = """
    Hi
    hello\n
    multiline""";
    println(multilineStr);

    /* 
    \” : for double quote
    \r : for carriage return
    \n : for newline
    \’ : for single quote
    \\ : for backslash
    \t : for tab
    \b : for backspace
    */
    
}