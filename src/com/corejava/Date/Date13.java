package com.corejava.Date;

public class Date13
{
	//3) Get Current Date by java.util.Calendar class
	
	public static void main(String[] args) {
		
		java.util.Date date=java.util.Calendar.getInstance().getTime();  
		System.out.println(date);  
	}

}
