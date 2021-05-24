package com.corejava.String;
/*25.how to concatenate two different Strings?
 * 
 * + , append, concat 
 * 
 */
public class String25
{
	public static void main(String[] args)
	   {
		
		      String s = "Strings are immutable";
		      s = s.concat(" all the time");
		      System.out.println(s);
		      
		      StringBuffer s1=new StringBuffer();
		      s1.append(s);
		      System.out.println(s1);
		  
	   }

}
