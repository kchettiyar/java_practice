package com.kchetty.MultiThreadingPro._1_Define_Thread;

public class Define_Thread_Ex2 {
	// Override start() method details
	
	//	=> Do not override start() method 
	//		else the program will be a normal one not the thread program. 
	//		It is recommended not to override start() method.
	
	// => Alterway way for start() override method 
	//		start new thread then check line super.start() will invoke thread start() method as thread 
	//		in this way we can override start method if we want else dont override start()
	
	// Once thread started then you cant restart the same thread... It will be in dead state
	
	public static void main(String[] args) {
		Define_Thread_Ex2_1 t = new Define_Thread_Ex2_1();
		t.start();
		// t.start();
		System.out.println("Main method");
	}
}

class Define_Thread_Ex2_1 extends Thread {
	public void start() {
		super.start();
		System.out.println("Start Method");
	}
	public void run() {
		System.out.println("Run Method");
	}
}