package com.kchetty.OppsCon.check;

public class overloading {
	public static void main(String[] args) {
		overloading o = new overloading();
		
		//Session 1
		// o.m1(5);
		// o.m1(10.5f);
		// o.m1('a');
		// o.m1(56l);
		// o.m1(5.5);
		
		//session 2
		o.m1(new Object());
		o.m1("kamlesh");
		o.m1(new StringBuffer("kamlesh"));
		// o.m1(null);
	}

	private void m1(int i) {
		System.out.println(i + " int values!!!");
	}
	
	private void m1(float f) {
		System.out.println(f + " float values!!!");
	}
	
	private void m1(Object o) {
		System.out.println(o + " object values!!!");
	}
	
	private void m1(String s) {
		System.out.println(s + " String values!!!");
	}
	
	private void m1(StringBuffer sb) {
		System.out.println(sb + " StringBuffer values!!!");
	}
	
	
}
