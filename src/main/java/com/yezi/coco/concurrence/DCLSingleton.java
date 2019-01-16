package com.yezi.coco.concurrence;

/**
 *  双重检查延迟加载的线程安全的单利模式
 */
public class DCLSingleton {
    // volatile 保证 对象的可见性和防止重排序
    public static volatile  DCLSingleton dclSingleton ;

    public DCLSingleton() {

    }


    public static DCLSingleton getInstance() {
        if (null == dclSingleton) {
            synchronized (DCLSingleton.class) {
                if (null == dclSingleton) {
                    dclSingleton = new DCLSingleton();
                    System.out.println("new DCLSingleton =================");
                }
            }
        }
        return  dclSingleton;
    }

    public static void main(String[] args) {
        DCLSingleton instance = DCLSingleton.getInstance();
        System.out.println(instance);
    }


}
