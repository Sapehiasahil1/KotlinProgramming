package oops.Interface
/*
In interface, you cannot have constructors and init blocks.
 */
interface Downloader {

    // Interfaces don't have init blocks
//    init {
//        println("Downloader Initiated")
//    }

    fun downloaderInfo() {
        println("Downloader V1")
    }
    // It's not important to write abstract keyword because by default all the functions in interface are abstract.
//    abstract
    fun download()
}