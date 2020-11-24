package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

/**
 * @Auther:niulipeng
 * @Date:2020/11/24
 * @Description:com.test
 * @Version:1.0
 */

public class T4 {
    //    volatile List list  = new ArrayList<>();
    List list = Collections.synchronizedList(new ArrayList());//同步容器

    public void add(Object o) {
        list.add(o);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        final T2 t = new T2();
        final Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                T2 t = new T2();
                System.out.println("t2...start");
                if (t.size() != 5) {
                    LockSupport.park();
                }
                System.out.println("t2....end");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t2");
        t2.start();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
//                T2 t = new T2();
                System.out.println("t1....start");
                for (int i = 0; i < 10; i++) {
                    t.add(new Object());
                    System.out.println("add........" + i);
                    if (t.size() == 5) {
                        LockSupport.unpark(t2);
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "t1");
        t1.start();

    }
}