package com.corejava.Java7features;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class TryWithResourceBlock {
 
 public static void main(String[] args) {
 
  // try-with-resources block was added into 
  // Java 7 which ensures all of its resources 
  // being automatically closed when the try block exits.
  // The resources which we need to close and forget 
  // while coding is automatically being closed by
  // try-with-resources block. The resources which
  // could be closed by this block should implement
  // interface java.lang.AutoCloseable
 
  try(BufferedReader br = new BufferedReader(new FileReader("c://try.txt"));  
		  
		BufferedWriter bw = new BufferedWriter(new FileWriter("c://copy.txt"))) { 
 
   String inputLine = "";
 
   while((inputLine = br.readLine()) != null) { 
 
    bw.write(inputLine);
    bw.newLine();
 
   }
 
   System.out.println("Reader and Writer are automatically closed ... ");
 
  } catch(IOException e) { 
 
   e.printStackTrace();
 
  }
 
 }
 
}