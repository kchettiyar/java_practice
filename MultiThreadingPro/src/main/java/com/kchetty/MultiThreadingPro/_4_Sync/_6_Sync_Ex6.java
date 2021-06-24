package com.kchetty.MultiThreadingPro._4_Sync;

public class _6_Sync_Ex6 {
	// Read the code properly with output to understand the concept
	
	// Here it is applies class and obj level lock
	
	// While executing thread static sync methods, the remaining threads not allowed  to execute static sync symultiously
	// but remaining threads are allowed execute the following methods symultiously
	// 	=> normal static methods
	//	=> sync instance methods
	//	=> normal instance methods  
	
	// 
	
	
	
	public static void  main(String[] args) { 
		_6_Sync_Ex6_1 obj1 = new _6_Sync_Ex6_1();
		
		_6_Sync_Ex6_2 t1 = new _6_Sync_Ex6_2(obj1, "Dhoni", "m1");
		_6_Sync_Ex6_2 t2 = new _6_Sync_Ex6_2(obj1, "Yuvraj", "m1");
		_6_Sync_Ex6_2 t3 = new _6_Sync_Ex6_2(obj1, "Kholi", "m2");
		_6_Sync_Ex6_2 t4 = new _6_Sync_Ex6_2(obj1, "Raina", "m3");
		_6_Sync_Ex6_2 t5 = new _6_Sync_Ex6_2(obj1, "Sachin", "m4");
		_6_Sync_Ex6_2 t6 = new _6_Sync_Ex6_2(obj1, "Shreenath", "m5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}

class _6_Sync_Ex6_2 extends Thread {
	_6_Sync_Ex6_1 obj;
	String name;
	String method;
	
	public _6_Sync_Ex6_2(_6_Sync_Ex6_1 _obj, String _name, String _method) {
		this.obj = _obj;
		this.name = _name;
		this.method = _method;
	}
	
	public void run() {
		if(this.method.equals("m1")) {
			this.obj.m1(this.name);
		}
		else if(this.method.equals("m2")) { 
			this.obj.m2(this.name);
		}
		else if(this.method.equals("m3")) { 
			this.obj.m3(this.name);
		}
		else if(this.method.equals("m4")) { 
			this.obj.m4(this.name);
		}
		else if(this.method.equals("m5")) { 
			this.obj.m5(this.name);
		}
	}
}

class _6_Sync_Ex6_1 {
	public static synchronized void m1(String name) {
		for(int i = 0; i < 5; i++) {
			System.out.print("m1:- ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) { }
			System.out.println(name);
		}
	}
	
	public static synchronized void m2(String name) {
		for(int i = 0; i < 5; i++) {
			System.out.print("m2:- ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) { }
			System.out.println(name);
		}
	}
	
	public static void m3(String name) {
		for(int i = 0; i < 5; i++) {
			System.out.print("m3:- ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) { }
			System.out.println(name);
		}
	}
	
	public synchronized void m4(String name) {
		for(int i = 0; i < 5; i++) {
			System.out.print("m4:- ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) { }
			System.out.println(name);
		}
	}
	
	public void m5(String name) {
		for(int i = 0; i < 5; i++) {
			System.out.print("m5:- ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) { }
			System.out.println(name);
		}
	}
}