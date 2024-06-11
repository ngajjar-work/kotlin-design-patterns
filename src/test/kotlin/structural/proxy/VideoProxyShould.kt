package structural.proxy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VideoProxyShould {

    @Test
    fun `return correct title from proxy`() {
        // Given
        val video: Video = VideoProxy("Kotlin Tutorial")

        // When
        val title = video.getTitle()

        // Then
        assertThat(title).isEqualTo("Kotlin Tutorial")
    }

    @Test
    fun `play video using proxy`() {
        // Given
        val videoProxy = VideoProxy("Kotlin Tutorial")

        // When
        videoProxy.play()

        // Then
        assertThat(videoProxy.isVideoLoaded()).isTrue()
    }

    @Test
    fun `not load video from disk again if already loaded`() {
        // Given
        val videoProxy = VideoProxy("Kotlin Tutorial")

        // When
        videoProxy.play() // This load the video
        val firstLoadStatus = videoProxy.isVideoLoaded()

        videoProxy.play() // This not load the video again
        val secondLoadStatus = videoProxy.isVideoLoaded()

        // Then
        assertThat(firstLoadStatus).isTrue()
        assertThat(secondLoadStatus).isTrue()
    }
}