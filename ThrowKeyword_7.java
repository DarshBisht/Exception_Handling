/*throw keyword:- It create exception object manually (by programmer) and hand over to JVM.
 *
 *Points to note:-
 *1. We can throw either checked or unchecked exception but throw is best for customized exception.
 *2. We can only throw class that comes in throwable child class.
 *3. We can not write any statement after throw, otherwise it will provide unreachable statement error.
 *
 *Syntax:- throw new ExceptionName("you can pass message here in string format");
 *
 *
 *Difference between throw and throws keywords:-
 *throw keyword:-
 *1) throw keyword is used to create an exception object manually i.e. by programmer
 *	 (otherwise by default method is responsible to create exception object)
 *2) throw keyword is mainly used for runtime exceptions or unchecked exceptions.
 *3) In case of throw keyword we can throw only single exception
 *4) throw keyword used within the method.
 *5) throw keyword is followed by new instance.
 *6) We can not write any statement after throw keyword and thus it can be used to break
 *	 the statement.
 *throws keyword:-
 *1) throws keyword is used to declare the exception i.e. it indicate the caller method
 *	 that given type of exception can occur so you have to handle it while calling.
 *2) throws keyword is mainly used for compile time exceptions or checked exception.
 *3) In case of throws keyword we can declare multiple exception i.e. -
 *	 void readFile()throws FileNotFoundException, NullPointerException, etc.
 *4) throws keyword is used with method signature.
 *5) throws keyword is followed by class.
 *6) throws keyword does not have any such rule.*/
package com.java.exception_handing;

import java.security.DomainCombiner;
import java.util.Scanner;

public class ThrowKeyword_7 {
	public static void main(String[] args) {
		throw new ArithmeticException();	// Note:- we do not use predefined exception classes this program only for understanding that how throw keyword works.
	}
};


// extending Exception class for compile time exception (checked exception)
class YoungerAgeException extends Exception  {	// this checked exception throw the exception at compile time.
		public YoungerAgeException(String message) {
			super(message);	// this super method provide the exception declaration to the parent class or default exception handler. 
		}
}
class TestYoungerAgeException{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		try {
			if(age<18) {
				// Using throw keyword to create an exception object manually and hand-overing to the JVM and throwing the user defined exception or customized exception.
				throw new YoungerAgeException("You are not eligible to vote");	// If we do not use try-catch block to handle this exception then it throw the compile time exception (by default exception handler) without try catch block you can not execute the program .
//				System.out.println("Hello");	// Note:- you can not write any statement after the throw keyword which is not allowed.
			}
				
			else
				System.out.println("You can vote sucussfully");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("To check the normal flow of the program");	// If it prints on the console it means exception is handled by try catch block.
	}
};		


//extending RuntimeException class for runtime exception (unchecked exception)
class YoungerAgeException2 extends RuntimeException  {	// this unchecked exception throw the exception at runtime (default exception handler).
		public YoungerAgeException2(String message) {
			super(message);
		}
}
class TestYoungerAgeException2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = s.nextShort();
		try {
			if(age<18)
				throw new YoungerAgeException2("You are not eligible to vote");	// If we don't use the try-catch block to handle the exception, default exception handler will throw the exception at runtime and terminate the program abnormally because we are extending runtime exception in YoungerAgeException class. 
			else
				System.out.println("You can vote sucussfully");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("To check the normal flow of the program");	// If it prints on the console it means exception is handled by try catch block.
	}
};		