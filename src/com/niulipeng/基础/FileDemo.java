package com.niulipeng.基础;

import java.io.File;

/**
 * @Auther:niulipeng
 * @Date:2020/12/6
 * @Description:com.niulipeng.基础
 * @Version:1.0
 * 遍历指定目录下的所有文件
 */
    
public class FileDemo {
    public static void main(String[] args) {

        File file = new File("abc.txt");
        //创建文件
       /* try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        //用递归的方式实现遍历指定目录下所有的文件，报错空指针是因为没有权限
        File file1 = new File("d:/");
        printList(file1);
    }
    private static void printList(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
                printList(files[i]);
            }
        }else{
            System.out.println(file.getAbsolutePath());
        }
    }
}
