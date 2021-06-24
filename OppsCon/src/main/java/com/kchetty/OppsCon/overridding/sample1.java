package com.kchetty.OppsCon.overridding;

public class sample1 {
	public static void main(String[] args) {
		parent p = new parent();
		p.property();
		p.marriage();
		
		child c = new child();
		c.property();
		c.marriage();
		
		parent p1 = new child();
		p1.marriage();
		// c.marriageNew();
		
	}
}

class parent {
	public void property() {
		System.out.println("property version");
	}

	public void marriage() {
		System.out.println("parent marriage version");
	}
}

class child extends parent {
	
	// @Override
	public void marriage() {
		System.out.println("child marriage version");
	}

	public void marriageNew() {
		System.out.println("new child marriage version");
	}
}
