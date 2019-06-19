package com.czj.designpatterns.strategy;

import lombok.Setter;

/**
 * @Author: clownc
 * @Date: 2019-06-18 14:42
 * 写一个计算器，
 */
@Setter
public class Calculator {
    private Strategy strategy;//拥有某种算法策略
    public int getResult(int i,int j){
        return this.strategy.calculate(i,j);//返回具体策略的结果
    }
}
