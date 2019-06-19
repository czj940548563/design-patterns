package com.czj.designpatterns.observer;

/**
 * @Author: clownc
 * @Date: 2019-06-18 15:53
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println(Integer.toOctalString(this.subject.getState()));
    }
}
