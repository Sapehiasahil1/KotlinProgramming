package oops.NestedClass

class Box(val width: Int, val length: Int, val height: Int) {

     inner class Content(val content: String) {

         /*
            In order to access the parameters of the outer class from the nested class we
            need to put the inner keyword ahead of the the nested class
          */

         fun printBoxInfo() {
             println("$length $width $height")
         }
         fun printContent() {
             println(content)
         }
     }
}

fun main() {
//     So through this way we can create the instance of the nested class.
//     By the name of the outer class
//    val content = Box.Content("Here is the content")

//    But if we add an inner keyword in the nested class than we cannot access the inner class through
//    the class name, we need to first create the instance of the outer class and then call the inner class
//    from the instance of outer class

    val box = Box(10,10,10)
    val content = box.Content("Here is the content")
    content.printContent()
    content.printBoxInfo()
}