package com.corejava.ExceptionHandling.Exceptions;
/*
 * -java.lang.Object
 *  -java.lang.Throwable
 *   -java.lang.Exception
 *    -java.lang.IOException
 *     -java.lang.FileNotFoundException
 * 
 * java.lang.FileNotFoundException is a Checked (compile time) Exception in java.
 * 
 * FileNotFoundException could be generated 
 * 
 * 1.When try to read from file from path that doesn’t exists (using FileInputStream) 
 *   could throw compile time FileNotFoundException.
 * 2.When try to write to file on path that doesn’t exists (using FileOutputStream) 
 *   could throw compile time FileNotFoundException, or
 * 3.When we try to acces file from invalid path using RandomAccessFile could throw 
 *   compile time FileNotFoundException.
 *   
 * FileNotFoundException could also be generated when file exists but its is inaccessible 
 * may be because of some security reasons.
 * 
 */

//Read text from file using FileInputStream in java file IO

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class ReadFileUsingFileInputStream {
	
   	public static void main(String... args) {
 
          	FileInputStream fis = null;
          	try {
                 	// if file doesn't exist FileNotFoundException will be thrown at
                 	// runtime
                 	fis = new FileInputStream("c:/myFile.txt");
 
                 	System.out.println("Reading from text file using FileInputStream > ");
                 	
                 	int ch;
                 	
                 	while ((ch = fis.read()) != -1) { //read till end of file
                       	System.out.print((char) ch);
                 	}
 
          	} catch (FileNotFoundException fnfe) {
                 	fnfe.printStackTrace();
          	} catch (IOException e) {
                 	e.printStackTrace();
          	} finally {
                 	try {
                       	if (fis != null)
                              	fis.close(); //close FileInputStream
                 	} catch (IOException e) {
                       	e.printStackTrace();
                 	}
          	}
 
   	}
}
