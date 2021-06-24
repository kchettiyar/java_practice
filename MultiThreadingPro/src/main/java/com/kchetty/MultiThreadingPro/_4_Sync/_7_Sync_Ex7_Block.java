package com.kchetty.MultiThreadingPro._4_Sync;

public class _7_Sync_Ex7_Block {
	
	// If very few lines of code to sync then it is not recommend to declare entire method as sync
	// We have to enclose those few lines of code by using synchronized block
	
	// The main advantage of sync block over synchronized method is, it reduces waiting time of thread and  improve performance of system/application
	// 
	
	// lock concept is applicable for reference type and not for primitive
	// reference type is like obj or ABC.class
	// let int x = 10; if u pass synchronized(x) {} then it will throw error

	// FAQs
	// What is synchronized keyword and where we can apply?
	// => Sync is keyword and applicable for methods and blocks
	
	// Explain advantage of synchronized keyword?
	// => We can resolved data inconsistency problem
	
	// Explain disadvantage of sync keyword?
	// => It is increases waiting time for thread
	
	// What is race condition?
	// => If multiple thread operating on same java object symultiously then there may be chance of data incosistency problem
	// => How to resolve this issue by using synchronized keyword
	
	// What is object lock and when it is required?
	// => Whenever a thread wants to execute synchronized methods of class objs
	
	// What is class level lock and when it is required?
	// => Every class has unique lock level and when thread requires to execute static sync method
	
	// What is the difference between class level lock and object lock?
	// => If thread wants to execute static sync methds then class level lock required.
	// => If thread wants to execute instance sync method then object level lock required.
	
	// While thread executing sync method on the given object, is the remaining allowed to execute to any other sync methods symultiously on same obj?
	// => No
	
	// What is synchronized block?
	// => 
	
	// How to declare sync block?
	// => 
	
	// What is synchronized statement?
	// => The statement present in synchronized methods and blocks are synchronized statement.
	// => 
	
	
	
	public static void main(String[] args) {
		_7_Sync_Ex7_Block_1 obj1 = new _7_Sync_Ex7_Block_1();
		_7_Sync_Ex7_Block_1 obj2 = new _7_Sync_Ex7_Block_1();
		
		_7_Sync_Ex7_Block_2 t1 = new _7_Sync_Ex7_Block_2(obj1, "Dhoni");
		_7_Sync_Ex7_Block_2 t2 = new _7_Sync_Ex7_Block_2(obj2, "Yuvi");
		
		t1.start();
		t2.start();
	}
}

class _7_Sync_Ex7_Block_2 extends Thread{
	_7_Sync_Ex7_Block_1 obj;
	String name;
	
	public _7_Sync_Ex7_Block_2 (_7_Sync_Ex7_Block_1 _obj, String _name) {
		this.obj = _obj;
		this.name = _name;
	}
	
	public void run() {
		this.obj.wish(this.name);
	}
}

class _7_Sync_Ex7_Block_1 {
	public void wish(String _name) {
		// System.out.println("Starting my code:- " + _name);
		;;;;;;;;; // 100 lines of codes here
		
		//synchronized(this) {
		synchronized(_7_Sync_Ex7_Block_1.class) {
			for(int i = 0; i < 5; i++) {
				System.out.print("Good Morning: ");
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {}
				System.out.println(_name);
			}
		}
		
		;;;;;;;;; // 100 lines of codes here
		// System.out.println("Ending my code:- " + _name);
	}
}

