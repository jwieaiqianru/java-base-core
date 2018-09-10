package com.yezi.coco.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 创建人  ：jiangwei 创建时间：2018/9/5.
 */
public class Buffer {



    public static void main(String[] args) throws IOException {
        Buffer buffer = new Buffer();
        buffer.testBuffer();
    }

    public void testBuffer() throws IOException {
        RandomAccessFile file = new RandomAccessFile("/Users/jiangwei/Documents/学习文档/data/nio_data.txt", "rw");
        FileChannel channel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(48);
        int read = channel.read(buffer);
        while (read != -1) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char)buffer.get());
            }
            buffer.clear();
            read = channel.read(buffer);
        }
        file.close();
    }
}
