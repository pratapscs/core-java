package com.corejava.InterviewPrograms;

//Find length of String without using java inbuilt length method?

public class Interview7a 
{                            //Using toCharArray
	
	 public static void main(String args[])
	 {  
		   
		  String helloWorld="This is hello world";  
		  System.out.println("length of helloWorld string :"+getLengthOfStringWithCharArray(helloWorld));  
		  
	 }  
		  
		@SuppressWarnings("unused")
		public static int getLengthOfStringWithCharArray(String str)  
		 {  
		  int length=0;  
		  char[] strCharArray=str.toCharArray();  
		  for(char c:strCharArray)  
		  {  
		   length++;  
		  }  
		  return length;  
		 }  

}
