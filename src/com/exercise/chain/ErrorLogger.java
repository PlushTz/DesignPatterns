package com.exercise.chain;

/**
 * Desc:
 *
 * @author lijt
 * Created on 2025/1/18
 * Email: lijt@eetrust.com
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
