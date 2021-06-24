package com.kchetty.MultiThreadingPro._1_Define_Thread;

public class Define_Thread_Ex4 {
	public static void main(String[] args) {
		Define_Thread_Ex4_1 r = new Define_Thread_Ex4_1();
		Thread t = new Thread(r);
		t.start();
		
		System.out.println(t.getName());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("java_dancing");
		System.out.println("Executed By:- " + Thread.currentThread().getName());
		// System.out.println(10/0);
	}
}

class Define_Thread_Ex4_1 extends Thread {
	public void run() {
		System.out.println("Child Thread");
		System.out.println("Executed By:- " + Thread.currentThread().getName());
		
	}
}