package com.corejava.Date;

import java.text.DateFormat;
import java.util.Date; 

public class Date5 
{
	/* Java Date Format:
	 * There are two classes for formatting date in java: 
	 * DateFormat and SimpleDateFormat.
	 * 
	 * java.text.DateFormat class provides various methods to format and parse
	 * date and time in java in language independent manner. 
	 * The DateFormat class is an abstract class. 
	 * 
	 * java.text.Format is the parent class and java.text.SimpleDateFormat 
	 * is the subclass of java.text.DateFormat class.
	 * 
	 */
  
	//format date and time in java using java.text.DateFormat class.
	
	 public static void main(String[] args) 
	 {  
	        Date currentDate = new Date();  
	        System.out.println("Current Date: "+currentDate);  
	        String dateToStr = DateFormat.getInstance().format(currentDate);  
	        System.out.println("Date Format using getInstance(): "+dateToStr);  
	    }  
}
