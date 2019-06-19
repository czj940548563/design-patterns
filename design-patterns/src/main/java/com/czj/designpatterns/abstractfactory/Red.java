package com.czj.designpatterns.abstractfactory;

/**
 * @Author: clownc
 * @Date: 2019-06-19 15:22
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("red");
    }
}
