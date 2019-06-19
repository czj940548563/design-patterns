package com.czj.designpatterns.decorator;

/**
 * @Author: clownc
 * @Date: 2019-06-18 10:37
 * 实体装饰类
 */
public class RedDecoratorShape extends DecoratorShape {

    public RedDecoratorShape(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        System.out.println("red");
        super.draw();
    }
}
