package com.corejava.ExceptionHandling.Exceptions;

//When try to write to file on path that doesn’t exists (using FileOutputStream), 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 

public class WriteStringToFileUsingFileOutputStream {
   
	public static void main(String... args) {
 
          	FileOutputStream fos = null;
          	try {
                 	// if file doesn't exist new file will be created
                 	// if file already exists contends will be overridden.
                 	fos = new FileOutputStream("c:/myFile.txt");
 
                 	String str="we are working at Aptas Devconso Pvt Ltd";
                 	
                 	fos.write(str.getBytes()); //convert String into byte array to write in file
                 	
                 	fos.flush(); //bytes in buffer are written in file
                 	
                 	System.out.println("String str has been written successfully in file "
                              	+ "using FileOutputStream");
                 	
          	} catch (FileNotFoundException fnfe) {
                 	fnfe.printStackTrace();
          	} catch (IOException ioe) {
                 	ioe.printStackTrace();
          	} finally {
                 	try {
                       	if (fos != null){
                              	fos.close(); //close FileOutputStream
                       	}
                 	} catch (IOException e) {
                       	e.printStackTrace();
                 	}
          	}
 
   	}
}
