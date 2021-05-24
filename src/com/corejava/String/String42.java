package com.corejava.String;
/*42.what are the two ways in which Strings can be concatenated?
 * 
 * '+' operator, concat() method
 * 
 */
public class String42 
{
	public static void main(String a[])
	{
        String b = "jump ";
        String c = "No jump";
        /**
         *  We can do string concatination by two ways.
         *  One is by using '+' operator, shown below.
         */
        String d = b+c;
        System.out.println(d);
        /**
         *  Another way is by using concat() method,
         *  which appends the specified string at the end.
         */
        d = b.concat(c);
        System.out.println(d);
    }

}
