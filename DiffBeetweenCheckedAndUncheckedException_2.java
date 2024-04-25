/*Difference b/w checked and unchecked exception:-
 *Note:- Wrong Concept- Compile time exception occurs at compile time and runtime
 *						exception occur at runtime.
 *		 Right Concept- All the exception occur at runtime.
 *Checked exception:- Compiler inform or alert that exception can occur in future and for that we use the try-catch
 *						block to run the program that is called compile time exception in this compiler can check the exception.
 *						i)Checked exception are the exceptions that are checked and handled at compile time.
 *						ii)The program gives a compilation error if a method throws a checked exception.
 *						iii)If some code within a method throws a checked exception, then the method must
 *							either handle the exception or it must specify the exception using throws keyword.
 *						iv)A checked exception occur when the chances of failure are too high.
 *						v)They are direct sub-class of Exception class but do not inherit from RuntimeException. 
 *Unchecked exception:- Compiler could not detect/check the error or exception during the compilation and the exception occur
 *						during the runtime is call runtime exception in this program made the exception.
 *						i)Unchecked exception are the exceptions that are not checked at compile time.
 *						ii)The program compiles fine because the compiler is not able to check the exception.
 *						iii)A method is not forced by compiler to declare the unchecked exception
 *							thrown by it's implementation. Generally, such method are almost always don not declare them, as well.
 *						iv)Unchecked exception occurs mostly due to programming mistakes.
 *						v)They are direct subclass of RuntimeException class.*/


package com.java.exception_handing;

import java.io.FileInputStream;

public class DiffBeetweenCheckedAndUncheckedException_2 {}	// This class is not for use only for class naming purpose.


// Checked exception
class CheckedException {

	public static void main(String[] args) {
		
//		FileInputStream fis = new FileInputStream("d:/abc.java");	// Without try catch block it show the compile time error which is handled by compiler the compiler alert that exception can come in future please handle it by try catch.
//		Class.forName("com.mysql.jdbc.Driver");	
		
		// Handling the exception through try catch block, now it will not show the compile time error the program will execute and show the result in runtime.
		try {
			FileInputStream fis = new FileInputStream("d:/abc.java");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
};



// Unchecked exception
class UncheckedException {
	public static void main(String[] args) {
		int a=20, b=0;
		int c=a/b;		// Exception occurred in this line / by zero (ArithmeticException) in this we don't need to use try catch block. 
		System.out.println(c);
	}
};