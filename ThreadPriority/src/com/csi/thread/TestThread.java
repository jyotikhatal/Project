package com.csi.thread;



class Test extends Thread
{
	public void run()
	{
		System.out.println("CSI");
		System.out.println("SHRADHA");
	}
}
public class TestThread {

	public static void main(String[] args) {
		Test t = new Test();
		//t.start();
		t.setName("JYOTI");
		System.out.println(t.getName());
		System.out.println(t.getId());
		t.run();
		
	}

}
