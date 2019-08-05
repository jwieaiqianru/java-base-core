package com.yezi.coco.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: jiangwei
 * @Date: 2019-08-05 10:10
 * @Description:
 */
public class BioServer {

    public static void main(String[] args) {

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("BIO服务已启动，监听端口是：" + 8080);
            while (true) {
                Socket accept = serverSocket.accept();
                System.out.println("=================== come in");
                InputStream inputStream = accept.getInputStream();
                //网络客户端把数据发送到网卡，机器所得到的数据读到了JVM内中
                byte [] buff = new byte[1024];
                int len = inputStream.read(buff);
                if(len > 0){
                    String msg = new String(buff,0,len);
                    System.out.println("收到" + msg);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
