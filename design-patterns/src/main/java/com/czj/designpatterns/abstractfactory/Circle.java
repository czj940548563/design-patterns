package com.czj.designpatterns.abstractfactory;

/**
 * @Author: clownc
 * @Date: 2019-06-19 15:19
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("shape");
    }
}
