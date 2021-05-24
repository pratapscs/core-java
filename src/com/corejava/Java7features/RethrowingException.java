package com.corejava.Java7features;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
 
public class RethrowingException
{
 
 public static void main(String[] args) {
 
  try { 
 
   rethrow();
 
  } catch(IOException e) { 
 
   System.out.println(e.getMessage());
 
  }
 
 }
 
 // here mentioning precise rethrow instead of catch type throw

@SuppressWarnings("deprecation")
private static void rethrow() 
   throws FileNotFoundException , MalformedURLException 
{
 
  try {
 
   // FileReader Constructor throws FileNotFoundException 
	  
   @SuppressWarnings({ "resource", "unused" })
FileReader fileReader = new FileReader("C://file.txt");
 
   // toURL method of File class throws MalformedURLException 
   File file = new File("C://file.txt");
   file.toURL();
 
   // Instead of catching it as IOException and throwing
   // the same IOException in the throws clause above
   // we can now catch any sub-class type and throw super-class
   // type exception, mentioning what possibilities try block can
   // throw in the throws clause mentioned above.
   // Here the method try block throw two exceptions as 
   // FileNotFoundException and MalformedURLException
   // we caught it in catch statement and rethrow it as 
   // IOException. Here compiler knows what exactly its been thrown
 
  } catch (IOException e) {
 
   throw e;
 
  } 
 
 }
 
}