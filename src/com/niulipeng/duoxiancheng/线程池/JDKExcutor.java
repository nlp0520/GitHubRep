package com.niulipeng.duoxiancheng.线程池;

import java.util.concurrent.*;

/**
 * @Auther:niulipeng
 * @Date:2020/12/8
 * @Description:com.niulipeng.duoxiancheng.线程池
 * @Version:1.0
 * JDK默认提供的线程池
 */
    
public class JDKExcutor {
    public static void main(String[] args) {
        //单线程池：有任务队列；有生命周期
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //可以起多个线程数最大数：Integer.MAX_VALUE
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        executorService1.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
        //固定线程数
        ExecutorService executorService2 = Executors.newFixedThreadPool(4);
        //定时任务线程池initialDelay开始停多长时间执行 period隔多长时间
        ScheduledExecutorService executorService4 = Executors.newScheduledThreadPool(3);
        executorService4.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

            }
        },0,50 ,TimeUnit.SECONDS);

    }
}
