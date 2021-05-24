package com.corejava.Date;

public class Date10 
{
	/* Java Get Current Date:
	 * There are many ways to get current date and time in java. 
	 * There are 3 classes that can be used to get current date.
	 * 
	 * java.util.Date class
	 * java.sql.Date class
	 * java.util.Calendar class
	 * 
	 * 1) Get Current Date by java.util.Date class
	 */
	
	//1st way:

		public static void main(String[] args) 
		{
			java.util.Date date=new java.util.Date();  
			System.out.println(date); 
		} 

}
