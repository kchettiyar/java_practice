package com.kchetty.MultiThreadingPro._3_Preventing;

public class _3_preventingThread_Join {
	public static void main(String[] args) throws InterruptedException {
		_3_preventingThread_Join_1.t = Thread.currentThread();
		
		_3_preventingThread_Join_1 t = new _3_preventingThread_Join_1();
		t.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}
}

class _3_preventingThread_Join_1 extends Thread {
	static Thread t;
	public void run() {
		try {
			t.join();
		}
		catch(Exception ex) {
			
		} 
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}