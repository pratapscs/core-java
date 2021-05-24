package com.corejava.InterviewPrograms;

public class A1 
{
	 public void display() 
	    {
	        StackTraceElement ste[] = Thread.currentThread().getStackTrace();
	        System.out.println("method is called from " + ste[2]);
	    }

}
