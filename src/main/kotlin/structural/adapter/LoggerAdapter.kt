package structural.adapter

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