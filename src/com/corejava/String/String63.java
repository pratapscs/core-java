package com.corejava.String;
/*63.what is the difference between StringBuffer and StringBuilder class?
 *                  StringBuffer	                              StringBuilder
 * 1)StringBuffer is synchronized i.e. thread safe.  		 StringBuilder is non-synchronized i.e. not thread safe.
 * It means two threads can't call the methods of			 It means two threads can call the methods of StringBuilder 
 * StringBuffer simultaneously.								 simultaneously.
 *   														 
 * 2)StringBuffer is less efficient than StringBuilder.	     StringBuilder is more efficient than StringBuffer.
 * 
 */
public class String63
{
	//Performance Test of StringBuffer and StringBuilder.
	
	 public static void main(String[] args)
	 {  
	        long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Java");  
	        for (int i=0; i<10000; i++)
	        {  
	            sb.append("Program");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Java");  
	        for (int i=0; i<10000; i++){  
	            sb2.append("Program");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	    }  
}
