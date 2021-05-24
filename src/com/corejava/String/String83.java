package com.corejava.String;
/*83.Is the  String class thread safe?
 * yes
 * 
 * String is immutable  ( once created can not be changed )object 
 * 
 * Every immutable object in Java is thread safe ,that implies String 
 * is also thread safe . String can not be used by two threads simultaneously.
 * String  once assigned can not be changed.
 */
public class String83 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		
		String  demo = " hello " ;
		// The above object is stored in constant string pool and its value can not be modified.
		
		demo="Bye" ; //new "Bye" string is created in constant pool and referenced by the demo variable            
		
		// "hello" string still exists in string constant pool and its value 
		//is not overrided but we lost reference to the  "hello"string  
	}

}
