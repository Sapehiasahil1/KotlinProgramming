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

    /*
    Visibility Modifiers :->
    1. public: Default, can be accessed everywhere
    2. internal: Available everywhere in the same module
    3. private : Available only inside the containing file or class.
    4. protected: Same as private but available inside subclasses or child classes

    **** **** ****
    For getters the visibility will depend upon the parent.
    For setters the visibility can be modified depending upon the requirement.
    */


}