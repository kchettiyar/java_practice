package com.kchetty.OppsCon.check;

public class inher {

}

interface P1 {
	void m1();
}

interface P2 {
	void m1();
}

interface P3 extends P1, P2 {

}

class P4 implements P3 {
	public void m1() {
	};
}

class P5 implements P1, P2 {
	public void m1() {
	};
}

class P6 extends P4 {
	
}


class A  {
	
}

class D extends A {
	
}

class C extends D {
	
}

