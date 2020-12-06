package com.niulipeng.duoxiancheng;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @Auther:niulipeng
 * @Date:2020/12/4
 * @Description:com.niulipeng.duoxiancheng
 * @Version:1.0
 */
    
public class TicksSell4 {
    private static Queue<String> ticks = new ConcurrentLinkedQueue();
    Map m = new ConcurrentSkipListMap<>();

    static {
        for (int i = 0; i < 1000; i++) {
            ticks.add("票号为："+i);
        }
    }

    public static void main(String[] args) {
        //Lamda表达式
//        new Thread(()->{
//
//        }).start();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        String s = ticks.poll();
                        if(s == null){
                            break;
                        }else{

                            System.out.println("售出:"+s);
                        }
                    }
                }
            }).start();
        }
    }
}
