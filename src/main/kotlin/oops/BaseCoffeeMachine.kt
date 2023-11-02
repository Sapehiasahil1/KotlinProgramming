package oops

/*
By default, classes in kotlin are final, which means that they cannot be inherited by the subclasses.
In order to make the class allowable to get inherited by the other classes, we need to put an
"open" keyword in front of the class keyword.
 */
open class BaseCoffeeMachine(
    private val price: Double,
    private val color: String
) {

    fun makeCoffee() {
        println("Here is your coffee☕")
    }
}