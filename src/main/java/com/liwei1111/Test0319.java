package com.liwei1111;

/**
 * Created by dell on 2018/3/19.
 */
public class Test0319 implements Runnable{
    private int count=15;
    @Override
    public void run() {
//        synchronized (this) {

            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "运行  count= " + count--);
                try {
                    Thread.sleep((int) Math.random() * 10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//            }
        }

    }
}
