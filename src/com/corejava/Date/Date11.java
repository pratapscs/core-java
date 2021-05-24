package com.corejava.Date;

public class Date11 
{
	//2nd way:

	public static void main(String[] args)
	
	{
		long millis=System.currentTimeMillis();  
		java.util.Date date=new java.util.Date(millis);  
		System.out.println(date);
		
	}
		  

}
