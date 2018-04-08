package com.liwei2018.liwei0328;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dell on 2018/3/28.
 */
public class ExchangeTest {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();

        final Exchanger ex = new Exchanger();
        Runnable run = new Runnable() {
            public void run() {
                try {
                    System.out.println("aaa"+Thread.currentThread().getName()+"得到"+ex.exchange("aaa"));
                } catch (InterruptedException e) {

                }
            }
        };
        Runnable run2 = new Runnable() {
            public void run() {
                try {
                    System.out.println("bbb"+Thread.currentThread().getName()+"得到"+ex.exchange("bbb"));
                } catch (InterruptedException e) {

                }
            }
        };
        exec.execute(run);
        exec.execute(run2);
        // 退出线程池
        exec.shutdown();
    }
}
