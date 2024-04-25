/*There are some methods to print exception information:-
 * 1)e.printStackTrace(); - this will print exception name, message/description, stack trace(line number)
 * 2)System.out.println(e)/ System.out.println(e.toString()); - this will print exception name, message/description only
 * 3)System.out.println(e.getMessage()); - this will print message/description only*/
package com.java.exception_handing;

public class MethodsToPrintExceptonInfo_4 {

	public static void main(String[] args) {
		
		try {
			int a=20, b=0, c;
			c=a/b;	//Exception line 
			System.out.println(c);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();	// It prints all the exception object properties
//			System.out.println(ae);	// It prints exception name and message
//			System.out.println(ae.toString());	// It prints exception name and message
//			System.out.println(ae.fillInStackTrace());	// It prints exception name and message
//			System.out.println(ae.getMessage());	// It prints message only
//			System.out.println(ae.getLocalizedMessage());	// It prints message only
//			System.out.println(ae.getClass());	// It prints exception name only
			
		}
	}
};
