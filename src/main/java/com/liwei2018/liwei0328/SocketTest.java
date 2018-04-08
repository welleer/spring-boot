package com.liwei2018.liwei0328;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by dell on 2018/3/28.
 */
public class SocketTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5555);
        while (true) {//不加就执行一次监控
            Socket accept = serverSocket.accept();
            byte[] result = new byte[2048];
            accept.getInputStream().read(result);
            System.out.println(new String(result));
        }
    }
}
