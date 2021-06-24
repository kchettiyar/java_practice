package CheckInstanceOf;

public class checkIns {

	public static void main(String[] args) {
		ch1 c1 = new ch1();
		chO ch3 = (ch2)c1;
		
		
	}
}

//example 1
/*
 * public static void main(String[] args) { ch c = new ch();
 * System.out.println(c instanceof chO); System.out.println(c instanceof
 * TestInf); System.out.println(c instanceof TestInf2); System.out.println(c
 * instanceof Object); }
 */

interface TestInf {
	void m1();
}

interface TestInf2 {
	void m2();
}

class chO {
	
}

class chOO {
	
}

class ch2 extends chO {
	
}

class ch1 extends ch2 implements TestInf, TestInf2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
	}
}
