package com.kchetty.OppsCon.overiddingTest;

public class sample4 {
	public static void main(String[] args) {
		pa p = new pa();
		p.m1(10);
		
		ch c = new ch();
		c.m1(10);
		
		pa pp = new ch();
		pp.m1(10);
	}
}

class pa {
	String d = "pa";
	public void m1(int... i) {
		System.out.println("parent --- "+ this.d);
	}
}

class ch extends pa {
	String d = "ch";
	public void m1(int i) {
		System.out.println("child --- "+ this.d);
	}
}
