package com.kchetty.ExceptionHandlingPro.customermized;

public class customizedException {

	public static void main(String[] args) {
		int age = 99;
		
		try {
			if(age > 60) {
				throw new TooYoungException("too young");
			}
			else if(age < 18) {
				throw new TooOldException("too old");
			}
			else {
				System.out.println("you will get the match!!!");	
			}			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}

class TooYoungException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TooYoungException(String s) {
		// System.out.println(s);
		super(s);
	}
}

class TooOldException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TooOldException(String s) {
		// System.out.println(s);
		super(s);
	}
}
