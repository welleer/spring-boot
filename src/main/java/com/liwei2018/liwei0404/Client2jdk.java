package com.liwei2018.liwei0404;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理
 * Created by dell on 2018/4/4.
 */
public class Client2jdk {
    public static void main(String[] args) {
        Subject subject = (Subject)Proxy.newProxyInstance(Client2jdk.class.getClassLoader(),
                new Class[]{Subject.class},
                new JdkProxySubject(new RealSubject()));
        subject.request();
    }
}
