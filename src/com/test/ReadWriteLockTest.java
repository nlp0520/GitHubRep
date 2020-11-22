package com.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Auther:niulipeng
 * @Date:2020/11/22
 * @Description:com.test
 * @Version:1.0
 *
 * 验证读写锁的效率  相同的读（写）线程的可以同时操作
 */
    
public class ReadWriteLockTest {
    private static Lock lock = new ReentrantLock();
    private static ReadWriteLock rwlock = new ReentrantReadWriteLock();
    static Lock rlock = rwlock.readLock();
    static Lock wlock = rwlock.writeLock();

    private void read(Lock lock){
        lock.lock();
        try {
            Thread.sleep(2000);
            System.out.println("read over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    private void write(Lock lock){
        lock.lock();
        try {
            Thread.sleep(2000);
            System.out.println("write over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            new Thread(new Runnable() {
                ReadWriteLockTest rw = new ReadWriteLockTest();
                @Override
                public void run() {
                    rw.read(lock);
//                    rw.read(rlock);
                }
            }).start();
        }
        for (int i = 0; i < 2 ; i++) {
            new Thread(new Runnable() {
                ReadWriteLockTest rw = new ReadWriteLockTest();
                @Override
                public void run() {
                    rw.write(lock);
//                    rw.write(wlock);
                }
            }).start();
        }
    }
}
