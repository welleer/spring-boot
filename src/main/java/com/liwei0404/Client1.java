package com.liwei0404;

/**
 * Created by dell on 2018/4/4.
 */
public class Client1 {
    public static void main(String[] args) {
        Subject subject = new Proxy1(new RealSubject());
        subject.request();
    }
}
