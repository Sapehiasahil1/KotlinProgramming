package oops

class Box {

    val length: Int =10
    val width: Int = 20
    val height: Int = 5

    fun fillContents(){
        println("Box Filled")
    }

    fun open() {
        println("Box Opened")
    }

    fun close() {
        println("Box Close")
    }

    val volume
        get() = length*width*height

    // val cannot have setters because val's are immutable.

    var boxName: String = "Box Name"
        set(value) {
            if(value.length <3) {
                println("Name cannot be less than 3 characters")
            } else {
                field = value
            }
        }
}