/*Exception:- An exception is an unwanted or unexpected event, which occurs 
 *during the execution of a program i.e. at run time, that disrupts the normal flow of the program
 * 
 *
 *Exception handling:- Exception handling which maintain the normal flow of the program even there
 *is an exception in the program and in exception handling we do not repair the exceptions,
 *even we provide the alternate way to execute the program.
 *
 *
 *Difference b/w Exception & Error:-
 *Exception:-	1)In most of the cases, Exception are occurred by our program.
 *				2)Exception are recoverable i.e programmer can handle them using try-catch block.
 *				3)Exception are two types:- 
 *					i)Compile time exception (Checked exception) 
 *					ii)Runtime exception (unchecked exception) 
 *Error:-	1)Errors are occurred because of lack of system resources; not by our programs
 *			and thus, programmer can not do anything.
 *			2)Error are not recoverable i.e. programmer can handle them to their level.
 *			3)Error is one type:-
 *				i)Runtime exception (unchecked exception)
 *
 *
 *Exception hierarchy:- 1)Object class is the parent class of all the class.
 *						2)Throwable is the child class of Object class.
 *						3)By Throwable class there are two subclasses are divided
 *							i) Exception ii) Error
 *i) In Exception there are thousands of exceptions class are presented but there some main exception as below:-
 *	->ClassNotFoundException
 *	->NoSuchMethodException
 *	->IOException:- 
 *		1)EOFException(EndOfFileExcepton) 
 *		2)FileNotFoundException 
 *		3)InterruptedIOException
 *	->SQLException
 *	->RemoteException
 *	->InterruptedExeption
 *	->RuntimeException:- (Excepting runtime exception all above are compile time exceptions)	
 *		1)ArithmeticException 
 *		2)ClassCastException 
 *		3)NullPointerException 
 *		4)IndexOutOfBoundException:- 
 *			i)ArrayIndexOutOfBoundException
 *			ii)StringIndexOutOfBoundException
 *		5)IllegalArgumentException:-
 *			i)NumberFormatException
 *		6)
 *		there are thousands of exception class in runtime exception.
 *	->
 *	->
 *	->
 *	->
 *	there are many class in exception.
 *ii) In Error there are many error classes presented which comes in runtime exception(Unchecked Exception) but there are some main error classes as below:-
 *	->VirtualMachineError:-
 *		i)StackOverflowError
 *		ii)OutOfMemoryError
 *		iii)
 *		iv)
 *		there are many classes in VirtualMachineError.
 *	->LinkageError:-
 *		i)VerifyError
 *		ii)ClassFormatError
 *		iii)NoClassDefFoundError
 *		iv)
 *		there area many more classes also
 *	->AssertionError
 *	->
 *	->
 *	->
 *	there are many class in error.
 *
 *
 *Difference b/w checked and unchecked exception:- (Note:- to see it's program go to the package- com.java.exception_handing; and class name-DiffBeetweenCheckedAndUncheckedException;)
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

// Exception
public class ExceptionAndExceptionHandling_1 {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println(100/2);
		System.out.println(100/0);	// this line disrupts the normal flow of the program is called exception and this a ArithmetcExcepiton divide by zero.
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
	}
};