package com.liwei2018.liwei0404;

import org.springframework.cglib.proxy.Enhancer;


/**
 * cglib动态代理
 * Created by dell on 2018/4/4.
 */
public class Client3cglib {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject2.class);
        enhancer.setCallback(new DemoMethodInterceptor());
        RealSubject2 subject = (RealSubject2) enhancer.create();
        subject.request();
    }
}
