package com.czj.designpatterns.proxy.dynamicproxy.cglib;

import com.czj.designpatterns.proxy.dynamicproxy.jdk.Subject;

/**
 * @Author: clownc
 * @Date: 2019-06-18 17:04
 */
public class RealSubject implements Subject {
    @Override
    public int sellBooks() {
        System.out.println("卖书");
        return 1;
    }

    @Override
    public String speak() {
        System.out.println("说话");
        return "czj";
    }

    // final 方法不会被生成的字类覆盖
    public final void work() {
        System.out.println("工作");
    }

    // private 方法不会被生成的字类覆盖
    private void play() {
        System.out.println(" playing game");
    }
}
