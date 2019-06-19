package com.czj.designpatterns.factory;

/**
 * @Author: clownc
 * @Date: 2019-06-19 15:05
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle");
    }
}
