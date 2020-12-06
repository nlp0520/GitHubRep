package com.niulipeng.duoxiancheng;

import java.util.Vector;

/**
 * @Auther:niulipeng
 * @Date:2020/12/4
 * @Description:com.niulipeng.duoxiancheng
 * @Version:1.0
 */
    
public class TicksSell2 {
    private static Vector ticks = new Vector();

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
                    while(ticks.size()>0){
                        System.out.println("售出:"+ticks.remove(0));
                    }
                }
            }).start();
        }
    }
}
