package com.corejava.String;
/*7.what are the two ways of creating immutable strings?
 * 
 * with new operator and with out new operator
 * 
 * In java, string objects are immutable. 
 * Immutable simply means unmodifiable or unchangeable.
 * Once string object is created its data or state can't be changed but a new 
 * string object is created.
 * 
 */
public class String7 
{
	 public static void main(String args[])
	 {  
		   String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   
		  //  s=s.concat(" Tendulkar");  //s points to the "Sachin Tendulkar",still sachin object is not modified. 
		   
		   System.out.println(s);//will print Sachin because strings are immutable objects  
		 }  	

}
