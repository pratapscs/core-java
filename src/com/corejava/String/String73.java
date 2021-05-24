package com.corejava.String;
/*73.In which package is the StringTokenizer class present?
 * 
 * java.util package
 * 
 */
import java.util.StringTokenizer;  

public class String73 
{
	public static void main(String args[])
	{  
		   StringTokenizer st = new StringTokenizer("my name is pratap"," ");  
		     while (st.hasMoreTokens()) 
		     {  
		         System.out.println(st.nextToken());  
		     }  
		   }  

}
