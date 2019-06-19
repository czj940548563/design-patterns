package com.czj.designpatterns.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: clownc
 * @Date: 2019-06-18 17:45
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;
    public CglibProxy(Object target){
        this.target=target;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("哈喽");
        Object invoke = method.invoke(target, objects);
        System.out.println("哈喽");
        return invoke;
    }
    public static Object getProxy(Object target){
        Enhancer enhancer = new Enhancer();
        //设置需要代理的对象
        enhancer.setSuperclass(target.getClass());
        //设置代理人
        enhancer.setCallback(new CglibProxy( target));
        return enhancer.create();
    }
}
