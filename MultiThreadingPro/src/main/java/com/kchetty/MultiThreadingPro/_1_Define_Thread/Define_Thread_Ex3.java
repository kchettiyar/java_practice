package com.kchetty.MultiThreadingPro._1_Define_Thread;

public class Define_Thread_Ex3 {
	// The way to define a Thread By implementing Runnable Interface
	
	// It implements runnable interface then set runnable object to thread to start thread job.
	
	// Case Study 
	// Define_Thread_Ex3_1 r = new Define_Thread_Ex3_1();
	// Thread t1 = new Thread();
	// Thread t2 = new Thread(r);
	// Case 1:- t1.start()	=> start seperate thread but will not nothing as it is not associated with any nothing
	// Case 2:- t1.run()	=> Just run like normal method which has nothing
	// Case 3:- t2.start()	=> Will crate thread for r object and run run() method of r object
	// Case 4:- t2.run()	=> Will run r object's run method and just like normal method but not as thread
	// Case 5:- r.start()	=> Will throw CE error because r object does not contain start() method
	// Case 6:- r.run()		=> Will run r object's run method and just like normal method but not as thread
	
	
	
	public static void main(String[] args) {
		Define_Thread_Ex3_1 r = new Define_Thread_Ex3_1();
		Thread t = new Thread(r);
		t.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}

class Define_Thread_Ex3_1 implements Runnable {
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}	
}

