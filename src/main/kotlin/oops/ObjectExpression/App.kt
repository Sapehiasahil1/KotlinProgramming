package oops.ObjectExpression

class App : DownloadListener {
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