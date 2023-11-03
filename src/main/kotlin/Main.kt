import oops.AbstractClass.PremiumCoffeeMachine2
import oops.Interface.Audio
import oops.Interface.Downloader
import oops.Interface.Video
import oops.ObjectExpression.App
import oops.ObjectExpression.DownloadListener

fun main() {

//    Basics of Class

//    val box1 = Box(1,2,3)
//    val box2 = Box()
//    println("Height :${box1.height}")
//    println("length :${box1.length}")
//    println("width :${box1.width}")
//    box1.open()
//    box1.fillContents()
//    box1.close()
//    println("volume : ${box1.volume}")
//    box1.boxName = "My Box"
//    println("Box Name is : ${box1.boxName}")

//    Inheritance

//    val coffeeMachine = BaseCoffeeMachine(1000.0, "BLACK")
//    coffeeMachine.makeCoffee()
//    val coffeeMachine = PremiumCoffeeMachine(5000.0,"BROWN")
//    coffeeMachine.makeCoffee()

//    Abstract Class

//    val coffeeMachine = PremiumCoffeeMachine2(5900.0, "BROWN")
//    val info = coffeeMachine.machineInfo()
//    val coffee = coffeeMachine.makeCoffee("CAPPUCCINO")
//    println(coffee)
//    println(info)

//    Interface

//    val audioDownloader = Audio("Audio1")
//    val videoDownloader = Video("Video1")
//
//    audioDownloader.download()
//    audioDownloader.downloaderInfo()
//    audioDownloader.play()
//    audioDownloader.playerInfo()
//    videoDownloader.download()
//    videoDownloader.downloaderInfo()
//    videoDownloader.play()
//    videoDownloader.playerInfo()

//    Object Expression

//    val app = App()
    val downloader = oops.ObjectExpression.Downloader()
    downloader.downloadListener = object : DownloadListener{
        override fun downloadStarted() {
            println("Download Started")
        }

        override fun onDownloadCompleted(file: String) {
            println("$file download completed")
        }

        override fun onProgressUpdate(progress: Int) {
            println("$progress% downloaded")
        }
    }
    downloader.downloadFile("FileA.png")

}