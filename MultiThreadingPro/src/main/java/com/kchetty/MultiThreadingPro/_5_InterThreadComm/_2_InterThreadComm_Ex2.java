package com.kchetty.MultiThreadingPro._5_InterThreadComm;

public class _2_InterThreadComm_Ex2 {

	public static void main(String[] args) throws InterruptedException {
		_2_InterThreadComm_Ex2_1 t1 = new _2_InterThreadComm_Ex2_1();
		t1.start();
		synchronized(t1) {
			System.out.println("Main thread start");	
			t1.wait();
			System.out.println("Main thread end");
		}
		System.out.println(t1.total);
	}
}

class _2_InterThreadComm_Ex2_1 extends Thread {
	int total = 0;

	public void run() {
		System.out.println("child thread start");
		for (int i = 1; i <= 100; i++) {
			this.total = this.total + i;
		}
		synchronized(this) {
			this.notify();	
			System.out.println("child thread end");
		}
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {}
		System.out.println("End of run method");
	}

}
