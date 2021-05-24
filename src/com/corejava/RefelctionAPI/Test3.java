package com.corejava.RefelctionAPI;

/* If a type is available but there is no instance then it is possible to obtain 
 * a Class by appending ".class" to the name of the type.It can be used for 
 * primitive data type also.
 */
class Test3
{  
	  @SuppressWarnings("rawtypes")
	public static void main(String args[])
	  {  
	   Class c = boolean.class;   
	   System.out.println(c.getName());  
	  
	   Class c2 = Test3.class;   
	   System.out.println(c2.getName());  
	 }  
	}  
