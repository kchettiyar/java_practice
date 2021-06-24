package com.kchetty.FlowControlPro.ifelsePK;

public class ifelseEx1 {
	public static void main(String[] args) {
		m2();
	}

	public static void m1() {
		boolean x = true;

		if (x = false) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		System.out.println(x);
	}

	public static void m2() {
		if (false)
			if (false)
				System.out.println("Hello");
		else
			System.out.println("Hi");

	}
}
