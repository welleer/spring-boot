package com.liwei2018.liwei0404;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dell on 2018/4/4.
 */
public class JdkProxySubject implements InvocationHandler {
    private RealSubject realSubject;

    public JdkProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = null;
        try{
            result = method.invoke(realSubject,args);
        }catch (Exception e){
            System.out.println("error");
            throw e;
        }finally {
            System.out.println("finally");
        }
        return result;
    }
}
