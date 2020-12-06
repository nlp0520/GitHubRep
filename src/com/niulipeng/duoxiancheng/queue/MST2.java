package com.niulipeng.duoxiancheng.queue;

/**
 * @Auther:niulipeng
 * @Date:2020/12/5
 * @Description:com.niulipeng.duoxiancheng.queue
 * @Version:1.0
 * 实现两个线程交替打印A1B2..Z26
 * 自旋锁式
 */
    
public class MST2 {
    enum ReadyToRun{T1,T2}
    static volatile ReadyToRun rt = ReadyToRun.T1;

    public static void main(String[] args) {
        final char[] c1 = "123456".toCharArray();
        final char[] c2 = "ABCDEF".toCharArray();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < c1.length; i++) {
                    while(rt!=ReadyToRun.T1){

                    }
                    System.out.print(c1[i]);
                    rt = ReadyToRun.T2;
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < c2.length; i++) {
                    while(rt!=ReadyToRun.T2){

                    }
                    System.out.print(c2[i]);
                    rt = ReadyToRun.T1;
                }
            }
        });
        t2.start();
    }


}
