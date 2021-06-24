package com.kchetty.OppsCon.typeCastPK;


public class typeCastPKEx2 {

	//explicit type casting
	
	// explicit type casting formula
	// 1. byte <- short <- int <- long <- float <- double
	// 2. char <- int <- long <- float v double
	
	public static void main(String[] args) {
		double d = 97;
		System.out.println(d);
		
		float f = (float)d;
		System.out.println(f);
		
		long l = (long)f;
		System.out.println(l);
		
		int i = (int)l;
		System.out.println(i);
		
		short s = (short)i;
		System.out.println(s);
		
		char c = (char)i;
		System.out.println(c);
	}
}
