package com.czj.designpatterns.strategy;

/**
 * @Author: clownc
 * @Date: 2019-06-18 14:47
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new Add());//加法策略的计算器
        int result = calculator.getResult(5, 5);
        System.out.println(result);
        calculator.setStrategy(new Sub());//减法策略
        int result1 = calculator.getResult(5, 5);
        System.out.println(result1);
    }
}
