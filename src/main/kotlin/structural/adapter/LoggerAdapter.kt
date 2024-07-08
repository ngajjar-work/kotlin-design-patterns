package structural.adapter


/**
 * The Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces
 * to work together. It acts as a bridge between two incompatible interfaces by adapting one interface
 * to the interface expected by the client.
 *
 * Advantages
 * 1. Compatibility: Allows integration of incompatible interfaces, enabling them to work together.
 * 2. Reusability: Promotes reuse of existing code by adapting it to new interfaces without modification.
 * 3. Flexibility: Makes it easier to use classes that follow different interfaces or third-party libraries.
 * 4. Simplifies Code: Reduces the need for complex code modifications to achieve compatibility.
 */

class LoggerAdapter(private val newLogger: NewLogger) : LegacyLogger {
    override fun logMessage(level: Int, message: String) {
        when (level) {
            1 -> newLogger.logDebug(message)
            2 -> newLogger.logInfo(message)
            3 -> newLogger.logError(message)
            else -> println("Unknown logging level: $level, Message: $message")
        }
    }
}