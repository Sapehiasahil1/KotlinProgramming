package oops.Inheritance

import oops.Inheritance.BaseCoffeeMachine

class PremiumCoffeeMachine(
    private val price: Double,
    private val color: String
) : BaseCoffeeMachine(price, color) {


}