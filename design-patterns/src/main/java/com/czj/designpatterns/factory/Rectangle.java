package com.czj.designpatterns.factory;

/**
 * @Author: clownc
 * @Date: 2019-06-19 15:06
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}
