package com.kchetty.ExceptionHandlingPro.DefaultHandlingPK;

public class DefaultHandlingEx1 {
	// Exception Hierarchy
	// Throwable => Exception and Error
	// Exception => Runtime, IO, Servlet, Remote and IntruptedException
	// Runtime => Arithmetic,NullPointer, IndexOutOfBound(Array, String),
	// IllegalArgument
	//
	// Error => VMError(StackOverFlowError, OutOfMemoryError), AssertionError,

	// Error and RuntimeException are unchecked exceptions
	// IOException, IntruptedException, RemoteException are checked exceptions

	// Partially checked are Exception and throwable

	// The doMoreStuff will generate Exception object then send JVM then
	// JVM will check whether doMoreStuff have exception handling if no then
	// hand-over the control to caller
	// if no where handle exception then it will hand-over control like this
	// It will throw an exception from doMoreStuff -> doStuff -> main if not handle
	// in the method
	// JVM co-ordinate with main and check whether it contains exception handling
	// code if not then it hand-over to default handling exception
	// The default exception handling will print the message and terminate all
	// methods/program abnormally.
	// The exception message will be like
	// ......
	// Exception in thread "main" java.lang.ArithmeticException: / by zero
	// at DefaultHandlingEx1.doMoreStuff(DefaultHandlingEx1.java:18)
	// at DefaultHandlingEx1.doStuff(DefaultHandlingEx1.java:15)
	// at DefaultHandlingEx1.main(DefaultHandlingEx1.java:11)

	public static void main(String[] args) {
		doStuff();
	}

	public static void doStuff() {
		doMoreStuff();
	}

	public static void doMoreStuff() {
		System.out.println(10 / 0);
	}

	public static void tst() {
		
	}
}
