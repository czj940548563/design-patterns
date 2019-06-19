package com.czj.designpatterns.factorymethod;


/**
 * @Author: clownc
 * @Date: 2019-06-19 15:47
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle");
    }
}
