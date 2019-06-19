package com.czj.designpatterns.decorator;

/**
 * @Author: clownc
 * @Date: 2019-06-18 10:29
 * 可以装饰的实体类
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
