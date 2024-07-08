package structural.proxy

/**
 * The Proxy Pattern is a structural design pattern that provides a surrogate or placeholder for another object.
 * It controls access to the real object and can add additional functionality such as lazy initialization, access control, or logging.
 *
 * Advantages
 * 1. Access Control: Provides a way to control access to the real object, including lazy initialization or restricted access.
 * 2. Additional Functionality: Allows adding extra behavior (e.g., logging, caching) without modifying the real object.
 * 3. Reduced Resource Usage: Delays the creation or loading of resource-intensive objects until they are actually needed.
 * 4. Decoupling: Separates the client code from the real object, allowing for better management and control.
 */

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
