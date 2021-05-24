package com.corejava.IO;

import java.io.FileInputStream;

/* FileInputStream class obtains input bytes from a file.
 * It is used for reading streams of raw bytes such as image data. 
 * For reading streams of characters, consider using FileReader.
 * 
 * It should be used to read byte-oriented data for example to read
 * image, audio, video etc.
 * 
 *      ---------                                   ---------
 *     |         | ----------->11001100110 ------->|         |
 *     |         |               fin               |javaapp  |
 *      ---------                                   ---------
 *       abc.txt
 */
public class JavaIO2
{
	public static void main(String args[])
	{  
		  try{  
		    FileInputStream fin=new FileInputStream("abc.txt");  
		    int i=0;  
		    while((i=fin.read())!=-1)
		    {  
		     System.out.print((char)i);  
		    }  
		    fin.close();  
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }  
		 }  

}
