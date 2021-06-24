package com.kchetty.OppsCon.assingmentPK;

public class assingmentPKEx1 {

	// Assignment
	// Types of assignment
	// 1. simple -> int x = 10;
	// 2. chained -> a = b = c = 20;
	// 3. compound -> a += 20;
	
	// types of compound operator
	// +=, -=, *=, /= and %=
	// &=, |=, ^=
	// >>=, >>>=, <<=, <<<=
	
	public static void main(String[] args) {
		int a,b,c,d;
		a = b = c = d = 20;
		a += b -= c *= d /= 2;
		
		System.out.println("a:- " + a);
		System.out.println("b:- " + b);
		System.out.println("c:- " + c);
		System.out.println("d:- " + d);
	
		// byte b = 10;
		// b = b + 1; compile time error
		// b++;
		// b += 1;
	}
}
