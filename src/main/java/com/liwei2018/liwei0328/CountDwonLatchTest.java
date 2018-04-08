package com.liwei2018.liwei0328;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dell on 2018/3/28.
 */
public class CountDwonLatchTest {

    public static void main(String[] args) throws Exception{
        ExecutorService exec = Executors.newCachedThreadPool();

        final CountDownLatch cd = new CountDownLatch(4);
        // 模拟20个客户端访问
        for (int index = 0; index < 3; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        Thread.sleep((long) (Math.random() * 10000));
                        System.out.println("开始干活: " + NO);
                        cd.countDown();
                    } catch (InterruptedException e) {

                    }
                }
            };
            exec.execute(run);
        }
        cd.await();
        System.out.println("全部完成");
        // 退出线程池
        exec.shutdown();
    }

}
