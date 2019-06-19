package com.czj.designpatterns.decorator;

/**
 * @Author: clownc
 * @Date: 2019-06-18 10:31
 * 抽象装饰类
 *
 * */
public abstract class DecoratorShape implements Shape {
    protected Shape decoratorShape;
    public DecoratorShape(Shape decoratorShape){
        this.decoratorShape=decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
