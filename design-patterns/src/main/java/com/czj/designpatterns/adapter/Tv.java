package com.czj.designpatterns.adapter;

/**
 * @Author: clownc
 * @Date: 2019-06-18 14:26
 *
 *电视的插线是两孔的，墙上的是三孔插座，需要一个适配器做转接
 */
public class Tv implements DualPin {

    @Override
    public void electrify(int l, int n) {
        System.out.println("火线通电：" + l);
        System.out.println("零线通电：" + n);
    }
}
