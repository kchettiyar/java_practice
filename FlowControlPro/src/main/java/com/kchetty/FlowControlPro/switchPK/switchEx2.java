package com.kchetty.FlowControlPro.switchPK;

public class switchEx2 {
	public static void main(String[] args) {
		byte x = 9;
		
		m2(x);
	}

	public static void m1(byte x) {
		switch (x) {
		case 10:
			System.out.println(10);
		case 100:
			System.out.println(100);
			// case 1000:
			// System.out.println(1000);
		}
	}

	public static void m2(byte x) {
		switch (x + 1) {
		case 10:
			System.out.println(10);
			break;
		case 100:
			System.out.println(100);
			break;
		case 1000:
			System.out.println(1000);
			break;
		}
	}
}
