package com.czj.designpatterns.observer;

/**
 * @Author: clownc
 * @Date: 2019-06-18 15:42
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println(Integer.toBinaryString(this.subject.getState()));
    }
}
