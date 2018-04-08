package com.liwei2018.liwei0408;

/**
 * Created by dell on 2018/4/8.
 */
public class MyThreadBySynchronized extends Thread {
    public static int m=0;
    @Override
    synchronized public void run() {
        for (int i = 0; i < 10; i++) {
            m++;
        }
        System.out.println(Thread.currentThread().getName()+"     "+m);
    }
}