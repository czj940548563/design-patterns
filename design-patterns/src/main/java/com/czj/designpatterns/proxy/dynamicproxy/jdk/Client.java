package com.czj.designpatterns.proxy.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @Author: clownc
 * @Date: 2019-06-18 17:31
 */
public class Client {
    public static void main(String[] args) {
        //真实对象
        RealSubject realSubject = new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
        //代理对象
        Subject subject=(Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);
        subject.sellBooks();
        subject.speak();
    }
}
