package com.niulipeng.基础;

import java.io.*;

/**
 * @Auther:niulipeng
 * @Date:2020/12/6
 * @Description:com.niulipeng.基础
 * @Version:1.0
 */
    
public class InOutFileStream {
    public static void main(String[] args){
        FileInputStream in = null;
        try {
            in = new FileInputStream(new File("d:/aa.txt"));
            int lr = 0;
            //添加缓冲区的方式
            byte[] bytes = new byte[1024];
//            while ((lr = in.read())!=-1){
            while ((lr=in.read(bytes))!=-1){
//                System.out.print((char)(lr));
                System.out.print(new String(bytes,0,lr));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File("d:/ab.txt"));
            fileOutputStream.write("新加的".getBytes());
            fileOutputStream.write("/r/n第二行".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
