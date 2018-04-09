package com.liwei2018.liwei0408;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.transaction.Transaction;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by dell on 2018/4/8.
 */
public class VolatileTest extends Thread {

//    private static TransactionTemplate transactionTemplate ;
    //注解式事务
//    @Transactional
    public static void main(String[] args) {
        //编程式事务
//        transactionTemplate.execute(new TransactionCallback<Object>() {
//            @Override
//            public Object doInTransaction(TransactionStatus transactionStatus) {
//                return null;
//            }
//        });

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