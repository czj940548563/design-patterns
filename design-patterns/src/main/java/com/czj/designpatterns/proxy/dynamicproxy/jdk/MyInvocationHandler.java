package com.czj.designpatterns.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: clownc
 * @Date: 2019-06-18 17:05
 * 处理器对象
 */
public class MyInvocationHandler implements InvocationHandler {
    //需要被代理的真实对象
    private RealSubject realSubject;
    public MyInvocationHandler(RealSubject realSubject){
        this.realSubject=realSubject;
    }

    /**
     *
     * @param proxy    代理类
     * @param method    正在调用的方法
     * @param args      方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if (method.getName().equals("sellBooks")){
            System.out.println("调用的是卖书的方法");
            Object invoke = method.invoke(realSubject, args);
            System.out.println("调用的是卖书的方法");
            return invoke;
        }
        if (method.getName().equals("speak")){
            System.out.println("调用的是说话方法");
            Object invoke = method.invoke(realSubject, args);
            System.out.println("调用的是说话方法");
            return invoke;
        }
        return null;
    }
}
