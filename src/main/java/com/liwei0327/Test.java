package com.liwei0327;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by dell on 2018/3/27.
 */
public class Test {
    Lock lock = new Lock();
    public static void main(String[] args) throws Exception{
        Test t = new Test();
        ExecutorService threadPool = Executors.newCachedThreadPool();
        for(int i=0; i<5 ;i++){
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    t.print();
                }
            });
        }
        t.print();
    }


    public void print(){
        try {
            lock.lock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        doAdd();
        lock.unlock();
    }
    public void doAdd(){
        try {
            lock.lock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //do something
        System.out.println("doAdd+123"+Thread.currentThread().getName());
        doAdd2();
        lock.unlock();
    }
    public void doAdd2(){
        try {
            lock.lock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //do something
        System.out.println("doAdd2+123"+Thread.currentThread().getName());
        lock.unlock();
    }
}
