package com.liwei0404;

/**
 * Created by dell on 2018/4/4.
 */
public class RealSubject  implements Subject{
    @Override
    public void request() {
        System.out.println("real");
    }
}
