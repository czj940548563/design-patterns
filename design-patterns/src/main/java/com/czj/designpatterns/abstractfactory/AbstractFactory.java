package com.czj.designpatterns.abstractfactory;

/**
 * @Author: clownc
 * @Date: 2019-06-19 15:20
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
