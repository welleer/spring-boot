package com.liwei0319;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//@SpringBootApplication
public class GirlApplication1 {

	public static void main(String[] args) {
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		System.out.println("------------------------------");
		for (int i = 0; i < 10; i++) {
			final int index = i;
			try {
				Thread.sleep(index * 100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
			scheduledThreadPool.schedule(new Runnable() {

				@Override
				public void run() {
					System.out.println("delay 3 seconds");
				}
			}, 3, TimeUnit.SECONDS);

//
//			cachedThreadPool.execute(new Runnable() {
//
//				@Override
//				public void run() {
//					System.out.println(index);
//					Map map=Thread.getAllStackTraces();
//					System.out.println("当前线程数量"+map.size());
////					System.out.println("当前线程数量"+Thread.activeCount());
//					System.out.println("当前activeCount线程数量"+Thread.activeCount());
////					Thread.stop();
//				}
//			});
//			cachedThreadPool.execute(new Runnable() {
//
//				@Override
//				public void run() {
//					System.out.println(index);
//					Map map=Thread.getAllStackTraces();
//					System.out.println("当前线程数量"+map.size());
////					System.out.println("当前线程数量"+Thread.activeCount());
//					System.out.println("当前activeCount线程数量"+Thread.activeCount());
////					Thread.stop();
//				}
//			});
//			cachedThreadPool.execute(new Runnable() {
//
//				@Override
//				public void run() {
//					System.out.println(index);
//					Map map=Thread.getAllStackTraces();
//					System.out.println("当前线程数量"+map.size());
////					System.out.println("当前线程数量"+Thread.activeCount());
//					System.out.println("当前activeCount线程数量"+Thread.activeCount());
////					Thread.stop();
//				}
//			});
		}



//		String a = "abc";//字面量形式
//		String b = "abc";//字面量形式
//		String c = new String("abc");//使用new标准的构造对象
//        /*
//            注意：这个虽然看起来似乎要在常量池新建三个字符串对象：ab，c，和拼接生成的abc
//            但是结果是内存中仅有生成的，前面的两个算是过程变量。这反编译得出来的结论，我没测试哟！
//            这样做实际上是一种优化，避免了创建多余的字符串对象，也没有发生字符串拼接问题
//         */
//		String d = "ab" + "c";//字面量形式
//		System.out.println("a == b " + (a == b));//true
//		System.out.println("a == c " + (a == c));//false
//		System.out.println("a == d " + (a == d));//true
//		System.out.println("b == c " + (b == c));//false
//		System.out.println("b == d " + (b == d));//true
//		System.out.println("c == d " + (c == d));//false
//		System.out.println("-----------------");
//		System.out.println("abc" == ("ab" + "c"));//true
//		System.out.println("-----------------");
//		String e = c.intern();//将new出来的字符串对象加入字符串常量池
//		System.out.println(a == e);//true
//
//
//		String wholeNameLine = "com.liwei0319.Test1";
//		String wholeNamePoint = "com.liwei0319.Test2";
//		System.out.println("下面是测试Classloader的效果");
//		testClassloader(wholeNameLine, wholeNamePoint);
//		System.out.println("----------------------------------");
//		System.out.println("下面是测试Class.forName的效果");
//		testForName(wholeNameLine, wholeNamePoint);
	}

	/**
	 * classloader
	 */
	private static void testClassloader(String wholeNameLine, String wholeNamePoint) {
		Class<?> line;
		Class<?> point;
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		try {
			line = loader.loadClass(wholeNameLine);
			point = loader.loadClass(wholeNamePoint);
			//demo = ClassloaderAndForNameTest.class.getClassLoader().loadClass(wholeNamePoint);//这个也是可以的
			System.out.println("line   " + line.getName());
			System.out.println("point   " + point.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Class.forName
	 */
	private static void testForName(String wholeNameLine, String wholeNamePoint) {

		try {
			Class line = Class.forName(wholeNameLine);
			Class point = Class.forName(wholeNamePoint);
			System.out.println("line   " + line.getName());
			System.out.println("point   " + point.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
