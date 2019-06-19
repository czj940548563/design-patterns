package com.czj.designpatterns.decorator;

/**
 * @Author: clownc
 * @Date: 2019-06-18 10:30
 * 可以装饰的实体类
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw rectangle ");
    }
}
