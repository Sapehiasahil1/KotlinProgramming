package oops.PropertyDelegation

class Student {

    var firstName: String? by NameDelegate()
//        set(value) {
//            if(value != null && value.length >5) {
//                field = value.trim().uppercase()
//            }
//        }

    var lastName: String? by NameDelegate()
//        set(value) {
//            if(value != null && value.length >5) {
//                field = value.trim().uppercase()
//            }
//        }

    override fun toString(): String {
        return "$firstName $lastName"
    }
}