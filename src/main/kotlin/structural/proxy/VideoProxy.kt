package structural.proxy

class VideoProxy(private val title: String) : Video {

    private var realVideo: RealVideo? = null
    private var isLoaded: Boolean = false

    override fun play() {
        if (realVideo == null) {
            realVideo = RealVideo(title)
            isLoaded = true
        }
        realVideo?.play()
    }

    override fun getTitle() = title

    override fun isVideoLoaded() = isLoaded
}
