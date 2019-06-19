package com.czj.designpatterns.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: clownc
 * @Date: 2019-06-18 15:35
 * 观察者模式：一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。
 */
@Getter
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void setState(int state) {//状态改变通知所有观察者
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer){//添加观察者
        observers.add(observer);
    }
    private void notifyAllObserver() {
        observers.stream().forEach(observer -> observer.update());
    }
}
