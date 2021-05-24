package com.corejava.Date;

import java.sql.Date; 
public class Date4 
{
	//convert string into java.sql.Date using valueOf() method.
	
	public static void main(String[] args) 
	{  
	    String str="2015-03-31";  
	    Date date=Date.valueOf(str);//converting string into sql date  
	    System.out.println(date);  
	}  

}
