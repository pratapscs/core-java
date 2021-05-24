package com.corejava.String;
/*62.which classes are used to create mutable Strings in java?
 * 
 * Java StringBuffer class is used to created mutable (modifiable) string.
 * 
 * A string that can be modified or changed is known as mutable string.
 */
public class String62 
{
	 public static void main(String args[]) 
	 {
	      StringBuffer sBuffer = new StringBuffer("test");
	      sBuffer.append(" String Buffer");
	      System.out.println(sBuffer);  
	   }

}
