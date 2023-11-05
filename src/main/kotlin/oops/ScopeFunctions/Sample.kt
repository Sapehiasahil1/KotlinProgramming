package oops.ScopeFunctions

class Square(
    private val width: Int, private val height: Int, private var color: String? = null, private var text: String? = null
) {
    fun fillColor(color: String) {
        this.color = color
        println("$color Color Filled")
    }

    fun addText(text: String) {
        this.text = text
        println("\"$text\" text added")
    }

    override fun toString(): String {
        return "Square(width=$width, height=$height, color=$color text=$text)"
    }
}

/*
Kotlin Scope Functions
+----------+----------------+----------------+
| Function | Context Object |  Return Value  |
+----------+----------------+----------------+
| let      | it             | lambda result  |
| run      | this           | lambda result  |
| with     | this           | lambda result  |
| apply    | this           | context object |
| also     | it             | context object |
+----------+----------------+----------------+
*/

// lateinit var square: Square

fun main() {

//    val square1: Square? = null// square1 coming from some other place.

//    val square = Square(10,40).let {
//        square.fillColor("Red")
//        square.addText("Hello")
//        square
//    }
//     let function is also used for null saftey.
//    square1?.let { square = it }

//    val square = Square(10, 20).also {
//        it.fillColor("Black")
//        it.addText("Black Text")
//    }

//    val square = Square(10, 40).run {
//        fillColor("Red")
//        addText("Hello")
//        this
//    }

//    with is used if we have multiple functions inside the class so inorder to reduce the code we use with
//    val square = Square(10, 40)
//    with(square) {
//        fillColor("red")
//        addText("Hello")
//    }

//    apply is used to perform the initial configuration of the object
//    val square = Square(10, 40).apply {
//        fillColor("Black")
//        addText("Black")
//    }

//    also and apply both can be used to perform the initial configuration of the obejct
    val square = Square(10, 40).also {
        it.fillColor("Blue")
        it.addText("Hello")
    }
    println(square)
}