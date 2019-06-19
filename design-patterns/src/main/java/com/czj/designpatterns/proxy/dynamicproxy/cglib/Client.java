package com.czj.designpatterns.proxy.dynamicproxy.cglib;

/**
 * @Author: clownc
 * @Date: 2019-06-18 17:52
 */
public class Client {
    public static void main(String[] args) {
        // 生成 Cglib 代理类
        RealSubject engineerProxy = (RealSubject) CglibProxy.getProxy(new RealSubject());
        // 调用相关方法
        engineerProxy.speak();
        engineerProxy.sellBooks();
    }
}
