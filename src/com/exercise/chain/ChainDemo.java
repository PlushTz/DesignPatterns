package com.exercise.chain;

/**
 * Desc:
 *
 * @author lijt
 * Created on 2025/1/18
 * Email: lijt@eetrust.com
 */
public class ChainDemo {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }

    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);
        errorLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
