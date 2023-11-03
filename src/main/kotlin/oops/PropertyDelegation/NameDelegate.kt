package oops.PropertyDelegation

import kotlin.reflect.KProperty

class NameDelegate {

    var formattedValue: String? = null

    operator fun setValue(
        thisRef: Any?,  // Calling Object
        property: KProperty<*>,
        value: String?
    ){
        if(value != null && value.length >5) {
            formattedValue = value.trim().uppercase()
        }
    }

    operator fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): String? {
        return formattedValue
    }
}
