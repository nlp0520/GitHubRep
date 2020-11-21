package com.test;

/**
 * @Auther:niulipeng
 * @Date:2020/11/21
 * @Description:com.test
 * @Version:1.0
 * Volatile
 */
    
public class T1 {
    private static boolean flag = true;
    private void m(){
        System.out.println("m....satart");
        while (flag){

        }
        System.out.println("m....end");
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            T1 t = new T1();
            @Override
            public void run() {
                t.m();
            }
        },"t1").start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = false;
    }
}
