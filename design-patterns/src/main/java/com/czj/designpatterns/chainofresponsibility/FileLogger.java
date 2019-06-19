package com.czj.designpatterns.chainofresponsibility;

/**
 * @Author: clownc
 * @Date: 2019-06-19 17:04
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
