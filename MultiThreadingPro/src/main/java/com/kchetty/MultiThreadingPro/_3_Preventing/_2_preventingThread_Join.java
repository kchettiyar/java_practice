package com.kchetty.MultiThreadingPro._3_Preventing;


public class _2_preventingThread_Join {
	// Join
	
	// Lets declare thread object t1 and t2
	// Join is like waiting(paused itself) for other thread to complete their work
	// then it will resume its own work...
	
	// wait with time limit. like wait t2 for to complete the work for 45mins if not complete start t1.
	
	// Some times we may get interruptedException while calling join() method
	// It is checkedException so we have to handle exception while calling join() method
	
	// Impact of join method
	//	|New Or Born| => t.start() => |Ready Or Runnable| => ThreadScheduler allocate processor => |Running| => run() method completed => |Dead|
	
	//	|New Or Born| => t.start() => |Ready Or Runnable| => ThreadScheduler allocate processor => |Running(if you call method() method then it goes to Waiting state until (read below) then goes to => |Ready Or Runnable state|)| => run() method completed => |Dead|
	// If t2 completes
	// If time expire that set in t1
	// If t2 got interrupted

	// Case:- 3
	// If t1 call join from t2 and t2 call join from t1 then it will be dead state or stuck
	
	// Case:- 4
	// If t1 call join from t1 then it will be dead state or stuck	
	public static void main(String[] args) throws InterruptedException {
		_2_preventingThread_Join_1 t = new _2_preventingThread_Join_1();
		t.start();
		t.join();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("PP Thread");
		}
	}
}

class _2_preventingThread_Join_1 extends Thread{
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("TechM Thread");
			// System.out.println(10/0);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				
			}
		}
	}
}