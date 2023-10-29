import oops.Box

fun main() {

    val box1 = Box()

    println("Height :${box1.height}")
    println("length :${box1.length}")
    println("width :${box1.width}")

    box1.open()
    box1.fillContents()
    box1.close()
}