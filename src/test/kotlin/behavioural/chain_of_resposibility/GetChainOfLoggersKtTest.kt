package behavioural.chain_of_resposibility

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class GetChainOfLoggersKtTest {

    private val outContent = ByteArrayOutputStream()

    @BeforeEach
    fun setUp() {
        System.setOut(PrintStream(outContent))
    }

    @Test
    fun `should log informational message`() {
        // Given
        val loggerChain = getChainOfLoggers()

        // When
        loggerChain.logMessage(INFO, "This is an informational message.")

        // Then
        assertThat(outContent.toString().trim()).isEqualTo("InfoLogger: This is an informational message.")
    }


    @Test
    fun `should log debug message`() {
        // Given
        val loggerChain = getChainOfLoggers()
        outContent.reset() // Reset the output stream

        // When
        loggerChain.logMessage(DEBUG, "This is a debug message.")

        // Then
        assertThat(outContent.toString().trim()).isEqualTo(
            """
            InfoLogger: This is a debug message.
            DebugLogger: This is a debug message.
            """.trimIndent()
        )
    }

    @Test
    fun `should log error message`() {
        // Given
        val loggerChain = getChainOfLoggers()
        outContent.reset() // Reset the output stream

        // When
        loggerChain.logMessage(ERROR, "This is an error message.")

        // Then
        assertThat(outContent.toString().trim()).isEqualTo(
            """
            InfoLogger: This is an error message.
            DebugLogger: This is an error message.
            ErrorLogger: This is an error message.
            """.trimIndent()
        )
    }
}