package com.kchetty.MultiThreadingPro._5_InterThreadComm;

public class _1_InterThreadComm_Ex1_Intro {
	// Two threads can communicate with each other by using wait and notify and notifyAll methods
	// The thread which is expecting updation is responsible to call wait method.
	// Then immediately the thread enter into waiting state

	// The thread which is responsible to perform updation, after performing updation it is responsible to call notify and notifyAll methods
	// then waiting thread will get that notification and continue its execution with those updated items.
	
	// Wait, notify and notifyAll are available in object not class
	
	// to call wait, notify and notifyAll methods on any obj, thread should be owner of that obj.
	// That is the thread should has lock of that obj
	// Hence we can call wait, notify and notifyAll methods only from synchronized area otherwise we will get runtime exception, 
	//   saying exception "IllegalMonitorStateException"
	
	// If thread calls wait method on any obj, it immiately releases lock of that particular obj, entered into waiting state
	// 
	
	
	// If thread call nofity method on any obj it releases lock of that obj, but may not immiately
	// Except wait, notify and NotifyAll, there is no other method where thread releases lock
	
	// These yield, join,sleep methods are not releases a lock
	// These wait, notify,notifyAll methods are releases a lock
	
	// Which of the following is valid?
	//  => If thread call wait method? immiately entred into waiting state with releasing any lock? INVALID
	//  => If thread call wait method, it releases lock of that obj but may not immiately? INVALID
	// 	=> If thread call wait method any obj, it release all locks acquired by that thread and immiately entered into waiting state? INVALID
	//	=> If thread call wait method any obj, it immiately releases the lock of that particular obj and entered into waiting state? VALID

	//	=> If thread call notify method on any obj, it immiately releases the lock of that obj? INVALID
	//	=> If thread call notify method on any obj, it releases the lock of that obj but may not immiately? VALID
	
	// 	Impact of wait method
	//	|New Or Born| => t.start() => |Ready Or Runnable| => ThreadScheduler allocate processor => |Running| => run() method completed => |Dead|
	
	//	|New Or Born| => t.start() => |Ready Or Runnable| => ThreadScheduler allocate processor => |Running(if you call wait() method then it goes to waiting state until it gets notification then it will enter into another waiting state to get lock of obj then => |Ready Or Runnable state|)| => run() method completed => |Dead|
	
	public static void main(String[] args) {
		
		
	}
}

class _1_InterThreadComm_Ex1_Intro_1 {
	
}