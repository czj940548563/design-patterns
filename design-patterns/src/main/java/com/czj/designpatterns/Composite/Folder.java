package com.czj.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: clownc
 * @Date: 2019-06-19 16:28
 */
public class Folder extends Node {
    //文件夹可以包含子节点（文件夹或者文件）。
    private List<Node> childrenNodes = new ArrayList<>();

    public Folder(String name) {
        super(name);//调用父类“节点”的构造方法命名。
    }

    @Override
    protected void add(Node child) {
        childrenNodes.add(child);//可以添加子节点。
    }
}
