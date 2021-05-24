package com.corejava.Conversion;

import java.text.SimpleDateFormat;
import java.util.Date;

//We can convert String to Date in java using parse() method of DateFormat 
//and SimpleDateFormat classes.

public class StringToDateExample1 
{
	public static void main(String[] args)throws Exception 
	{  
	    String sDate1="13/08/2015";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);  
	}  

}
