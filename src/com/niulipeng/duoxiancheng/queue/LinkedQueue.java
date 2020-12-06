package com.niulipeng.duoxiancheng.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * @Auther:niulipeng
 * @Date:2020/12/4
 * @Description:com.niulipeng.duoxiancheng.queue
 * @Version:1.0
 */
    
public class LinkedQueue {
    public static void main(String[] args) {
        Queue qu = new ConcurrentLinkedQueue();
        qu.offer("a");//放值（返回true/false）和list的add(会抛出异常)
        qu.peek();//取值并去除
        qu.poll();//只取

        BlockingQueue lq = new LinkedBlockingDeque<>();//实现了阻塞
        try {
            lq.put("q");
            lq.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        BlockingQueue lq1 = new ArrayBlockingQueue(10);//定义初始大小
        BlockingQueue lq2 = new DelayQueue();
        PriorityQueue p = new PriorityQueue();

    }
    private static class MyTask implements Delayed{

        @Override
        public long getDelay(TimeUnit unit) {
            return 0;
        }

        @Override
        public int compareTo(Delayed o) {
            return 0;
        }
    }


}
