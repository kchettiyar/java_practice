package com.kchetty.MultiThreadingPro._5_InterThreadComm;

public class _3_InterThreadComm_Ex3 {
	// Thread.notify	
	// We can use notify method for notification for only one waiting thread
	// If multiple threads are waiting then only one thread will be notified 
	//		then remaining threads have to wait for further notification
	// Which thread will be notify we can not expect, it depends on JVM

	//
	
	// Thread.notifyAll
	// We can use notifyAll to give notification for all waiting threads of a particular obj.
	// 		then even though multiple threads notified but execution performed one by one 
	//		threads required lock of obj. only one lock is avaible for each obj.
	
	
	
	public static void main(String[] args) {
		// _3_InterThreadComm_Ex3_1 t1 = new _3_InterThreadComm_Ex3_1();
	}
}

class _3_InterThreadComm_Ex3_1 extends Thread {
	public void run() {
		
	}
}
