// Args Of Functions In Kotlin
fun main() {
  // If No Argument Passed Default Arg Set 
  function1()
  // Named Args 
  function2(name = "Kotlin", roll = 1)
}

fun function1(name: String = "No Name") {
  println(name + '\n');
}

fun function2(name: String = "No Name", section: Char = 'A', roll: Byte = 12) {
  println("Name - $name\nSection - $section\nRoll No. - $roll");
}
