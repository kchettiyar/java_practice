package com.kchetty.MultiThreadingPro._4_Sync;

public class _5_Sync_Ex5 {
	// Obj level lock
	// m1 and m2 are sync methods and m3 is normal obj method
	// t1 thread is calling m1 and applied obj lock so then
	// t2 thread is calling m2 which is sync, so t2 thread has to wait until t1 completes because of obj lock
	// t3 thread is calling m3 which is normal method is no need to wait because no applies to normal obj methods
	
	
	
	
	public static void  main(String[] args) {
		_5_Sync_Ex5_1 obj1 = new _5_Sync_Ex5_1();
		_5_Sync_Ex5_2 t1 = new _5_Sync_Ex5_2(obj1, "Dhoni", "m1");
		_5_Sync_Ex5_2 t2 = new _5_Sync_Ex5_2(obj1, "Yuvraj", "m2");
		_5_Sync_Ex5_2 t3 = new _5_Sync_Ex5_2(obj1, "Virat", "m3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class _5_Sync_Ex5_2 extends Thread {
	_5_Sync_Ex5_1 obj = new _5_Sync_Ex5_1();
	String name;
	String method;
	
	public _5_Sync_Ex5_2(_5_Sync_Ex5_1 _obj, String _name, String _method) {
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
	}
}

class _5_Sync_Ex5_1 {
	public synchronized void m1(String name) {
		for(int i = 0; i < 5; i++) {
			System.out.print("m1:- ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) { }
			System.out.println(name);
		}
	}
	
	public synchronized void m2(String name) {
		for(int i = 0; i < 5; i++) {
			System.out.print("m2:- ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) { }
			System.out.println(name);
		}
	}
	
	public void m3(String name) {
		for(int i = 0; i < 5; i++) {
			System.out.print("m3:- ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) { }
			System.out.println(name);
		}
	}
}