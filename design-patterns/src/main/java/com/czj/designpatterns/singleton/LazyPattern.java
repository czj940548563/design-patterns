package com.czj.designpatterns.singleton;


/**
 * @Author: clownc
 * @Date: 2019-06-18 10:14
 * 懒汉模式， 双重锁线程安全
 */
public class LazyPattern {
    private static LazyPattern lazyPattern;

    private LazyPattern() {
    }

    private static LazyPattern getInstance() {
        if (lazyPattern == null) {
            synchronized (LazyPattern.class) {
                if (lazyPattern == null) {
                    lazyPattern = new LazyPattern();
                }
            }
        }
        return lazyPattern;
    }
}
