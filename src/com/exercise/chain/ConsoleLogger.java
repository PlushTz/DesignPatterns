package com.exercise.chain;

/**
 * Desc:
 *
 * @author lijt
 * Created on 2025/1/18
 * Email: lijt@eetrust.com
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
