package com.niulipeng.duoxiancheng.线程池;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Auther:niulipeng
 * @Date:2020/12/5
 * @Description:com.niulipeng.duoxiancheng.线程池
 * @Version:1.0
 * Callable可以被另外一个线程去执行，有返回结果
 */
    
public class CallableDemo implements Callable {
    @Override
    public Object call() throws Exception {
        return null;
    }

    public static void main(String[] args) {
        Callable ca = new Callable() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        };
        Future ft = new FutureTask(ca);

    }
}
