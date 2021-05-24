package com.corejava.String;
/*77.what would happen if an immutable object is attempted for modification?
 * 
 * an exception will be generated.
 * 
 */
public class String77
{
	
		 public static void main(String args[]){  
		   String s="Sachin";  
		   s= s.concat("Tendulkar");  
		   System.out.println(s);  
		 }  
		}  
