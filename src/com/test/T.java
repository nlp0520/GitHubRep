package com.test;

import java.util.Scanner;

/**
 * @Auther:niulipeng
 * @Date:2020/11/18
 * @Description:com.test
 * @Version:1.0
 */
    
public class T<sout> {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = str;
        System.out.println(str == str1);
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        System.out.println(str2 == str);//false
    }


}
