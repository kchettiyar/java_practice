package com.kchetty.MultiThreadingPro._4_Sync;

public class _2_Sync_Ex2 {
	// Only one class obj passing to all threads then threads r waiting in queue to execute the methods.
	
	public static void main(String[] args) {
		_2_Sync_Ex2_1 obj1 = new _2_Sync_Ex2_1();
		_2_Sync_Ex2_2 t1 = new _2_Sync_Ex2_2(obj1, "Dhoni");
		_2_Sync_Ex2_2 t2 = new _2_Sync_Ex2_2(obj1, "Yuvraj");
		_2_Sync_Ex2_2 t3 = new _2_Sync_Ex2_2(obj1, "Virat");
		_2_Sync_Ex2_2 t4 = new _2_Sync_Ex2_2(obj1, "Raina");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class _2_Sync_Ex2_2 extends Thread {
	_2_Sync_Ex2_1 obj = new _2_Sync_Ex2_1();
	String name = "";
	
	public _2_Sync_Ex2_2(_2_Sync_Ex2_1 _obj, String _name) {
		this.obj = _obj;
		this.name = _name;
	}
	
	public void run() {
		this.obj.wish(this.name);
	}
}

class _2_Sync_Ex2_1 {
	public synchronized void wish(String name) {
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