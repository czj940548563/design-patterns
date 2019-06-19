package com.czj.designpatterns.proxy.generalproxy;

/**
 * @Author: clownc
 * @Date: 2019-06-18 16:54
 */
public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;
    public ProxyImage(String fileName){
        this.fileName=fileName;
    }
    @Override
    public void display() {
        if (realImage==null){
             realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
