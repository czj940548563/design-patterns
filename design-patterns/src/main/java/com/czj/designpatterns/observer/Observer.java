package com.czj.designpatterns.observer;

/**
 * @Author: clownc
 * @Date: 2019-06-18 15:36
 * 观察者抽象类
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();

}
