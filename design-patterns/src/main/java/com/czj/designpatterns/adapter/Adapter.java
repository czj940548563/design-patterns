package com.czj.designpatterns.adapter;

/**
 * @Author: clownc
 * @Date: 2019-06-18 14:30
 * 对象适配器
 */
public class Adapter implements TriplePin {
    private DualPin dualPin;
    public Adapter(DualPin dualPin){
        this.dualPin=dualPin;
    }
    //创建适配器的适合把需要转接的设备接入，例如Tv
    @Override
    public void electrify(int l, int n, int e) {
        //适配两孔的插线，把地线抛弃。
        dualPin.electrify(l,n);
    }
}
