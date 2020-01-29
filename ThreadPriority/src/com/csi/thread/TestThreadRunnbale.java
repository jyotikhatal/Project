package com.csi.thread;

class Test2 extends Thread implements Runnable
{
	int i;
	public void run()
	{
		for(i=1;i<3;i++)
		{
		System.out.println("JYOTI");
		}
	}
}
public class TestThreadRunnbale {

	public static void main(String[] args) {
		Test2 t1 = new Test2();
		Thread t = new Thread();
		
		t1.run();
		

	}

}
