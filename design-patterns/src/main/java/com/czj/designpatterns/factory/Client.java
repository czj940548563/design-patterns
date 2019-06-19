package com.czj.designpatterns.factory;

/**
 * @Author: clownc
 * @Date: 2019-06-19 15:11
 */
public class Client {
    public static void main(String[] args) {
        Factory shapeFactory = new Factory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();
    }
}
