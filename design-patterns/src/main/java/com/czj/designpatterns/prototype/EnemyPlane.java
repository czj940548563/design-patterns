package com.czj.designpatterns.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: clownc
 * @Date: 2019-06-18 10:59
 * 实现克隆接口的敌人飞机实体类
 * 如果成员变量有对象，则要对象进行深拷贝，不然多个飞机的拷贝对象里面的子弹对象都是指向同一个对象
 */
@Getter
@Setter
public class EnemyPlane implements Cloneable {
    private Bullet bullet= new Bullet();
    private int x;
    private int y=0;

    public EnemyPlane(int x){
        this.x=x;
    }

    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        EnemyPlane clone = (EnemyPlane) super.clone();
        clone.setBullet((Bullet) this.bullet.clone());
        return clone;
    }
}
