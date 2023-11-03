package oops.ObjectExpression

interface DownloadListener {

    fun downloadStarted()
    fun onDownloadCompleted(file: String)
    fun onProgressUpdate(progress: Int)


}