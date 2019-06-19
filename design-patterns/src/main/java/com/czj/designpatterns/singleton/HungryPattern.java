package com.czj.designpatterns.singleton;

/**
 * @Author: clownc
 * @Date: 2019-06-18 10:10
 * 饿汉，线程安全
 */
public class HungryPattern {
    private static HungryPattern hungryPattern=new HungryPattern();
    private HungryPattern(){}
    public static HungryPattern getInstance(){
        return  hungryPattern;
    }
}
