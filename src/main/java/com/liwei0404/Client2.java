package com.liwei0404;

import java.lang.reflect.Proxy;

/**
 * Created by dell on 2018/4/4.
 */
public class Client2 {
    public static void main(String[] args) {
        Subject subject = (Subject)Proxy.newProxyInstance(Client2.class.getClassLoader(),
                new Class[]{Subject.class},
                new JdkProxySubject(new RealSubject()));
        subject.request();
    }
}
