package com.niulipeng.duoxiancheng.线程池;

import java.util.concurrent.*;

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

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        new ExcutorDemo().execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("aaa");
            }
        });
        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {
                return "Hello World";
            }
        };

//        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future submit = executorService.submit(callable);//异步执行的
        System.out.println(submit.get());//阻塞

        executorService.shutdown();

        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());


    }
}
