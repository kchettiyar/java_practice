package com.kchetty.OppsCon.check;

public class intoverloading {

	private void m1(int i) {
		System.out.println(i + " int version");
	}
	
	/*
	 * private void m1(int... i) { System.out.println(i + " int array version"); }
	 */
	
	private void m1(int i, float f) {
		System.out.println("int-float version");
	}
	
	private void m1(float f, int i) {
		System.out.println("float-int version");
	}

	public static void main(String[] args) {
		intoverloading o = new intoverloading();
	
		// session 1
		// o.m1();
		// o.m1(1);
		// o.m1(1,1);
		
		//sesson 2
		o.m1(10, 10.5f);
		o.m1(10.5f, 10);
		// o.m1(10,10);
		// o.m1(10.5f,10.5f);
	}
}
