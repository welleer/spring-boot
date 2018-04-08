package com.liwei2018.liwei0404;

/**
 * Created by dell on 2018/4/4.
 */
public class Proxy1 implements Subject{
    private RealSubject realSubject;

    public Proxy1(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("before");
        try{
            realSubject.request();
        }catch (Exception e){
            System.out.println("error");
            throw e;
        }finally {
            System.out.println("finally");
        }
    }
}
