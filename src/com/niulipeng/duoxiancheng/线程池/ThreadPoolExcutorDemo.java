package com.niulipeng.duoxiancheng.线程池;

import java.io.IOException;
import java.util.concurrent.*;

/**
 * @Auther:niulipeng
 * @Date:2020/12/7
 * @Description:com.niulipeng.duoxiancheng.线程池
 * @Version:1.0
 */

public class ThreadPoolExcutorDemo {
    static class Task implements Runnable{
        private int i;

        @Override
        public String toString() {
            return "Task{" +
                    "i=" + i +
                    '}';
        }

        public Task(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"----"+i);
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        //核心线程数；最大线程数；最大生存时间；生存时间的单位；任务队列；线程工厂；拒绝策略
        //拒绝策略：CallerRunsPolicy（调用者处理任务）、AbortPolicy（抛异常）、DiscardPolicy（不抛异常）、DiscardOldestPolicy（扔掉排队时间最久的）
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5,
                600, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 8; i++) {
            threadPoolExecutor.execute(new Task(i));
        }
        System.out.println(threadPoolExecutor.getQueue());

        threadPoolExecutor.execute(new Task(100));

        System.out.println(threadPoolExecutor.getQueue());

        threadPoolExecutor.shutdown();
    }
}
