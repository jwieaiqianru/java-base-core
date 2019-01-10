package com.yezi.coco.concurrence;

public class WelcomeApp {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("2.welcome  === " + Thread.currentThread().getName()),"new-Thread");
        //启动线程
        thread.start();
        //手动调用线程的run
        //thread.run();
        System.out.println("1.welcome=== " + Thread.currentThread().getName());
    }
}
