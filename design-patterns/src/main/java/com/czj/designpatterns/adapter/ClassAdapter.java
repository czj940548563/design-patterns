package com.czj.designpatterns.adapter;

/**
 * @Author: clownc
 * @Date: 2019-06-18 14:34
 * 类适配器 只适合Tv的儿子类使用，其他的两孔插线设备不能用
 */
public class ClassAdapter extends Tv implements TriplePin  {
    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l,n);
    }
}
