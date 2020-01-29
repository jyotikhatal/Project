package com.csi.thread;

class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("INSPRIRA MALL");
		System.out.println("I AM THREAD CLASS");

	}

}

 class MyThread2 extends Thread {
 
 @Override public void run() { 
	 System.out.println("PUNE"); 
	 } 
 }
 

public class ThreadPriorityConcept {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		// t1.setDaemon(true);
		t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
	
		 MyThread2 t2 = new MyThread2(); 
		 t2.setPriority(Thread.MIN_PRIORITY);
		 t2.setName("JYOTI");
		 System.out.println(t2.getName());
		 System.out.println(Thread.currentThread());
		
		 t2.setPriority(1);
		 t2.start();
		 
		 //MyThread2 tt2 = new MyThread2();
		 //tt2.start();
		 
	}

	
}
