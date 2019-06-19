package com.czj.designpatterns.proxy.generalproxy;

/**
 * @Author: clownc
 * @Date: 2019-06-18 16:48
 */
public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName){
        this.fileName=fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("loadFromDisk"+fileName);
    }

    @Override
    public void display() {
        System.out.println("dispaly"+fileName);
    }
}
