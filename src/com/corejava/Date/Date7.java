package com.corejava.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date7 
{
	/* Java SimpleDateFormat:
	 * 
	 * java.text.SimpleDateFormat class provides methods to format and parse 
	 * date and time in java. 
	 * 
	 * The SimpleDateFormat is a concrete class for formatting and parsing 
	 * date which inherits java.text.DateFormat class.
	 * 
	 */
	//format date in java using java.text.SimpleDateFormat class.
	public static void main(String[] args) 
	{  
	    Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String strDate= formatter.format(date);  
	    System.out.println(strDate);  
	}  

}
