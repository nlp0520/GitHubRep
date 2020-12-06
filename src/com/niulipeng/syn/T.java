package com.niulipeng.syn;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther:niulipeng
 * @Date:2020/11/21
 * @Description:com.niulipeng.syn
 * @Version:1.0
 * synchronized
 */
    
public class T implements Runnable{
    @Override
    public void run() {

    }

    private synchronized void getm1(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"==start"+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"==end");
        }
    }
    private  void getm2(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"==start"+i);

        }
    }

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
//        new Thread(new Runnable() {
//            T t = new T();
//            @Override
//            public void run() {
//                t.getm1();
//            }
//        },"t1").start();
//        new Thread(new Runnable() {
//            T t = new T();
//            @Override
//            public void run() {
//                t.getm2();
//            }
//        },"t2").start();

    }
}
