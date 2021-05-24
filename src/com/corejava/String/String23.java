package com.corejava.String;
/*23.how it is possible for two string objects with identical values not to be 
 * equal under == operator?
 * 
 * 
 * 
 */
public class String23
{
	public static void main(String[] args)
	   {
	       String str1 = "abc";
	       String str2 = str1;
	       String str5 = "abc";
	       String str3 = new String("abc");
	       String str4 = new String("abc");
	       System.out.println("== comparison - "+ (str1 == str2));
	       System.out.println("equals method - " + str1.equals(str2));
	       System.out.println("== comparison - " + str3 == str4);
	       System.out.println("equals method - " + str3.equals(str4));
	       System.out.println("== comparison - " + (str1 == str5));
	   }

}
