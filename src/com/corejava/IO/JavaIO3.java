package com.corejava.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/* Reading the data of current java file and writing it into another file.
 * 
 * We can read the data of any file using the FileInputStream class 
 * whether it is java file, image file, video file etc.
 * 
 */
public class JavaIO3 
{
	@SuppressWarnings("resource")
	public static void main(String args[])throws Exception{  
	FileInputStream fin=new FileInputStream("JavaIO3.java");  
	FileOutputStream fout=new FileOutputStream("JavaIO.java");  
	int i=0;  
	while((i=fin.read())!=-1)
	{  
	fout.write((byte)i);  
	}  
	fin.close();  
	}  

}
