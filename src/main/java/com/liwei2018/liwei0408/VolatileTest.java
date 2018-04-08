package com.liwei2018.liwei0408;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by dell on 2018/4/8.
 */
public class VolatileTest extends Thread {
    public static void main(String[] args) {
        Thread thread[]=new Thread[10];
        for (int i = 0; i < 10; i++) {
            thread[i]=new MyThreadByVolatile();//结果为99591总是少
//            thread[i]=new MyThreadBySynchronized();
        }
        for (int i = 0; i < thread.length; i++) {
            thread[i].start();
        }
    }
}