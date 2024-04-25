/*Customized Exception or User defined exception:- By using throw keyword we can create
 *checked or unchecked customized exception.*/
package com.java.exception_handing;

public class CustomizedExceptionOrUserDefinedException_9 {}	//We are not using this class only of class file naming purpose.

//Customized Exception of type- checked exception
class UnderAgeException extends Exception {
	UnderAgeException() {
		super("You are under age");
	}
	// Constructor overloading
	UnderAgeException(String msg) {
		super(msg);
	}
}
class TestUnderAgeExcepton {
	public static void main(String[] args) throws UnderAgeException{
		int age = 16;
		if(age<18) {
			// To handle the below compile time exception either you can use try-catch or throws keyword(throws keyword just indicate the caller method that this method throwing the such type of exception).
			// At a time one throw keyword will work (You can not write any statement after throw keyword).
			throw new UnderAgeException();	// Calling No args cons.
//			throw new UnderAgeException("you can not vote");	// Calling parameterized cons.
		}
		else {
			System.out.println("You can vote sucessfully");
		}
		System.out.println("This is to check the normal flow of the program");	// If you use try-catch to handle the exception then this s.o.p statement will work.
	}
};


//Customized Exception of type- Unchecked exception
class UnderAgeException2 extends RuntimeException {
	UnderAgeException2() {
		super("You are under age");
	}
	// Constructor overloading
	UnderAgeException2(String msg) {
		super(msg);
	}
}
class TestUnderAgeExcepton2 {
	public static void main(String[] args) {
		int age = 16;
		try {
			if(age<18) {
				// To handle the below Runtime exception use try-catch(It handles the exception object).
				throw new UnderAgeException2();
			}
			else {
				System.out.println("You can vote sucessfully");
			}
		}	
		catch(UnderAgeException2 uae) {
			uae.printStackTrace();
		}
		System.out.println("This is to check the normal flow of the program");	// If you use try-catch to handle the exception then this s.o.p statement will work.
	}
};