package com.niulipeng.duoxiancheng.queue;

import java.util.concurrent.LinkedTransferQueue;

/**
 * @Auther:niulipeng
 * @Date:2020/12/5
 * @Description:com.niulipeng.duoxiancheng.queue
 * @Version:1.0
 * 实现两个线程交替打印A1B2..Z26
 * LinkedTransferQueue方式
 */
    
public class MST3 {
    public static void main(String[] args) {
        final char[] c1 = "123456".toCharArray();
        final char[] c2 = "ABCDEF".toCharArray();
        final LinkedTransferQueue lt = new LinkedTransferQueue();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < c1.length; i++) {
                    try {
                        System.out.println(lt.take());
                        lt.transfer(c1[i]);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"t1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < c2.length; i++) {
                    try {
                        lt.transfer(c2[i]);
                        System.out.println(lt.take());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"t2").start();
    }
}
