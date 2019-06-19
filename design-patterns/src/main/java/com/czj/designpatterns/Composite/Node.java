package com.czj.designpatterns.composite;

/**
 * @Author: clownc
 * @Date: 2019-06-19 16:20
 * 组合模式,又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 */
public abstract class Node {
    protected String name;//节点命名
            public Node(String name) {//构造节点，传入节点名。
                this.name = name;
           }
         //增加后续子节点方法
          protected abstract void add(Node child);
}
