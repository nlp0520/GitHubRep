package com.niulipeng.shejimoshi.celuemoshi;

/**
 * @Auther:niulipeng
 * @Date:2021/2/4
 * @Description:com.niulipeng.shejimoshi.celuemoshi
 * @Version:1.0
 */
public class Test {
    public static void main(String[] args) {
        Cat[] c = {new Cat(6,"zhangsan"),new Cat(2,"lisi"),new Cat(4,"wangwu")};
        sort(c);
        for (int i = 0; i < c.length; i++) {

            System.out.println(c[i]);
        }
    }

    public static void sort(Compareble[] arr){
        //选择排序
        for (int i = 0; i < arr.length; i++) {//外层控制当前数组起始位置的比较
            for (int j = i; j < arr.length-1; j++) {//内层是从当前位置和之后的数据依次比较
                if(arr[i].compareTo(arr[j+1]) == 1){
                    Compareble tmp;
                    tmp = arr[j+1];
                    arr[j+1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
}
