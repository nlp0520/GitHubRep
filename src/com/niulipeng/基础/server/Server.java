package com.niulipeng.基础.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Auther:niulipeng
 * @Date:2020/12/14
 * @Description:com.niulipeng.基础.server
 * @Version:1.0
 * 服务端
 */
    
public class Server {
    public static void main(String[] args) throws IOException {
        //启动服务
        ServerSocket socket = new ServerSocket(8080);
        Socket server = socket.accept();
        //------------服务端获取客户端数据
        InputStream inputStream = server.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        String str = dataInputStream.readUTF();
        System.out.println(str);

        //---------服务端向客户端发送数据-----------
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();

        OutputStream outputStream = server.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(str1);

        socket.close();
        inputStream.close();
        dataInputStream.close();
        outputStream.close();
        dataOutputStream.close();


    }
}
