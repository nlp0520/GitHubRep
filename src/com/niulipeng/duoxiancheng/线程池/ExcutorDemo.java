package com.niulipeng.duoxiancheng.线程池;

import java.util.concurrent.Executor;

/**
 * @Auther:niulipeng
 * @Date:2020/12/5
 * @Description:com.niulipeng.duoxiancheng.线程池
 * @Version:1.0
 * 线程执行器
 */
    
public class ExcutorDemo implements Executor {

    @Override
    public void execute(Runnable command) {
        System.out.println("vvv");
    }

    public static void main(String[] args) {
        new ExcutorDemo().execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("aaa");
            }
        });
    }
}
