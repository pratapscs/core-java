package com.corejava.String;
/*85.Is StringBuilder class thread safe?
 * no
 * 
 * StringBuilder  is same as the StringBuffer , that is it stores the object
 * in heap and it can also be modified 
 * 
 *  StringBuilder is also not thread safe. 
 * 
 */
public class String85 
{
@SuppressWarnings("unused")
public static void main(String[] args) 
{
	StringBuilder demo2= new StringBuilder("Hello");
	// The above object too is stored in the heap and its value can be modified
	
	demo2=new StringBuilder("Bye"); 
	// Above statement is right as it modifies the value which is 
	//allowed in the StringBuilder
	
}
}
