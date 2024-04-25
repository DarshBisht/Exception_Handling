/*Try Catch block:- It is use to handle the exception manually 
 * 
 * We can handle exception using 5 keywords:-
 * 1)try 2)catch 3)finally 4)throw 5)throws
 * 
 * Whenever there is exception, the method in which exception occurs will create an object
 * and that object will store three things:- 1)exception name(class name) 2)description 3)stack trace(line where exception occur)
 * 
 * JVM handles the exception in two ways and print the exception:- 
 * 1) default exception handler- When compiler find the exception and when JVM finds
 * 		exception is not handled by anyone then JVM pass the exception object to 
 * 		default exception handler and print the exception, or JVM checks that is 
 * 		any exception is handled if no then it terminates the program and print 
 * 		the exception abnormally.
 * 2) Manually handled (using try catch)- When compiler does not find the exception
 * 		and when JVM finds that exception is handled by anyone then it execute the 
 * 		program normally, it's handled by programmer manually using try catch block.
 * 
 *syntax of try catch:-
 *	try
 *	{
 *		//risky code
 *	}
 *	catch(ExceptionClassName ref.var.name)
 *	{
 *		//handling code	(Alternate way to handle the code)
 *	};
 **/
package com.java.exception_handing;

// try-catch
public class TryCatchBlock_3 {
	public static void main(String[] args) {
		try {
			int a = 10, b = 0, c;
			c = a / b;	//Exception is in this line when compiler check this auto. cursor will go to catch block directly.
			System.out.println(c);
		} catch (ArithmeticException e) {	// e is the reference of the exception which stores the exception properties(exception name, description) and exception occurred in our main method
			System.out.println("You cannot divide by zero"); //Handling exception manually.
		}
	}
}



// Control flow in try catch
class FlowOfTryCatch {
	public static void main(String[] args) {
		
		try {
			System.out.println("1");
//			int a=20, b=2, c;	// No exception occurs with these values
			int a=20, b=0, c;	// Exception occurs with these values
			System.out.println("2");
			c=a/b;	// When JVM find the exception in this line then main method create an exception object and pass it to the JVM then JVM checks is this exception is handled(try catch) if yes then it executes the program. The exception object contains information about the exception, such as the type of exception and the line of code where the exception occurred(to get line no. of exception- e.printStackTrace() is performed) and cursor directly go to the catch block and print the exception and catch block members, when JVM find exception on this line remaining members of try block will not be accessed or printed.
			System.out.println(c);
			System.out.println("3");
		}
		catch(ArithmeticException ae) {	// catch block executes when try block finds any exception.
			System.out.println("4");
//			System.out.println(ae);	// It'll print exception name and message/description.
			ae.printStackTrace();	// It'll print exception name, description and className.MethodName with line number where exception occurred.
			System.out.println("5");
		}
		System.out.println("6");
	}
};