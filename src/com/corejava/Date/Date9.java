package com.corejava.Date;

import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class Date9 
{
	//convert string into date using java.text.SimpleDateFormat class.
	public static void main(String[] args)
	{  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    try 
	    {  
	        Date date = formatter.parse("31/03/2015");  
	        System.out.println("Date is: "+date);  
	    } 
	    catch
	    (ParseException e) 
	    {
	    	e.printStackTrace();
	    }  
	}  

}
