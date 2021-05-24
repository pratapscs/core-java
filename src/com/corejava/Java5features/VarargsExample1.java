package com.corejava.Java5features;
/*
 * Variable Argument (Varargs):
 * 
 * varrags allows the method to accept zero or muliple arguments.
 *  
 * Before varargs either we use overloaded method or take an array as 
 * the method parameter but it was not considered good because it leads 
 * to the maintenance problem. 
 * 
 * If we don't know how many argument we will have to pass in the method, 
 * varargs is the better approach.
 * 
 * 
 */
public class VarargsExample1 
{
	 static void display(String... values)
	 {  
		  System.out.println("display method invoked ");  
		 }  
		  
		 public static void main(String args[])
		 {   
		 display();//zero argument   
		 display("my","name","is","varargs");//four arguments  
		 }   

}
