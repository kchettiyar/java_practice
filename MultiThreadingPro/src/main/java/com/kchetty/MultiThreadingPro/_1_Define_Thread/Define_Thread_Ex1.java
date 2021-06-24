package com.kchetty.MultiThreadingPro._1_Define_Thread;

public class Define_Thread_Ex1 {
	// The ways to define a Thread
	//		=> By extending thread class
	//		=> By implementing Runnable Interface
	
	// What start() method does before invoking run method?
	//		=> Register this thread with thread scheduler
	//		=> Perform all other mandatory activity
	//		=> Invoke run() method
	
	// Other Points to consider
	// 	=> start method will always call run() method with no input params
	// 	=> When you extending thread class then you have to override run() method
	//			then only your task will be accomplished else
	//			if run() method is not override then program will be valid but no task will be performed, it is just like nothing
	//	=> Do not override start() method else the program will be a normal one not the thread program. It is recommended not to override start() method 
	
	
	public static void main(String[] args) {
		Define_Thread_Ex1_1 t = new Define_Thread_Ex1_1();
		t.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}

class Define_Thread_Ex1_1 extends Thread {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}