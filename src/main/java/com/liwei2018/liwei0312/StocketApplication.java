package com.liwei2018.liwei0312;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StocketApplication {

	public static void main(String[] args) {
//		int i = 1;
//		float f = 1f;
//		double d = 1;
//		long l = 1;
//		short s = 1;
//		boolean b = true;
//		char c = 'c';
//		byte b1 = 100;
//		Integer ii = 1;
//		System.out.println("int"+i);
//		System.out.println("float"+f);
//		System.out.println("double"+d);
//		System.out.println("long"+l);
//		System.out.println("short"+s);
//		System.out.println("boolean"+b);
//		System.out.println("char"+c);
//		System.out.println("byte"+b1);
//		System.out.println("-----------");
//		System.out.println("Integer"+ii);
//		String str = new String("str");
////		str ="abc";
//		System.out.println("String"+str);

//
//		ExecutorService cachedThreadPool = Executors.newScheduledThreadPool(5);
//
//		for (int i = 0; i < 5; i++) {
//			final int index = i;
//			try {
//				Thread.sleep(index * 1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//
//			cachedThreadPool.submit(new Runnable() {
//
//				@Override
//				public void run() {
//					System.out.println(Thread.currentThread().getName());
//					System.out.println(index);
//					Thread.interrupted();
//				}
//			});
////			cachedThreadPool.execute(new Runnable() {
////
////				@Override
////				public void run() {
////					System.out.println(Thread.currentThread().getName());
////					System.out.println("good"+index*2);
////				}
////			});
////			cachedThreadPool.execute(new Runnable() {
////
////				@Override
////				public void run() {
////					System.out.println(Thread.currentThread().getName());
////					System.out.println("good"+index*2);
////				}
////			});
////			cachedThreadPool.execute(new Runnable() {
////
////				@Override
////				public void run() {
////					System.out.println(Thread.currentThread().getName());
////					System.out.println("good"+index*2);
////				}
////			});
//		}

		SpringApplication.run(StocketApplication.class, args);
	}
}
