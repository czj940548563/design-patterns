package com.czj.designpatterns.decorator;

/**
 * @Author: clownc
 * @Date: 2019-06-18 10:39
 * 测试类
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle=new Circle();
        circle.draw();
        RedDecoratorShape redDecoratorShape = new RedDecoratorShape(new Circle());
        RedDecoratorShape redDecoratorShape1 = new RedDecoratorShape(new Rectangle());
        redDecoratorShape.draw();
        redDecoratorShape1.draw();
    }
}
