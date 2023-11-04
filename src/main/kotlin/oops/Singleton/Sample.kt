package oops.Singleton

// The way to make the single instance of the class only in other languages.
class Manager private constructor() {

    companion object{
        private var instance: Manager? = null
//        fun getInstance() = synchronized(this) {
//            if(instance == null) {
//                instance = Manager()
//            }
//            instance
//        }

        operator fun invoke() = synchronized(this) {

            if(instance == null)
                instance = Manager()

            instance
        }
    }
}

// They are same as class but do not have constructors.
// We will get the single instance only and it is thread safe also.
object Manger1{

    init {
        println("Manager1 Initialized")
    }
}

fun main() {
//    println(Manager.getInstance())
//    println(Manager.getInstance())
//    println(Manager.getInstance())
//    println(Manager.getInstance())
//    println(Manager.getInstance())

    println(Manager())
    println(Manager())
    println(Manager())

    println(Manger1)
}