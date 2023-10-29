package oops

// Primary Constructor
class Box constructor( // We can omit the constructor if we don't have any visibility modifier.
    val length: Int= 0,
    val width: Int= 0 ,
    val height: Int= 0
){

    init {
        println("Init block is called")
    }

    constructor() : this(0,0,0){
        println("Secondary constructor is called")
    }

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