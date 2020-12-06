package com.niulipeng.duoxiancheng.queue;

import java.util.concurrent.SynchronousQueue;

/**
 * @Auther:niulipeng
 * @Date:2020/12/5
 * @Description:com.niulipeng.duoxiancheng.queue
 * @Version:1.0
 */
    
public class SynchronusQueueDemo {
    static SynchronousQueue sq = new SynchronousQueue();//手递手传递

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(sq.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        sq.put("aaa");
//        sq.add("aaa");//会报错
        System.out.println(sq.size());
    }

}
