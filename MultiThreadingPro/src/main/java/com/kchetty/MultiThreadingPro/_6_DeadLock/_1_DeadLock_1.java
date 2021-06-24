package com.kchetty.MultiThreadingPro._6_DeadLock;

public class _1_DeadLock_1 {
	public static void main(String[] args) {

	}
}

class _1_DeadLock_1_1 {
	public synchronized void d1(_1_DeadLock_1_2 b) {
		System.out.println("Thread 1 started execution of d1() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		System.out.println("Thread 1 trying call B's last method");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("Last() method of A");
	} 
}

class _1_DeadLock_1_2 {
	public synchronized void d2(_1_DeadLock_1_1 a) {
		System.out.println("Thread 2 started execution of d2() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		System.out.println("Thread 2 trying call A's last method");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Last() method of B");
	} 
}
