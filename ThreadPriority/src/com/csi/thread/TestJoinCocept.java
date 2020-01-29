package com.csi.thread;

class Test4 extends Thread {
	@Override
	public void run() {
		int i;
		for(i=1;i<=3;i++)
			try
		{
				Thread.sleep(500);
				System.out.println(i);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

	}

}
class Test5 extends Thread {
	@Override
	public void run() {
		int i;
		for(i=1;i<4;i++)
			try
		{
				Thread.sleep(500);
				System.out.println(i);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

	}

}
public class TestJoinCocept {

	public static void main(String[] args) {
		/*Test4 t4 = new Test4();
		Test4 t5 = new Test4();
		Test4 t6 = new Test4();
		t4.start();
		
		try
		{
			t4.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		t5.start();
		t6.start();
		*/
		Test5 t1 = new Test5();
		Test5 t2 = new Test5();
		Test5 t3 =new Test5();
		Test5 t4 =new Test5();
		t1.start();
		/*try
		{
			t1.join();//join first and second thread//when it is wait then thread becomes die
		}
		catch(Exception e){
			e.printStackTrace();
		}*/
		t2.start();
/*		try
		{
			t2.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}*/
		t3.start();
		try
		{
			t3.join();//join first and second thread//when it is wait then thread becomes die
		}
		catch(Exception e){
			e.printStackTrace();
		}
		t4.start();
		try
		{
			t4.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
