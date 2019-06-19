package com.czj.designpatterns.adapter;

/**
 * @Author: clownc
 * @Date: 2019-06-18 14:25
 * 两孔插线的接口
 */
public interface DualPin {
    //live 火线 null 零线
    void electrify(int l, int n );//通电方法
}
