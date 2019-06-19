package com.czj.designpatterns.chainofresponsibility;

/**
 * @Author: clownc
 * @Date: 2019-06-19 17:03
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }

}
