package com.kchetty.FlowControlPro.switchPK;

public class switchEx1 {
	public static void main(String[] args) {
		// m1('b');
		// m1(10, 20);
		// m1(20, 20, 30);
		m1(69);
	}

	public static void m1(int x) {
		switch (x + 1) {
		case 20 + 50:
			System.out.println("valid");
			break;
		}
	}

	public static void m1(int x, int y, int z) {
		final int c = 20;
		switch (x) {
		case 10:
			System.out.println(x);
			break;
		case c:
			System.out.println(x);
			break;
		default:
			System.out.println("default");
		}
	}

	public static void m1(char i) {
		switch (i) {
		case 97:
			System.out.println(i);
			break;
		case 98:
			System.out.println(i * i);
			break;
		default:
			System.out.println("default");
		}
	}

	public static void m1(int x, int y) {
		switch (x) {
		case 10:
			System.out.println(x);
			break;
		// constant value required // case y:
		case 20:
			System.out.println(x);
			break;
		default:
			System.out.println("default");
		}
	}
}
