package com.kchetty.MultiThreadingPro._3_Preventing;

public class _4_preventingThread_Sleep {
	// Sleep Features
	
	// We can manually interrupt the thread only target thread is in sleeping/waiting mode.
	// 		The interrupt case can be worsted only if it is complete/Exception due to any other reason.

	
	
	// Impact of Sleep method
	//	|New Or Born| => t.start() => |Ready Or Runnable| => If ThreadScheduler allocate processor => |Running| => run() method completed => |Dead|
		
	//	|New Or Born| => t.start() => |Ready Or Runnable| => ThreadScheduler allocate processor => |Running(if you call sleep() method method then it goes to sleeping state until time expire => |Ready Or Runnable state|)| => run() method completed => |Dead|
	
	public static void main(String[] args) {
		_4_preventingThread_Sleep_1 t = new _4_preventingThread_Sleep_1();
		t.start();
		t.interrupt();
		System.out.println("main thread completes");
	}
}

class _4_preventingThread_Sleep_1 extends Thread {
	public void run() {
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println("I am lazy thread");
				Thread.sleep(2000);	
			}
		}
		catch(InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}
