package com.kchetty.OppsCon.overridding;

import java.io.EOFException;
import java.io.IOException;

public class sample3 {

	public static void main(String[] args) {
		sample7 p = new sample7();
		p.m2();
		
		sample6 c = new sample6();
		c.m2();
		
		sample7 pp = new sample6();
		pp.m2();
		
		// sample7.m2();
		// sample6.m2();
	}
}

class sample7 {

	public void m1(int i) throws IOException {

	}
	
	public static void m2() {
		System.out.println("parent");
	}
}

class sample6 extends sample7 {

	public void m1(int i) throws EOFException {

	}
	
	public static void m2() {
		System.out.println("child");
	}
}