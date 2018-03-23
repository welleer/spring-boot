package com.webStocket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by dell on 2018/3/12.
 */
public class MyTest {

//        private Lock lock = new ReentrantLock();
        public void testMethod(){
//            lock.lock();
            for (int i = 0 ;i < 5;i++){
                System.out.println("ThreadName = " + Thread.currentThread().getName() + (" " + (i + 1)));
            }
//            lock.unlock();
        }
    }