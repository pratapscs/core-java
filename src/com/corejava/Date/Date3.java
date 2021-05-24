package com.corejava.Date;

public class Date3 
{
	/* java.sql.Date :
	 * java.sql.Date class represents only date in java. 
	 * 
	 * It inherits java.util.Date class.
	 * 
	 * The java.sql.Date instance is widely used in JDBC because it represents 
	 * the date that can be stored in database.
	 * 
	 */
	
	//get current date

	public static void main(String[] args) 
	{  
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
        System.out.println(date);  
    }  
}
