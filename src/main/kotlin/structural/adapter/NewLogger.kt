package structural.adapter

interface NewLogger {
    fun logDebug(message: String)
    fun logInfo(message: String)
    fun logError(message: String)
}

class NewLoggerImpl : NewLogger {
    override fun logDebug(message: String) {
        println("New Logger - DEBUG: $message")
    }

    override fun logInfo(message: String) {
        println("New Logger - INFO: $message")
    }

    override fun logError(message: String) {
        println("New Logger - ERROR: $message")
    }
}