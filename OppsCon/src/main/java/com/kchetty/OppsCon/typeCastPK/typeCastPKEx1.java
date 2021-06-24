package com.kchetty.OppsCon.typeCastPK;

public class typeCastPKEx1 {
	//implicit type casting

	// implicite type casting formula
	// 1. byte -> short -> int -> long -> float -> double
	// 2. char -> int -> long -> float -> double
	
	public static void main(String[] args) {
		char c = 'a';
		System.out.println(c);
		
		byte b = 10;
		System.out.println(b);
		
		short s = b;
		System.out.println(s);
		
		int x = 'a';
		System.out.println(x);
		
		long l = x;
		System.out.println(l);
		
		float f = l;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
		System.out.println(x);
		
		double y = 10;
		System.out.println(y);
		
		byte yy = 5;
		int xx = yy;
		System.out.println(xx);
		double dd = xx;
		System.out.println(dd);
	}
}
