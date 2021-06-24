package com.kchetty.OppsCon.overridding;

public class sample2 {

	public static void main(String[] args) {
		Sample2_1 s1 = new Sample2_1();
		System.out.println(s1.m1());
		System.out.println(s1.m2());

		Sample2_2 s2 = new Sample2_2();
		System.out.println(s2.m1());
		System.out.println(s2.m2());

		Sample2_1 s3 = new Sample2_2();
		System.out.println(s3.m1());
		System.out.println(s3.m2());
	}
}

class Test_1 {
}

class Test_2 extends Test_1 {
}

class Sample2_1 {
	public Test_1 m1() {
		return new Test_1();
	}

	public Object m2() {
		return new Object();
	}

	public int m3() {
		return 1;
	}
}

class Sample2_2 extends Sample2_1 {
	public Test_2 m1() {
		return new Test_2();
	}

	public Object m2() {
		return new String("dfsd");
		// return new Object();
	}

	public int m3() {
		return 10;
	}
}
