package com.liwei0328;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by dell on 2018/3/28.
 */
public class CyclicBarrierTest {
    public static void main(String[] args) {

        ExecutorService exec = Executors.newCachedThreadPool();

        final CyclicBarrier cb = new CyclicBarrier(5);
        // 模拟20个客户端访问
        for (int index = 0; index < 5; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        Thread.sleep((long) (Math.random() * 10000));
                        System.out.println("到达地点: " + NO);
                        cb.await();
                        System.out.println("全部到达开始吃饭: ");
                    } catch (InterruptedException e) {

                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            };
            exec.execute(run);
        }
        // 退出线程池
        exec.shutdown();
    }
}
