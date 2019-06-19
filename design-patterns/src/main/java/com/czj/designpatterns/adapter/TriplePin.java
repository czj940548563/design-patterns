package com.czj.designpatterns.adapter;

/**
 * @Author: clownc
 * @Date: 2019-06-18 14:22
 * 墙上的三孔插座
 *
 */
public interface TriplePin {
    //live 火线 null 零线 earth 地线
     void electrify(int l, int n ,int e);//通电方法
}
