package structural.proxy

class RealVideo(private val title: String) : Video {
    private var isLoaded: Boolean = false

    init {
        loadFromDisk()
    }

    private fun loadFromDisk() {
        println("Loading video $title from disk...")
        isLoaded = true
    }

    override fun play() {
        println("Playing video $title.")
    }

    override fun getTitle() = title

    override fun isVideoLoaded() = isLoaded
}