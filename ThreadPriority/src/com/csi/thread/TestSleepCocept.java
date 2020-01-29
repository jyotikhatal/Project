package com.csi.thread;

class Test3 extends Thread {

	public void run()
	{
		int i;
		for (i = 1; i < 5; i++)
			try {
				Thread.sleep(1000);
				System.out.println("CSI");
			} 
		catch (InterruptedException e)
		{
				e.printStackTrace();
			}
	}
}

public class TestSleepCocept {

	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		t3.start();
		
		//Thread t = new Thread();
		//t.run();
		
	
		

	}

}
