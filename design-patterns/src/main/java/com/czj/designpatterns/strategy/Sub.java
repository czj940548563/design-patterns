package com.czj.designpatterns.strategy;

/**
 * @Author: clownc
 * @Date: 2019-06-18 14:41
 * 减法策略
 */
public class Sub implements Strategy {
    @Override
    public int calculate(int i, int j) {
        return i-j;
    }
}
