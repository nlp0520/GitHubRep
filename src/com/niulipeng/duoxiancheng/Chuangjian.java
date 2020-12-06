package com.niulipeng.duoxiancheng;

import java.util.concurrent.*;

/**
 * @Auther:niulipeng
 * @Date:2020/12/5
 * @Description:com.niulipeng.duoxiancheng
 * @Version:1.0
 * 创建线程的方法
 * 1、继承Thread类，重写run方法，调用run启动
 * 2、实现Runnable接口，重写run方法，调用start启动
 * 3、使用Callable和Future创建线程
 * 4、使用线程池例如用Executor框架
 *
 */
    
public class Chuangjian extends Thread implements Runnable, Callable {
    @Override
    public void run() {
//        super.run();
        System.out.println("启动");
    }

    public static void main(String[] args) throws Exception {
        Chuangjian cj = new Chuangjian();
//        cj.run();//继承Thread类
//        cj.start();//实现Runnable接口
//        System.out.println(cj.call());//实现Callable接口

        FutureTask ft = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return 121;
            }
        });
//        new Thread(ft).start();
//        System.out.println(ft.get());

        ExecutorService ex = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            ex.execute(new TestExcutor());
            System.out.println("--------"+i);
        }
        ex.shutdown();
    }
    private static class TestExcutor implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"---线程被占用");
        }
    }

    @Override
    public Object call() throws Exception {
        return 100;
    }
}
