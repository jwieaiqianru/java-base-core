package com.yezi.coco.concurrence;

public class ThreadLocalDemo {

    private ThreadLocal<String> threadLocal = new ThreadLocal<>();

    private void  set() {
        threadLocal.set(Thread.currentThread().getName());
    }
    private Object getString() {
        return threadLocal.get();
    }
    public static void main(String[] args) {
        ThreadLocalDemo threadLocalDemo = new ThreadLocalDemo();
        threadLocalDemo.set();
        System.out.println(threadLocalDemo.getString());


        Thread thread = new Thread(() -> {
            threadLocalDemo.set();
            System.out.println(threadLocalDemo.getString());
        });
        thread.start();
    }

}