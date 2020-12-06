package com.niulipeng.duoxiancheng.queue;

/**
 * @Auther:niulipeng
 * @Date:2020/12/5
 * @Description:com.niulipeng.duoxiancheng.queue
 * @Version:1.0
 * 实现两个线程交替打印A1B2..Z26
 * synchronized方式
 */
    
public class MST1 {
    public static void main(String[] args) {
        final Object o = new Object();
        final char[] c1 = "123456".toCharArray();
        final char[] c2 = "ABCDEF".toCharArray();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o){
                    for (int i = 0; i < c1.length; i++) {
                        System.out.print(c1[i]);
                        try {
                            o.notify();
                            o.wait();//让出锁
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    o.notify();//必须，否则无法停止
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o){
                    for (int i = 0; i < c2.length; i++) {
                        System.out.print(c2[i]);
                        try {
                            o.notify();
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    o.notify();//必须，否则无法停止
                }
            }
        });
        t2.start();
    }
}
