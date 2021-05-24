package com.corejava.InterviewPrograms;

//Find all substrings of a String in java?

public class Interview8 
{
	public static void main(String args[])  
	 {  
	  String str="pratap";  
	  System.out.println("All substring of pratap are:");  
	   for (int i = 0; i < str.length(); i++) 
	   {  
	   for (int j = i+1; j <= str.length(); j++) 
	   {  
	         System.out.println(str.substring(i,j));  
	    
	   }  
	  }  
    } 
}
