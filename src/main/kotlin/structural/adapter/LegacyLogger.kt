package structural.adapter

//A Class which we don't want to change

interface LegacyLogger {
    fun logMessage(level: Int, message: String)
}

class LegacyLoggerImpl : LegacyLogger {
    override fun logMessage(level: Int, message: String) {
        println("Legacy Logger - Level: $level, Message: $message")
    }
}