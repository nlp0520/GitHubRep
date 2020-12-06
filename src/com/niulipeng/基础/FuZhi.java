package com.niulipeng.基础;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther:niulipeng
 * @Date:2020/12/6
 * @Description:com.niulipeng.基础
 * @Version:1.0
 * 实现复制文件
 */
    
public class FuZhi {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("D:/aa.txt");
            fileOutputStream = new FileOutputStream("D:/ab.txt");
            int lr = 0;
            while ((lr = fileInputStream.read())!= -1){
                fileOutputStream.write((char)lr);
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
