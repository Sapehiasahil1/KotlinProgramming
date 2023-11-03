package oops.Delegation

class MediaFile(
    private val downloader: Downloader,
    private val player: Player
): Downloader, Player {
    override fun download() {
        downloader.download()
    }

    override fun play() {
        player.play()
    }
}