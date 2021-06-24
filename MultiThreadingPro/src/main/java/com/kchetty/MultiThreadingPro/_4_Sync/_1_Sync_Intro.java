package com.kchetty.MultiThreadingPro._4_Sync;

public class _1_Sync_Intro {
	// Synchronization Concepts
	
	// synchronized is the modifier which only avaible for method and blocks
	// 		not for class and variables
	
	// Example of synchronization
	// Ex. one join account is there with holder A and B. 
	// 		When A is making bill payment of 1000 while B is also trying withdraw 800 money
	// 		but account is having only 1100 rd then it will have data inconsistency issue.
	//		to over come this issue, synchronization will be used as tool to perform this task.
	// What synchronization will do?
	// 		Sync will allow only one person at a time even more than one person is waiting.
	//		ex. A is performing bill payment while B will be in waiting state. 
	//			A is completed then only B will get the chance.
	
	// if multiple thread is trying to operate on same java object then
	//		it may be chance of data inconsistency problem. 
	// To overcome this problem we should go for synchornized keyword.
	// If method declare as synchronized then at time only one thread is allowed 
	// to execute that method or block on given obj. so that data inconsistency problem will be resolved.
	
	// Disadvantage of synchronization
	// It increases waiting time of thread which creates performance issues.
	
	
	// Internally synch concept is implemented by using lock. 
	// every obj in java has unique lock. Wherever we r using synchronized keyword then only lock concept will come into picture.
	
	// If a thread wants to synchronized method on given obj, first it has to get lock of that obj.
	// Once thread got lock then it is allowed to execute any synchronized methods on obj.
	// Once method completes automatically thread releases lock. 
	// Acquiring and releasing lock is internally takes care by JVM and programmer not responsible for this activity.
	
	// While thread executing sync methods on given obj and remaining threads not allowed any sync method symaltenously on the same obj.
	// but remaining threads allow to execute non-sync methods.
	
	// Lock concept is implemented base on obj not on methods.
	// 
	
	public static void main(String[] args) {
		// System.out.println("Parent Thread");
	}
}

class _1_Sync_Intro_1 {
	
}