package com.niulipeng;

/**
 * @Auther:niulipeng
 * @Date:2020/11/16
 * @Description:com.niulipeng
 * @Version:1.0
 */
    
public class PaiXu {
    public static void main(String[] args) {
        int[] arr = {9,4,6,2,1,3,7};
        //冒泡排序
//        for (int i = 0; i < arr.length; i++) {//外层控制循环次数
//            for (int j = 0; j < arr.length -1 - i ; j++) {//内层比较相邻两个数的大小
//                if(arr[j] > arr[j+1]){
//                    int tmp;
//                    tmp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
        //选择排序
        for (int i = 0; i < arr.length; i++) {//外层控制当前数组起始位置的比较
            for (int j = i; j < arr.length-1; j++) {//内层是从当前位置和之后的数据依次比较
                if(arr[i]<arr[j+1]){
                    int tmp;
                    tmp = arr[j+1];
                    arr[j+1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1] + "--");
        }
    }
}
