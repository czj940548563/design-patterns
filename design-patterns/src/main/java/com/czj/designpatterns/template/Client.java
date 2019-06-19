package com.czj.designpatterns.template;

/**
 * @Author: clownc
 * @Date: 2019-06-19 16:03
 */
public class Client {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();
    }
}
