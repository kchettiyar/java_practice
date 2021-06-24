package CheckInstanceOf;

public class shortcircutOpesEx2 {

	public static void main(String[] args) {
		_singleAnd();
		_doubleAnd();
		_singleOr();
		_doubleOr();
	}
	
	public static void _singleAnd() {
		int x = 10, y = 15;
		
		if(++x < 10 & ++y > 15)
			++x;
		else
			++y;
		
		System.out.println("x val " + x + " y val " + y);
	}
	
	public static void _doubleAnd() {
		int x = 10, y = 15;
		
		if(++x < 10 && ++y > 15)
			++x;
		else
			++y;
		
		System.out.println("x val " + x + " y val " + y);
	}
	
	public static void _singleOr() {
		int x = 10, y = 15;
		
		if(++x < 10 | ++y > 15)
			++x;
		else
			++y;
		
		System.out.println("x val " + x + " y val " + y);
	}
	
	public static void _doubleOr() {
		int x = 10, y = 15;
		
		if(++x < 10 || ++y > 15)
			++x;
		else
			++y;
		
		System.out.println("x val " + x + " y val " + y);
	}
}
