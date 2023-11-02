package oops

/*
    Always remember that whenever we derive the abstract class, we need to either make the child class
    also abstract or we need to implement/override all the functions/variables inside the child class.
 */
class PremiumCoffeeMachine2(
    private val price: Double,
    private val color: String
): BaseCoffeeMachine2(price, color){
    override val brand: String
        get() = "Brand X"

    override fun makeCoffee(type: String): String {
        return "Your $type is ready☕"
    }
}