import oops.Box

fun main() {

    val box1 = Box(1,2,3)
    val box2 = Box()

    println("Height :${box1.height}")
    println("length :${box1.length}")
    println("width :${box1.width}")

    box1.open()
    box1.fillContents()
    box1.close()

    println("volume : ${box1.volume}")

    box1.boxName = "My Box"
    println("Box Name is : ${box1.boxName}")
}