package oops.ExtensionFunction

/*
    Extension functions are used when we need to add more functionality to the class, but the class is not
    own by us.

    So inorder to add the functionality for our purpose we can create the extension function as described
    below.
 */

fun String.getAllWords(): List<String> {

    return this.split(" ")
}
fun main() {

    val a: String = "How are you ?"
    val words = a.getAllWords()
    println(words)

}