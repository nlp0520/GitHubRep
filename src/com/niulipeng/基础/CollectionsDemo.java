package com.niulipeng.基础;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Auther:niulipeng
 * @Date:2020/12/6
 * @Description:com.niulipeng.基础
 * @Version:1.0
 */
    
public class CollectionsDemo {
    public static void main(String[] args) {
        Collection cl = new ArrayList();
        cl.add("aa");
        Collections.addAll(cl,"a","b","v");
    }
}
