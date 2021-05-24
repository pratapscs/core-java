package com.corejava.FileHandling;

/* FileInputStream  >
 * 
 * FileInputStream is not buffered.
 * FileInputStream reads bytes from a file.
 * Every time FileInputStream.read() is called a call is made to read a system file. 
 * FileInputStream.read() reads 1 byte (8-bit) at a time.
 * 
 */

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStream 
{
    public static void main(String... args) 
    {
 
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
 