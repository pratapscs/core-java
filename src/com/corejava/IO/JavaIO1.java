package com.corejava.IO;

/* FileInputStream and FileOutputStream classes are used to read and write data 
 * in file(file handling in java).
 * 
 * FileOutputStream class is an output stream for writing data to a file.
 * 
 * If you have to write primitive values then use FileOutputStream.
 * Instead, for character-oriented data, prefer FileWriter.
 * But you can write byte-oriented as well as character-oriented data.
 * 
 *  
 *      ---------                                   ---------
 *     |         | ----------->11001100110 ------->|         |
 *     |java app |               fout              |         |
 *      ---------                                   ---------
 *                                                   abc.txt
 *     
 */
import java.io.*;  
class JavaIO1
{  
  public static void main(String args[])
  {  
   try{  
     FileOutputStream fout=new FileOutputStream("abc.txt");  
     String s="Java Programming Language";  
     byte b[]=s.getBytes();//converting string into byte array  
     fout.write(b);  
     fout.close();  
     System.out.println("success...");  
    }
   catch(Exception e)
   {
	   System.out.println(e);
	}  
  }  
}  