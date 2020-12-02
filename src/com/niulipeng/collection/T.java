package com.niulipeng.collection;

/**
 * @Auther:niulipeng
 * @Date:2020/11/25
 * @Description:com.niulipeng.collection
 * @Version:1.0
 */
    
public class T {
    Emum_T em = Emum_T.LANUCH;
    Emum_T em1 = Emum_T.EVENT;

    public static void main(String[] args) {
        Emum_T em = Emum_T.LANUCH;
        em.show();
        System.out.println(Emum_T.LANUCH.name());
//        System.out.println(em.show());
    }

}
