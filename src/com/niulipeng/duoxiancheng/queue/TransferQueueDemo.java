package com.niulipeng.duoxiancheng.queue;

import java.util.concurrent.LinkedTransferQueue;

/**
 * @Auther:niulipeng
 * @Date:2020/12/5
 * @Description:com.niulipeng.duoxiancheng.queue
 * @Version:1.0
 */
    
public class TransferQueueDemo {
    static LinkedTransferQueue lq = new LinkedTransferQueue();

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(lq.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        lq.transfer("ccc");//线程放完数据会进入阻塞状态等待消费者来取之后释放
//        lq.put("bbb");//线程放完数据就离开

    }

}
