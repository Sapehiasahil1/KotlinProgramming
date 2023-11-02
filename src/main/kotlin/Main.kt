import oops.BaseCoffeeMachine
import oops.Box
import oops.PremiumCoffeeMachine
import oops.PremiumCoffeeMachine2

fun main() {

//    val box1 = Box(1,2,3)
//    val box2 = Box()
//
//    println("Height :${box1.height}")
//    println("length :${box1.length}")
//    println("width :${box1.width}")
//
//    box1.open()
//    box1.fillContents()
//    box1.close()
//
//    println("volume : ${box1.volume}")
//
//    box1.boxName = "My Box"
//    println("Box Name is : ${box1.boxName}")
//
//    val coffeeMachine = BaseCoffeeMachine(1000.0, "BLACK")
//    coffeeMachine.makeCoffee()

//    val coffeeMachine = PremiumCoffeeMachine(5000.0,"BROWN")
//    coffeeMachine.makeCoffee()

    val coffeeMachine = PremiumCoffeeMachine2(5900.0, "BROWN")
    val info = coffeeMachine.machineInfo()
    val coffee = coffeeMachine.makeCoffee("CAPPUCCINO")
    println(coffee)
    println(info)

}