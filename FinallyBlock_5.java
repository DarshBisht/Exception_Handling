/*finally:- finally is the block that is always executed whether exception is handled or not.
 *
 *
 *Syntax of finally it is used after the try catch block:-
 *	try
 *	{
 *		//risky code
 *	}
 *	catch(Exception e)
 *	{
 *		//handling code
 *	}
 *	finally
 *	{
 *		//clean-up code (If any connection if open in try block then to close the connection we code here in finally block like DB connection close, if any file is open in try block to close the file in finally block, to release the memory that code comes in finally block
 *		//which resources is open in try block we close the resources in finally block. 	
 *	}
 *Ques: Why we don't close the resources in try block why do we close it in finally block?
 *And: If any exception occurs while reading or writing a file, then below code will not
 *execute and thus resources will not close.
 *
 *
 *Here are some rule:-
 *1) We can use multiple catch block with one try block but we can only use single
 *	 finally block with one try block not multiple.
 *2) The statements present in the finally block execute even if the try block
 *	 contains control transfer statements (i.e. jump statements) like return, break or continue.
 *	 means if any return or jump statement happens in try block so finally block will execute first
 *	 then it will move to control statement(jump statement)
 *
 *
 *There are 4 cases where finally block can not run after the try block:-
 *case 1: Using of the System.exit(0) method. in the try block
 *case 2: Causing a fatal error that causes the process to abort like (unchecked exception like error)out of memory etc.
 *case 3: Due to an exception arising in the finally block.
 *case 4: Death of the thread(multi-threading).*/

package com.java.exception_handing;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Control flow of finally block
public class FinallyBlock_5 {
	public static void main(String[] args) {
		try{
			int a=20, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {	// if i do not write this catch block so if exception occurs then finally block will execute first and our program will execute abnormally then it will print exception by default exception handler so it is good practice to write catch block always with try block after that finally block will come.
			System.out.println(e);
		}
		finally {	// This block will always run if exception occurs or not.
			System.out.println("I'm in finally block");
		}
		System.out.println("hello");	// this is to check the normal flow of the program.
	}
};


//File handling
class FileCloseDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = null;
		try {
//			fis = new FileInputStream("D:/abc.txt");	// File exist in drive D folder
			fis = new FileInputStream("D:/abcd.txt");	// File does not exist in the folder
		}
		catch(Exception e) {
			System.out.println("File not found");
		}
		finally {
			//clean-up here
			if(fis!=null) {
				fis.close();	// This close method throw the exception of type IOException thay's why throws IOException is written with main method. If you don't want to write throws IOException there is another way to close the connection that is using try catch inside finally block to see this find below code Connection close without using throws keyword.
			}
			System.out.println("File closed");
		}
	}
};



// Connection close without using throws keyword
class ConnectionCloseDemo {	// This program will not run properly only for understanding purpose
	public static void main(String[] args) {
		Connection con = null;	// for DB connection
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//Do stuff
		}
		catch(Exception ex) {
			//Exception handling stuff
		}
		finally {
			try {
				rs.close();
			}
			catch(SQLException e) {
				/* ignored */
			}
			try {
				ps.close();
			}
			catch(SQLException e) {
				/* ignored */
			}
			try {
				con.close();
			}
			catch(SQLException e) {
				/* ignored */
			}
		}
	}
};