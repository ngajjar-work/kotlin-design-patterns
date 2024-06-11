package structural.adapter

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class LoggerAdapterShould {


    private lateinit var newLogger: NewLogger
    private lateinit var loggerAdapter: LoggerAdapter

    @BeforeEach
    fun setUp() {
        newLogger = mock(NewLogger::class.java)
        loggerAdapter = LoggerAdapter(newLogger)
    }


    @Test
    fun logDebugMessage() {

        // Given
        val message = "This is a debug message."

        // When
        loggerAdapter.logMessage(1, message)

        // Then
        verify(newLogger).logDebug(message)
    }

    @Test
    fun logInfoMessage() {

        // Given
        val message = "This is an info message."

        // When
        loggerAdapter.logMessage(2, message)

        // Then
        verify(newLogger).logInfo(message)
    }

    @Test
    fun logErrorMessage() {

        // Given
        val message = "This is an info message."

        // When
        loggerAdapter.logMessage(3, message)

        // Then
        verify(newLogger).logError(message)
    }

}