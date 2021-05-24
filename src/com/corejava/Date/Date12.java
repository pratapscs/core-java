package com.corejava.Date;

public class Date12 
{
	//2) Get Current Date by java.sql.Date class
	
	public static void main(String[] args) {
		
		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis);  
		System.out.println(date);  
	}

}
