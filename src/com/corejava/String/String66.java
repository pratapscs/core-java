package com.corejava.String;
/*66.what is the role of append()?
 * 
 * it is used add the data at the end of existing string
 * 
 * StringBuffer/StringBuilder append() method concatenates the given argument 
 * with this string.
 * 
 */
public class String66 
{
	public static void main(String args[])
	{  
		StringBuffer sb=new StringBuffer("Hello");//StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
	}  

}
