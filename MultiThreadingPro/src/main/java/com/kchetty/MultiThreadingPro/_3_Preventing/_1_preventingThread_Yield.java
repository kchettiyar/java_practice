package com.kchetty.MultiThreadingPro._3_Preventing;

public class _1_preventingThread_Yield {
	// Prevent thread execution by using following methods
	//		=> Yield
	//		=> Join
	//		=> Sleep
	
	// What is need of Yield method?
	// 		Yield method paused current executing thread to give chance for
	//			waiting threads with same priority. 
	//			if it is paused then 
	//			it also in waiting state just like other threads and
	//			will get the chance, depends on ThreadScheduler
	// 		If no waiting thread or low priority thread then 
	// 			current thread keep on continue it's work.
	
	// public static native void yield();
	
	// Some platform will not proper support for yield method
	
	// 	Thread start diagram
	//	|New Or Born| => t.start() => |Ready Or Runnable| => ThreadScheduler allocate processor => |Running| => run() method completed => |Dead|
	
	//	|New Or Born| => t.start() => |Ready Or Runnable| => ThreadScheduler allocate processor => |Running(if you call yeild() method then it goes back |Ready Or Runnable state|)| => run() method completed => |Dead|
	
	public static void main(String[] args) {
		_1_preventingThread_1 t = new _1_preventingThread_1();
		t.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Parent Thread");
			// Thread.yield();
		}
	}
}

class _1_preventingThread_1 extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
