package com.yezi.coco.concurrence;

public class ThreadLocalDemo {

    ThreadLocal threadLocal = new ThreadLocal<String>();

    public void  set() {
        threadLocal.set(Thread.currentThread().getName());
    }
    public  Object getString() {
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