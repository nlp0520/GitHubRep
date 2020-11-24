package com.test;

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther:niulipeng
 * @Date:2020/11/24
 * @Description:com.test
 * @Version:1.0
 */
    
public class T5 {
    private LinkedList list = new LinkedList();
    private final int MAX = 10;//消费者个数
    private int count;
    static T5 t = new T5();
    public synchronized  void put(){
        while(list.size() == MAX){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }list.add(t);
            ++count;
            this.notifyAll();
        }
    }
    public synchronized  void get(){
        while(list.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t = (T5) list.removeFirst();
            count--;
            this.notifyAll();
        }
    }

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10 ; i++) {
                    t.put();
                }
            }
        }).start();
    }


}
