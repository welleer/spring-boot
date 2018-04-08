package com.liwei2018.liwei1111;

import java.util.LinkedList;
import java.util.Queue;

//@SpringBootApplication
public class GirlApplication1 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("1");//插入一个元素
		queue.offer("2");
		queue.offer("3");
		//打印元素个数
		System.out.println("queue.size()  " + queue.size());//queue.size()  3
		//遍历打印所有的元素,按照插入的顺序打印
		for (String string : queue) {
			System.out.println(string);
		}
		System.out.println("queue.size()  " + queue.size());//queue.size()  3   上面只是简单循环，没改变队列

		String getOneFrom1 = queue.element();
		System.out.println("getOneFrom1  " + getOneFrom1);//getOneFrom1  1          因为使用前端而不移出该元素
		System.out.println("queue.size()  " + queue.size());//queue.size()  3       队列变啦才怪

		String getOneFrom2 = queue.peek();
		System.out.println("getOneFrom2  " + getOneFrom2);//getOneFrom2  1          因为使用前端而不移出该元素
		System.out.println("queue.size()  " + queue.size());//queue.size()  3       队列变啦才怪

		String getOneFrom3 = queue.poll();
		System.out.println("getOneFrom3  " + getOneFrom3);//getOneFrom3  1          获取并移出元素
		System.out.println("queue.size()  " + queue.size());//queue.size()  2       队列变啦

		String getOneFrom4 = queue.poll();
		System.out.println("getOneFrom4  " + getOneFrom4);//getOneFrom3  1          获取并移出元素
		System.out.println("queue.size()  " + queue.size());//queue.size()  2       队列变啦

//		System.out.println(Thread.currentThread().getName()+"主线程运行开始!");
//		Thread1 mTh1=new Thread1("A");
//		Thread1 mTh2=new Thread1("B");
//		mTh1.start();
//		mTh2.start();
//		try {
//			mTh1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		try {
//			Thread.currentThread().yield();
//			mTh2.join();
////			mTh2.yield();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

//			mTh1.yield();
////		Thread.currentThread().yield();
//		System.out.println(Thread.currentThread().getName()+ "主线程运行1结束!");


//		System.out.println(Thread.currentThread().getName()+"主线程运行开始!");
//		Thread1 mTh1=new Thread1("A");
//		Thread1 mTh2=new Thread1("B");
//		mTh1.start();
//		mTh2.start();
//		System.out.println(Thread.currentThread().getName()+ "主线程运行结束!");

//		Test0319 test0319 = new Test0319();
//
////		Test0319 test03192 = new Test0319();
//		new Thread(test0319, "C").start();//同一个mt，但是在Thread中就不可以，如果用同一个实例化对象mt，就会出现异常
//		new Thread(test0319, "D").start();
//		new Thread(test0319, "A").start();
//		new Thread(test0319, "B").start();
//		new Thread(test03192, "E").start();
//		new Thread(test03192, "F").start();
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

//		int q =1;
//		Integer w =2;
//		System.out.println(q);
//		System.out.println(w.getClass());
//		StringBuffer sb = new StringBuffer();
//		StringBuilder sb2 = new StringBuilder();
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
//			cachedThreadPool.execute(new Runnable() {
//
//				@Override
//				public void run() {
//					System.out.println(Thread.currentThread().getName());
//					System.out.println("good"+index*2);
//				}
//			});
//			cachedThreadPool.execute(new Runnable() {
//
//				@Override
//				public void run() {
//					System.out.println(Thread.currentThread().getName());
//					System.out.println("good"+index*2);
//				}
//			});
//			cachedThreadPool.execute(new Runnable() {
//
//				@Override
//				public void run() {
//					System.out.println(Thread.currentThread().getName());
//					System.out.println("good"+index*2);
//				}
//			});
//		}

//		SpringApplication.run(GirlApplication.class, args);
	}









//	public  void dosonmething(Object o){
//		if(o =  根){
//			System.out.println(o);
//			for(遍历根的子节点) {
//				dosonmething(子节点);
//			}
//		}esle{
//			System.out.println();
//		}
//	}
}
