package com.czj.designpatterns.composite;

/**
 * @Author: clownc
 * @Date: 2019-06-19 16:29
 */
public class File extends Node {
    public File(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        System.out.println("不能添加子节点。");
    }
}
