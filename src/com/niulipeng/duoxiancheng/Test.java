package com.niulipeng.duoxiancheng;

import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * @Auther:niulipeng
 * @Date:2020/12/2
 * @Description:com.niulipeng.duoxiancheng
 * @Version:1.0
 */
    
public class Test {
    private static final ReferenceQueue<Yinyong> QUEUE = new ReferenceQueue();

    public static void main(String[] args) throws IOException {
        Yinyong yy = new Yinyong();
//        SoftReference<byte []> m = new SoftReference<>(new byte[1024*1024*10]);
//        WeakReference<M> wr = new WeakReference(new M());
        yy = null;//此时会将对象回收
        System.gc();
        System.in.read();

        ThreadLocal<Yinyong> tl = new ThreadLocal<>();
        tl.set(new Yinyong());
        tl.remove();//当threadlocal不用时要remove掉防止内存泄漏


        PhantomReference pr = new PhantomReference(new Yinyong(), QUEUE);
    }
}
