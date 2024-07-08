package behavioural.command

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class CommandPatternTest {

    private val outContent = ByteArrayOutputStream()

    @BeforeEach
    fun setUp() {
        System.setOut(PrintStream(outContent))
    }

    @Test
    fun `should play music when play button is clicked`() {
        // Given
        val musicPlayer = MusicPlayer()
        val playButton = MusicPlayerButton(PlayCommand(musicPlayer))

        // When
        playButton.click()

        // Then
        assertThat(outContent.toString().trim()).isEqualTo("Music is playing")
    }

    @Test
    fun `should pause music when pause button is clicked`() {
        // Given
        val musicPlayer = MusicPlayer()
        val pauseButton = MusicPlayerButton(PauseCommand(musicPlayer))

        // When
        pauseButton.click()

        // Then
        assertThat(outContent.toString().trim()).isEqualTo("Music is paused")
    }

    @Test
    fun `should stop music when stop button is clicked`() {
        // Given
        val musicPlayer = MusicPlayer()
        val stopButton = MusicPlayerButton(StopCommand(musicPlayer))

        // When
        stopButton.click()

        // Then
        assertThat(outContent.toString().trim()).isEqualTo("Music is stopped")
    }

}