package com.corejava.FileHandling;

import java.io.FileWriter;
import java.io.PrintWriter;
 
/* PrintWriter class allows us to write formatted data into file. 
 * Rather than writing the byte value of data in file, it is written in 
 * format in which it is available to us.
 * 
 */
public class WriteInFileUsingPrintWriter 
{
    public static void main(String...args) throws Exception {
           PrintWriter out = new PrintWriter(new FileWriter("c:/myFile.txt"));
           out.println("I am learning from Java.com");
           out.close();
           System.out.println("content has been written in c:/myFile.txt");
           
    }
 
}