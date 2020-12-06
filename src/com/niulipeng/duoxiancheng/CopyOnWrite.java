package com.niulipeng.duoxiancheng;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Auther:niulipeng
 * @Date:2020/12/4
 * @Description:com.niulipeng.duoxiancheng
 * @Version:1.0
 */
    
public class CopyOnWrite {

    public static void main(String[] args) {
        final List list = new CopyOnWriteArrayList<>();//写时复制
        final Random r = new Random();
        Thread[] th = new Thread[100];
        for (int i = 0; i < th.length ; i++) {
            Runnable rn = new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        list.add(r.nextInt(1000));
                    }
                }
            };
            th[i] = new Thread(rn);
        }


    }
}
