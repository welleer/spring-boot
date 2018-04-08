package com.liwei2018.liwei0328;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by dell on 2018/3/28.
 */
public class SemaphoreTest {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        final Semaphore semp = new Semaphore(2);
        // 模拟20个客户端访问
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        // 获取许可
                        semp.acquire();

                        System.out.println("排队: " + NO);
                        Thread.sleep((long) (Math.random() * 10000));
                        System.out.println("开始打饭: " + NO);

                        // 访问完后，释放
                        semp.release();
                        Thread.sleep((long) (Math.random() * 10000));
                        System.out.println("打完离开: " + NO);
                    } catch (InterruptedException e) {
                    }
                }
            };
            exec.execute(run);
        }
        // 退出线程池
        exec.shutdown();
    }
}