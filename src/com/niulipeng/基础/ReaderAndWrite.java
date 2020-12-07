package com.niulipeng.基础;

import java.io.*;

/**
 * @Auther:niulipeng
 * @Date:2020/12/7
 * @Description:com.niulipeng.基础
 * @Version:1.0
 */
    
public class ReaderAndWrite {
    public static void main(String[] args) {
//        Reader reader = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("d:/aa.txt"));
//            int lr = 0;
            String lr = null;
//            while((lr=reader.read())!=-1){
            while((lr=reader.readLine())!=null){

                System.out.println(lr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("d:/ab.txt"));
            bufferedWriter.write("xinjiade");
            bufferedWriter.flush();//必须刷新才能使用
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
