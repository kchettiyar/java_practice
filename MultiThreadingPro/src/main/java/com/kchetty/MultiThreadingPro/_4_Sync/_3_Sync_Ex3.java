package com.kchetty.MultiThreadingPro._4_Sync;

public class _3_Sync_Ex3 {
	// create multiple objs of same class and passing thread uniquely,
	// all threads symultanously.	
	// here we are getting irregular output because thread operating on diff java objs.
	
	
	public static void main(String[] args) { 
		_3_Sync_Ex3_1 obj1 = new _3_Sync_Ex3_1();
		_3_Sync_Ex3_1 obj2 = new _3_Sync_Ex3_1();
		_3_Sync_Ex3_2 t1 = new _3_Sync_Ex3_2(obj1, "Dhoni");
		_3_Sync_Ex3_2 t2 = new _3_Sync_Ex3_2(obj2, "Yuvraj");
		t1.start();
		t2.start();
	}
}

class _3_Sync_Ex3_2 extends Thread {
	_3_Sync_Ex3_1 obj = new _3_Sync_Ex3_1();
	String name = "";
	
	public _3_Sync_Ex3_2(_3_Sync_Ex3_1 _obj, String _name) {
		this.obj = _obj;
		this.name = _name;
	}
	
	public void run() {
		this.obj.wish(this.name);
	}
}

class _3_Sync_Ex3_1 {
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