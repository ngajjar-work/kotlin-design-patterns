package behavioural.chain_of_resposibility

/**
 * The Chain of Responsibility Pattern is a behavioral design pattern that allows passing a request along a chain of
 * potential handlers until one of them handles the request. Each handler in the chain decides whether to process the
 * request or pass it to the next handler in the chain.
 *
 * Advantages
 * 1. Decoupling: Reduces coupling between sender and receiver by decoupling request processing from the actual handling.
 * 2. Flexibility: Allows dynamic changes to the chain of handlers and their order.
 * 3. Single Responsibility Principle: Each handler is only responsible for processing requests that it can handle.
 * 4. Easy Addition and Removal: Simplifies the addition or removal of handlers without modifying existing code.
 */

abstract class Logger(private val logLevel: Int) {
    private var nextLogger: Logger? = null

    fun setNextLogger(nextLogger: Logger): Logger {
        this.nextLogger = nextLogger
        return nextLogger
    }

    fun logMessage(level: Int, message: String) {
        if (this.logLevel <= level) {
            write(message)
        }
        nextLogger?.logMessage(level, message)
    }

    protected abstract fun write(message: String)
}

const val INFO = 1
const val DEBUG = 2
const val ERROR = 3

class InfoLogger : Logger(INFO) {
    override fun write(message: String) {
        println("InfoLogger: $message")
    }
}

class DebugLogger : Logger(DEBUG) {
    override fun write(message: String) {
        println("DebugLogger: $message")
    }
}

class ErrorLogger : Logger(ERROR) {
    override fun write(message: String) {
        println("ErrorLogger: $message")
    }
}
