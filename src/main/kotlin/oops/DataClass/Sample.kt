package oops.DataClass

/*
Data classes are used in order to store the data only.
 */

data class Person(
    val id: String,
    val firstName: String,
    val lastName: String,
    val country: String
) {
        fun getName() = "$firstName $lastName"
}

fun main() {

        val person = Person("1", "Sahil", "Sapehia", "India")
        val person1 = Person("1", "Sahil", "Sapehia", "India")
        val person2 = Person("1", "Sahil", "Sapehia", "India")

//        println(person == person1)
//        println(person2.getName())

        //componentN
//        println(person.component1())
//        println(person.component2())
//        println(person.component3())
//        println(person.component4())

        //destructing declaration
        val (id, firstName, lastName, country) = person

        println(id)
        println(firstName)
        println(lastName)
        println(country)
}