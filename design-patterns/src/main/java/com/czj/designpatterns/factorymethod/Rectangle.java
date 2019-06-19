package com.czj.designpatterns.factorymethod;


/**
 * @Author: clownc
 * @Date: 2019-06-19 15:48
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}
