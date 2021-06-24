package CheckInstanceOf;

public class shortcircutOpes {

	public static void main(String[] args) {
		if (m1() || m2()) {
			System.out.println("condition satisfied");
		} else
			System.out.println("condition not satisfied");

		System.out.println((m3() & m4()) + " num condition satisfied");

	}

	public static boolean m1() {
		System.out.println("m1 method");
		return true;
	}

	public static boolean m2() {
		System.out.println("m2 method");
		return true;
	}

	public static int m3() {
		System.out.println("m3 method");
		return 4;
	}

	public static int m4() {
		System.out.println("m4 method");
		return 5;
	}
}
