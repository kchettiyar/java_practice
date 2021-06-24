package com.kchetty.FlowControlPro.switchPK;

public class switchEx3 {
	public static void main(String[] args) {
		
		// duplication value error if 'a' uncomment
		m1(97);
	}
	
	public static void m1(int x) {
		switch (x) {
		case 97:
			System.out.println(x);
			break;
		case 98:
			System.out.println(x);
			break;
		case 99:
			System.out.println(x);
			break;
		// case 'a':
			// System.out.println(x);
			// break;

		}
	}
}
