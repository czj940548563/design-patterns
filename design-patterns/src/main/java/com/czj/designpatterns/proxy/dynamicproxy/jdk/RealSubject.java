package com.czj.designpatterns.proxy.dynamicproxy.jdk;

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
}
