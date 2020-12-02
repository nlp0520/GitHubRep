package com.niulipeng.collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

/**
 * @Auther:niulipeng
 * @Date:2020/12/2
 * @Description:com.niulipeng.collection
 * @Version:1.0
 * Comparable 内部比较类，定义在元素的类中
 * Comparator 外部比较类，定义在当前类中，注意要将该比较器传入集合内
 */
    
public class CompareDemo implements Comparator {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet((Collection) new CompareDemo());
        hashSet.add(new Peson(1, "zhangsan"));
        hashSet.add(new Peson(3, "lisi"));
        hashSet.add(new Peson(5, "lisi"));
        System.out.println(hashSet);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
