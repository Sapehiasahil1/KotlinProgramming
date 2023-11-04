package oops.StandardDelegates

import kotlin.properties.Delegates

class StudentHeavy{

    init{
        println("Student Heavy is initialized")
    }
}

class Student{
    /*
        While creating the instance of the student class the instance of StudentHeavy will be directly
        created because we have created the instance in the student class, no matter we require the
        instance or not.
     */
//    val heavy = StudentHeavy()

    /*
    The second method to do this is using Kotlin in-built delegate function -->> lazy <<--
    Reasons:-
    1. This will only create the instance when required.
    2. Used where creating instance of the class is a heavy process.
    3. If we call the multiple instances than also the instance will be created only once.
     */

    val heavy by lazy{
        StudentHeavy()
    }

    /*
    The second delegate is --> Observable <-- which is used when we want to observe the changes.
     */

    var marks by Delegates.observable(50){property, oldValue, newValue ->

        println("Old Value $oldValue")
        println("New Value $newValue")
    }

    /*
    The third delegate is --> Vetoable <-- which is used to put the assignment restrictions.
     */

    var age: Int by Delegates.vetoable(15){property, oldValue, newValue ->

        println("Old Value $oldValue")
        println("New Value $newValue")

        newValue > 15 // This is the condition, if it is true than only the value of age will change unless it will not change
    }
}

fun main() {
    /*
    If i will only create the instance of the Student class than the instance of the StudentHeavy class
    will not be created. because it is not required.

    But if I access the heavy variable than the instance will be created because we are accessing it.
     */
    val student = Student()
    student.heavy

    student.marks = 70
    student.marks = 80

    student.age = 14    // assignment not successful because it does not match the condition.
    student.age = 13    // assignment not successful because it does not match the condition.
    student.age = 45

}