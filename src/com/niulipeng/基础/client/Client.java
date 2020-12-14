package com.niulipeng.基础.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther:niulipeng
 * @Date:2020/12/14
 * @Description:com.niulipeng.基础.client
 * @Version:1.0
 *
 * 客户端
 */
    
public class Client {
    public static void main(String[] args) throws IOException {
        //建立连接
        Socket socket = new Socket("localhost",8080);
        //------------客户端向服务端发送数据----------
        //创建输入流
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        //传输数据
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        dataOutputStream.writeUTF(str);

        //----------客户端接收服务端返回的数据-----------
        InputStream inputStream = socket.getInputStream();
//        byte[] bytes = new byte[1024];
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String str1 = dataInputStream.readUTF();
        System.out.println(str1);


        socket.close();
        outputStream.close();
        dataOutputStream.close();
        inputStream.close();
        dataInputStream.close();

    }
}
