// Type conversion in kotlin
fun main() {
    // Variables types 
    var longNo: Long = 434344L;
    var intNo: Int = 10101;
    var shortNo: Short = 100;
    var floatNo: Float = 666.7F;
    var doubleNo: Double = 28379.3434;
    var byteNo: Byte = 16;

    // Heading
    println("\nConversion Methods:-");

    // Conversion Methods
    println(".toByte() - ${intNo.toByte()}");
    println(".toShort() - ${longNo.toShort()}");
    println(".toFloat() - ${byteNo.toFloat()}");
    println(".toDouble() - ${shortNo.toDouble()}");
    println(".toInt() - ${floatNo.toInt()}");
    println(".toLong() - ${doubleNo.toLong()}");
}