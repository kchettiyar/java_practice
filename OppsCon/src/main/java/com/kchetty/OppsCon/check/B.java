package com.kchetty.OppsCon.check;

import com.kchetty.OppsCon.A;

public class B {

	public B() {
		A a = new A();
		a.showMsg();
	}
}

class Pro1 {

	protected void m1() {

	}
}

class Pro2 extends Pro1 {

}

class Pro3 {

	public void test() {
		Pro1 _1 = new Pro1();
		_1.m1();

		Pro2 _2 = new Pro2();
		_2.m1();

		Pro1 _3 = new Pro2();
		_3.m1();

	}
}
