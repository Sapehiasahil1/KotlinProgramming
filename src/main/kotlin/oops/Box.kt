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
}