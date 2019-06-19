package com.czj.designpatterns.strategy;

/**
 * @Author: clownc
 * @Date: 2019-06-18 14:41
 * 加法策略
 */
public class Add implements Strategy {
    @Override
    public int calculate(int i, int j) {
        return i+j;
    }
}
