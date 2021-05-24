package com.corejava.String;
/*74.when was the StringBuilder class introduced in java?
 * 
 * It is available since JDK 1.5.
 * 
 * Java StringBuilder class is used to create mutable (modifiable) string. 
 * 
 */
public class String74 
{
	  public static void main(String[] args)
	  {
	        String palindrome = "Dot saw I was Tod";
	         
	        StringBuilder sb = new StringBuilder(palindrome);
	        
	       sb.reverse();  // reverse it
	       // sb.toString(); //same String will print
	       
	        System.out.println(sb);
	    }

}
