package oops

/*
     We can have both abstract and non-abstract functions and variables inside the abstract class.

     Abstract classes are used if we want to provide different functions to different child classes.
 */
abstract class BaseCoffeeMachine2(
    private val price: Double,
    private val color: String
){

    abstract val brand: String

    abstract fun makeCoffee(type: String): String

    fun machineInfo(): String {
        return "Coffee Machine Details: \n" +
                "Price: $price\n" +
                "Color: $color\n"
    }
}