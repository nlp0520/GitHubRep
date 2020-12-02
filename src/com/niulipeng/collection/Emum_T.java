package com.niulipeng.collection;

/**
 * @Auther:niulipeng
 * @Date:2020/11/25
 * @Description:com.niulipeng.collection
 * @Version:1.0
 */
public enum Emum_T {
    LANUCH("lanuch"),EVENT("event");

    Emum_T(String name) {
        this.name = name;
    }

    private String name;

    public void show(){
//        System.out.println(this.name);
        Emum_T [] ee = Emum_T.values();
        for (int i = 0; i < ee.length ; i++) {
            System.out.println(ee[i]);
        }
    }

}
