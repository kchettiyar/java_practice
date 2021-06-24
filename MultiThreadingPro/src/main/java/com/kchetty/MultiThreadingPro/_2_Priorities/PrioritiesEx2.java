package com.kchetty.MultiThreadingPro._2_Priorities;

public class PrioritiesEx2 {
	
	// After setting priority and if you dont get expected result 
	// then dont worry because Windows does not support ThreadPriority
	
	public static void main(String[] args) {
		PrioritiesEx2_1 t = new PrioritiesEx2_1();
		t.setPriority(10);
		t.start();
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Parent Thread");
		}
	}
}

class PrioritiesEx2_1 extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}