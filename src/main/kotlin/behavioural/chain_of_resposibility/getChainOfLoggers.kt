package behavioural.chain_of_resposibility

fun getChainOfLoggers(): Logger {
    val errorLogger = ErrorLogger()
    val debugLogger = DebugLogger()
    val infoLogger = InfoLogger()

    infoLogger.setNextLogger(debugLogger).setNextLogger(errorLogger)
    return infoLogger
}