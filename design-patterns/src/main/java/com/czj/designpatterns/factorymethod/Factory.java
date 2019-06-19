package com.czj.designpatterns.factorymethod;


/**
 * @Author: clownc
 * @Date: 2019-06-19 15:50
 * 把生产对象的方法抽象出去
 */
public interface Factory {
    Shape getShape(String shapeType);
}
