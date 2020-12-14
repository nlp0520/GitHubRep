package com.niulipeng.基础;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther:niulipeng
 * @Date:2020/12/14
 * @Description:com.niulipeng.基础
 * @Version:1.0
 * 获取本机的IP地址
 * WQ-20171211BABF/192.168.0.104    主机名+IP地址
 */
    
public class GetIp {
    public static void main(String[] args) {
        try {
            System.out.println(InetAddress.getLocalHost());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
