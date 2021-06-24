package com.kchetty.OppsCon.typeCastPK;

public class typeCastPKEx3 {

	public static int m1(int v) {
		System.out.println(v);
		return v;
	}

	public static void main(String[] args) throws Exception {
		// System.out.println(m1(1) + m1(2) * m1(3) / m1(4) + m1(5) * m1(6));

		// NewInstanceInstantiator<T>
		
		Object o = Class.forName("com.kchetty.OppsCon.typeCastPK.Customer").newInstance();
		ITest i = (ITest) o;
		System.out.println(i.getClass().getName());
		System.out.println(Class.forName("com.kchetty.OppsCon.typeCastPK.ITest").isInstance(i));
		System.out.println(Class.forName("com.kchetty.OppsCon.typeCastPK.Customer").isInstance(i));
		System.out.println(Class.forName("com.kchetty.OppsCon.typeCastPK.Student").isInstance(i));
	}
}

interface ITest {

}

class Student implements ITest {
}

class Customer implements ITest {
}
