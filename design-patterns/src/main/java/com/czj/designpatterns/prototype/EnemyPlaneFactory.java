package com.czj.designpatterns.prototype;

/**
 * @Author: clownc
 * @Date: 2019-06-18 13:53
 * 利用饿汉模式和原型模式造飞机,这样就可以通过原型模式生产大量飞机的对象,轻量级的对象可以使用new，其他对象可以使用clone。比如对象在构造方法有逻辑和业务上的操作 clone不会调用构造方法
 */
public class EnemyPlaneFactory {
    private static EnemyPlane enemyPlane =new EnemyPlane(200);
    public  static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
        EnemyPlane clone = enemyPlane.clone();
        clone.setX(x);
        return clone;
    }
}
