package com.kchetty.OppsCon.check;

public class customOverloading {

	private void m1(Animal a) {
		System.out.println("Animal version");
	}

	private void m1(Monkey m) {
		System.out.println("Monkey version");
	}

	public static void main(String[] args) {
		customOverloading co = new customOverloading();
		
		Animal a = new Animal();
		co.m1(a);
		
		Monkey m = new Monkey();
		co.m1(m);
		
		Animal aa = new Monkey();
		co.m1(aa);
		
		co.m1(null);
	}

}

class Animal {
}

class Monkey extends Animal {
}
