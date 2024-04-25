/*throws keyword:- "throws" keyword is used to declare an exception. It gives an information
 * to the caller method that there may occur an exception so it is better for the caller
 * method to provide the exception handling code so that normal flow can be maintained.
 * 
 *Point to note:- 
 *1. If we call a method that declares an exception, we must either caught the exception
 *	 using try catch block or declare the exception using throws keyword or say if there is
 *	 any checked exception, we will get compile time error saying "unreported exception xxx
 *	 must be caught or declared to be thrown". To prevent this compile time error we can
 *	 handle the exception in two ways:	1) By using try-catch 2)By using throws keyword
 *2. throws keyword used to declare the checked exceptions only. If there occurs any
 *	 unchecked exception such as NullPointerException, it is programmers fault that he
 *	 is not performing check up before the code being used.
 *3. It is only used to indicate or throws the compile time exception not to handle the exception.
 * 
 *Syntax:- throws "ExceptionName"*/

package com.java.exception_handing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsKeyword_8 {}	// We are not using this class only of class file naming purpose.



// Use of throws keyword (used to throw the compile time exception to the caller method)
class ReadAndWrite {
	
	void readFile() throws FileNotFoundException {	// Use throws keyword with the method, this throws keyword indicate the exception  to other class method who want to access this method and that class will have to handle the exception accordingly. 
		FileInputStream fis = new FileInputStream("d:/abcd.txt");	//FileInputStream class throws "FileNotFoundException" which is compile time exception or checked exception so we have to handle the exception and for this purpose we have to use either try-catch or throws keyword.
		System.out.println("hi");	// We can provide multiple statement after Exception line
	}
	void saveFile() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("d:/xyz.txt");	//FileOutputStream class throws "FileNotFoundException"
		String s = "This is  a xyz.text file";
	}
}
class TestReadAndWrite {
	
	public static void main(String[] args) {
		ReadAndWrite rw = new ReadAndWrite();
		try {
			// Below method throws the exception
			rw.readFile();	// If we do not use try-catch block to handle the exception it shows the compile time exception: "unhandled exception type FileNotFoundException". 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("This is to check the normal flow of the program");
		try {
			// Below method does not throws the exception
			rw.saveFile();	// when we call this method it generate the xyz.txt file in the d drive the system because we are using FileOutputStream class which is used to write/save the file.
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("This is to check the normal flow of the program");
	}
};
