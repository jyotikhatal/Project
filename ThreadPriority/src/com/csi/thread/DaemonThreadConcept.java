package com.csi.thread;

class DaemonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("This is daemon thread" +Thread.currentThread().getName());
		} else {
			System.out.println("This is not daemon thread" +Thread.currentThread().getName());
		}
	}
}
public class DaemonThreadConcept {

	public static void main(String[] args) {
		DaemonThread dt0 = new DaemonThread();
		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();
		dt0.setDaemon(true);//first thread is daemon
		dt0.start();//it provides the service to user
		//dt1.setDaemon(true);
		dt1.start();//this is not not thread
		dt2.start();
	}

}
