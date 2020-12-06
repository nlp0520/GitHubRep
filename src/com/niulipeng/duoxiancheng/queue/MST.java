package com.niulipeng.duoxiancheng.queue;

import java.util.concurrent.locks.LockSupport;

/**
 * @Auther:niulipeng
 * @Date:2020/12/5
 * @Description:com.niulipeng.duoxiancheng.queue
 * @Version:1.0
 * 实现两个线程交替打印A1B2..Z26
 * LockSupport方式
 */

public class MST {
    //    static LinkedTransferQueue lt = new LinkedTransferQueue();
    static Thread t1;
    static Thread t2;

    public static void main(String[] args) throws InterruptedException {
        final char[] c1 = "123456".toCharArray();
        final char[] c2 = "ABCDEF".toCharArray();
        t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < c1.length; i++) {
                    System.out.print(c1[i]);
                    LockSupport.unpark(t2);
                    LockSupport.park();
                }
                LockSupport.unpark(t2);
            }
        });


        t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < c2.length; i++) {
                    System.out.print(c2[i]);
                    LockSupport.unpark(t1);
                    LockSupport.park();
                }
                LockSupport.unpark(t1);
            }
        });
        t2.start();
        t1.start();
    }

}
