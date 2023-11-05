package oops.EnumClass

//Enum is used to represent the group of constants
//We cannot inherit abstract and open class in enum class
//we can only inherit from the interfaces.
enum class Color{
    RED,
    GREEN,
    BLUE
}

fun main() {

    println(Color.BLUE)
    println(Color.values().size)

    val color = Color.RED
    when(color) {

        Color.RED -> println("red")
        Color.BLUE -> println("blue")
        Color.GREEN -> println("green")
    }

}
