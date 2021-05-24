package com.corejava.InterviewPrograms;

/* Using StringIndexOutOfBoundsException:
 * 
 * Initialize i with 0 and iterate over String without specifying any condition. 
 * So it will be always true.
 * 
 * Once value of i will be more than length of String, it will throw 
 * StringIndexOutOfBoundsException exception.
 * 
 * We will catch the exception and return i after coming out of catch block.
 * 
 */
public class Interview7b  
{
	public static void main(String args[])
	{  
	    
		  String helloWorld="This is hello world";  
		  System.out.println("length of helloWorld string :"+getLengthOfString(helloWorld));  
		    
	}    
		  public static int getLengthOfString(String str)  
		  {  
		    int i=0;  
		  try
		  {  
		   for(i=0;;i++)  
		   {  
		    str.charAt(i);  
		   }     
		  }  
		  catch(Exception e)  
		  {  
		  }  
		  return i; 
     }
}
