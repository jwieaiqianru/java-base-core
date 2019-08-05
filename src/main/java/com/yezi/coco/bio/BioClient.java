package com.yezi.coco.bio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.UUID;

/**
 * @Auther: jiangwei
 * @Date: 2019-08-05 10:10
 * @Description:
 */
public class BioClient {


    public static void main(String[] args) throws IOException {
        Socket client =null;
        try {
             client = new Socket("localhost", 8080);
            OutputStream outputStream = client.getOutputStream();

            //生成一个随机的ID
            String name = UUID.randomUUID().toString();

            System.out.println("客户端发送数据：" + name);
            outputStream.write(name.getBytes());
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            client.close();
        }

    }
}
