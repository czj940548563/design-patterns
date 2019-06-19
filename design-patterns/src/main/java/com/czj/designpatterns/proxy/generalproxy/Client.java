package com.czj.designpatterns.proxy.generalproxy;

/**
 * @Author: clownc
 * @Date: 2019-06-18 16:57
 */
public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
