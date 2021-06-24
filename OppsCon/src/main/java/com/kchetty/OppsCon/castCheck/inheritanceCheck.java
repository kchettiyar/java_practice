package com.kchetty.OppsCon.castCheck;

public class inheritanceCheck {

	public static void main(String[] args) {
		AC a = new AC();
		a.m1();
		((AB) a).m1();
		((AA) ((AB) a)).m1();
	}
}

class AA {
	public static void m1() {
		System.out.println("AA");
	}
}

class AB extends AA {
	public static void m1() {
		System.out.println("AB");
	}
}

class AC extends AB {
	public static void m1() {
		System.out.println("AC");
	}
}
