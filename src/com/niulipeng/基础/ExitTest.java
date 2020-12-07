package com.niulipeng.基础;

import java.io.*;

/**
 * @Auther:niulipeng
 * @Date:2020/12/7
 * @Description:com.niulipeng.基础
 * @Version:1.0
 */
    
public class ExitTest {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        try {
            String str = "";
            while (!str.equals("exit")){
                str = bufferedReader.readLine();
                bufferedWriter.write(str);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStreamReader.close();
                outputStreamWriter.close();
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
