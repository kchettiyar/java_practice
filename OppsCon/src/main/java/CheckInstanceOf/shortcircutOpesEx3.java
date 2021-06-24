package CheckInstanceOf;

public class shortcircutOpesEx3 {
	public static void main(String[] args) {
		ex1();
	}

	public static void ex1() {
		int x = 10;
		if (++x < 10 && (x / 0) > 10)
			System.out.println("Hello");
		else
			System.out.println("Hi");
	}
}
