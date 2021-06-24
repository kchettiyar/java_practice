package com.kchetty.MultiThreadingPro._4_Sync;

public class _4_Sync_Ex4 {
	// Here, we are declare method with snychronized and static
	// So, lock apply on class level not obj.
	// Here will get regular output
	
	// If threads wants to execute static sync methods then thread required class lock.
	// once thread got class lock then it is allowed to execute any static sync methds of that class
	// Once method execution completes automatically thread releases lock
	
	
	public static void main(String[] args) { 
		_4_Sync_Ex4_1 obj1 = new _4_Sync_Ex4_1();
		_4_Sync_Ex4_1 obj2 = new _4_Sync_Ex4_1();
		_4_Sync_Ex4_2 t1 = new _4_Sync_Ex4_2(obj1, "Dhoni");
		_4_Sync_Ex4_2 t2 = new _4_Sync_Ex4_2(obj2, "Yuvraj");
		t1.start();
		t2.start();
	}
}

class _4_Sync_Ex4_2 extends Thread {
	_4_Sync_Ex4_1 obj = new _4_Sync_Ex4_1();
	String name = "";
	
	public _4_Sync_Ex4_2(_4_Sync_Ex4_1 _obj, String _name) {
		this.obj = _obj;
		this.name = _name;
	}
	
	public void run() {
		this.obj.wish(this.name);
	}
}

class _4_Sync_Ex4_1 {
	public static synchronized void wish(String name) {
		for(int i = 0; i < 5; i++) {
			System.out.print("Good Morning ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}
}