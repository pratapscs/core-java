package com.corejava.Date;

public class Date 
{
	/* The java.util, java.sql and java.text packages contains classes 
	 * for representing date and time. 
	 * 
	 * Following classes are important for dealing with date in java.
	 * 
	 * java.util.Date class
	 * java.sql.Date class
	 * java.text.DateFormat class
	 * java.text.SimpleDateFormat class
	 * java.util.Calendar class
	 * java.util.GregorianCalendar class
	 * java.sql.Time class
	 * java.sql.Timestamp class
	 * java.util.TimeZone class
	 * 
	 * 
	 * How to Get Current Date?
	 * There are 4 ways to print current date in java.
	 * 
	 * 1st way:
	 * java.util.Date date=new java.util.Date();  
	 * System.out.println(date);  //Wed Mar 27 08:22:02 IST 2015
	 * 
	 * 2nd way:
	 * long millis=System.currentTimeMillis();  
	 * java.util.Date date=new java.util.Date(millis);  
	 * System.out.println(date);  //Wed Mar 27 08:22:02 IST 2015
	 * 
	 * 3rd way:
	 * long millis=System.currentTimeMillis();  
	 * java.sql.Date date=new java.sql.Date(millis);  
	 * System.out.println(date);  //2015-03-27
	 * 
	 * 4th way:
	 * Date date=java.util.Calendar.getInstance().getTime();  
	 * System.out.println(date);  //Wed Mar 27 08:22:02 IST 2015
	 * 
	 * 
	 */

}
