package com.yezi.coco.concurrence;

import java.util.Date;

public class SimpleJavaApp {
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println(new Date());
            Thread.sleep(1000);
        }
    }
}
