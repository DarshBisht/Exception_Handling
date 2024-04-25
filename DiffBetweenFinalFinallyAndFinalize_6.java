/*Difference between final, finally and finalize:-
 *final:- 1. It's a keyword.
 *		  2. Uses: use with variable (variable become constable/fix), method(does not override),
 *			 class(can not be inherit)
 *finally:- 1. It's a block if we do not use block sp we can say it as finally.
 *			2. Uses: Use with either try or try-catch block.
 *finalize:- 1. It's a method. (this is the method which execute before the garbage collector, if any object which is about to delete so before delete it close the all resources related to that object and that code is written into finalize method)
 *			 2. Uses: Method is override for an object. (finalize method directly can be overridden for any object)
 *			 3. Syntax: protected void finalize() throws throwable
 *				{
 *					//clean-up code
 *				};
 *
 *Various possible combinations of try-catch finally:-
 *1. try-catch finally should come together, declaring separate is not possible.
 *2. We can use multiple catch block with try but 1st catch block should be child class
 *	 Exception and then parent class thus you can use multiple catch block and also can
 *	 not use the same exception class
 *
 *eg1: Multiple catch block with try:- 
 *try
 *{
 *}
 *catch(ArithmeticException ae)	 // containing child class
 *{
 *}
 *catch(Exception e)	// containing parent class
 *{
 *};
 *
 *eg2: Multiple catch block which is not allowed:-
 *try
 *{
 *}
 *catch(Exception e)	//Exception is the parent class of the the exception 
 *{
 *}
 *catch(ArithmeticException ae)	// this is not allowed because every exception will be handled by parent class it's self so there no use of child class.
 *{
 *};
 *
 *eg3: The below exception classes can be used in both parent child catch block means it can be replaced up to down.
 *try
 *{
 *}
 *catch(ArithmeticException e) 		//catch(ArrayIndexOutOfBoundException e) this is also right
 *{
 *}
 *catch(ArrayIndexOutOfBoundException e)	//catch(ArithmeticException e) this is also right
 *{
 *};
 *
 *3. Inside try block you can use  nested try-catch block but after try block catch block
 *	 is also must and inside catch block you can also use nested try-catch block.
 *eg1: try
 *	  {
 *		try
 *		{
 *		}
 *		catch("write exception class")
 *		{
 *		}
 *	  }
 *	  catch("write exception class")
 *	  {
 *	  };
 *eg2: try
 *	  {
 *	  }	
 *	  catch("write exception class")
 *	  {
 *		try
 *		{
 *		}
 *		catch("write exception class")
 *		{
 *		}
 *	  };
 *4. Inside finally block you can use try-catch block
 *eg:
 * try
 *	  {
 *	  }	
 *	  catch("write exception class")
 *	  {
 *	  }
 *	  finally
 *	  {
 *		try
 *		{
 *		}
 *		catch("write exception class")
 *		{
 *		}
 *	  };
 **/

package com.java.exception_handing;

public class DiffBetweenFinalFinallyAndFinalize_6 {

	public static void main(String[] args) {
		// 0) try-catch block inside try block
				try{
					System.out.println("I'm in outer try block 0");
				}
				catch(ArithmeticException e)
//				catch(ArrayIndexOutOfBoundsException e)
				{
				}
				catch(Exception e)
//				catch(ArrayIndexOutOfBoundsException e)
//				catch(ArithmeticException e)
				{
				}
				
		// 1) try-catch block inside try block
		try{
			System.out.println("I'm in outer try block 1");
			try{
				 System.out.println("I'm in outer try nested try block 1");
			}
			catch(Exception e)
			{
			}
		}
		catch(Exception e)
		{
		}
		
		// 2) try-catch block inside catch block
		try{
			System.out.println("I'm in outer try block 2");
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			try{
				System.out.println("I'm in outer catch nested try block 2");
			}
			catch(Exception e2)
			{
			}
		}
		
		// 3) try-catch block inside try and catch block
		try{
			System.out.println("I'm in outer try block 3");
			System.out.println(10/0);
			try{
			}
			catch(Exception e2)
			{
			}
		}
		catch(Exception e)
		{
			try{
				System.out.println("I'm in outer catch nested try block 3");
			}
			catch(Exception e2)
			{
			}
		}
		
		// 4) try-catch block inside finally block
		try{
			System.out.println("I'm in outer try block 4");
		}
		catch(Exception e)
		{
		}
		finally {
			try{
				System.out.println("I'm in outer finally nested try block 4");
			}
			catch(Exception e2)
			{
			}
		}
		
		// 5) try-finally try-catch block
				try{
					System.out.println("I'm in outer try block 5");
				}
				finally {
					System.out.println("I'm in outer finally block 5");
				}
				try {
					System.out.println("I'm in outer try block 5.1");
				}
				catch(Exception e)
				{
				}
	}
};
