// Dataypes in Kotlin
fun main() {
    /* Integer */
    
    // Byte
    val maxByte: Byte = Byte.MAX_VALUE;
    val minByte: Byte = Byte.MIN_VALUE;
    val exampleByte: Byte = 68;

    println("\nByte Integer Type:-\n+ Min - $minByte\n+ Max - $maxByte\n+ Bits - ${8} Bits\n+ Example - $exampleByte");
    
    // Short
    val maxShort: Short = Short.MAX_VALUE;
    val minShort: Short = Short.MIN_VALUE;
    val exampleShort: Short = 2000;

    println("\nShort Integer Type:-\n+ Min - $minShort\n+ Max - $maxShort\n+ Bits - ${16} Bits\n+ Example - $exampleShort");

    // Integer
    val maxInt: Int = Int.MAX_VALUE;
    val minInt: Int = Int.MIN_VALUE;
    val exampleInt: Int = 2000;
    
    println("\nInt Integer Type:-\n+ Min - $minInt\n+ Max - $maxInt\n+ Bits - ${32} Bits\n+ Example - $exampleInt");

        
    // Long
    val maxLong: Long = Long.MAX_VALUE;
    val minLong: Long = Long.MIN_VALUE;
    val exampleLong: Long = 12345678L;
    
    println("\nLong Integer Type:-\n+ Min - $minLong\n+ Max - $maxLong\n+ Bits - ${64} Bits\n+ Example - $exampleLong");

    // Floating
    val maxFloat: Float = Float.MAX_VALUE;
    val minFloat: Float = Float.MIN_VALUE;
    val exampleFloat: Float = 2.3F;

    println("\nFloat Integer Type:-\n+ Min - $minFloat\n+ Max - $maxFloat\n+ Bits - ${32} Bits\n+ Example - $exampleFloat");

    // Double - Bigger Float
    val maxDouble: Double = Double.MAX_VALUE;
    val minDouble: Double = Double.MIN_VALUE;
    val exampleDouble: Double = 5.123;

    println("\nDouble Integer Type:-\n+ Min - $minDouble\n+ Max - $maxDouble\n+ Bits - ${64} Bits\n+ Example - $exampleDouble");

    /* Other */

    // Boolean
    val positiveBoolean: Boolean = true;
    val negativeBoolean: Boolean = false;

    println("\nBoolean Type:-\n+ Positive - $positiveBoolean\n+ Negative - $negativeBoolean\n+ Bits - ${1} Bits");

    // Char - Alphabet only
    val exampleChar: Char = 'A';

    println("\nChar Type:-\n+ Example - $exampleChar\n+ Bits - ${16} Bits");

    /* Strings */
    val normalString: String = "\tString Worked!";
    val rawString: String = """Hello\nString\n  """.trimMargin(); // Trim spaces

    println("\nString Type:-\n+ Normal String - $normalString\n+ Raw String - $rawString")

    /*Arrays - Next Chapter */
}