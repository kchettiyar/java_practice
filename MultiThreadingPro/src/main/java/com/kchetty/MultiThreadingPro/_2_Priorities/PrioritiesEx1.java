package com.kchetty.MultiThreadingPro._2_Priorities;

public class PrioritiesEx1 {
	// Thread Priorities
	
	// Valid range of Thread Priorities is from 1 to 10
	// where 1 is MIN, 5 is NORM and 10 is MAX priorities
	// 5 is the default priority of main thread. 
	// The default priority will be inherited from parent to child for all other threads. 
	
	// Thread scheduler will use priorities to decide whom to give chance first while processor allocation
	// if both priorities is same then thread scheduler can give chance to any thread first. it will be decide randomly
	
	// If you set  priority n < 1 and n > 10 then the RE error will throw
	
	
	public static void main(String[] args) {
		System.out.println("Parent Thread Priority:- " + Thread.currentThread().getPriority());
		// Thread.currentThread().setPriority(15);
		// Thread.currentThread().setPriority(10);
		PrioritiesEx1_1 t = new PrioritiesEx1_1();
		System.out.println("Child Thread Priority:- " + t.getPriority());
	}
}

class PrioritiesEx1_1 extends Thread {

}