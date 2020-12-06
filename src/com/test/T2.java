package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther:niulipeng
 * @Date:2020/11/23
 * @Description:com.test
 * @Version:1.0 面试题 用一个集合两个方法一个add一个size实现第一个线程一直添加数据，第二个线程当第一个线程添加到5时通知并停止
 * 实现方法：即两个线程之间的通信
 * volatile有问题（睡一秒没问题，去掉就有问题），一般不要修饰引用值（因为volatile是检查的对象，如果对象里的属性发生变化是观察不到的）
 */

public class T2 {
    //    volatile List list  = new ArrayList<>();
    volatile List list = Collections.synchronizedList(new ArrayList());//同步容器

    public void add(Object o) {
        list.add(o);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        final T2 t = new T2();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
//                T2 t = new T2();
                for (int i = 0; i < 10; i++) {
                    t.add(new Object());
                    System.out.println("add........" + i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        }, "t1");
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                T2 t = new T2();
                while (true) {
                    if (t.size() == 5) {
                        break;
                    }
                }
                System.out.println("end");
            }
        }, "t2");
        t2.start();
    }
}
