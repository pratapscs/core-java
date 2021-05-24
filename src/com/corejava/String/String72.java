package com.corejava.String;

/*72.what is the role of StringTokenizer class?
 * 
 *  java.util.StringTokenizer class allows you to break a string into tokens.
 *  It is simple way to break string.
 *  
 */
import java.util.StringTokenizer;

public class String72 
{
 
	public static void main(String[] args) 
	{
		String delims = ",";
		String splitString = "one,two,,three,four,,five";
 
		System.out.println("StringTokenizer Example: \n");
		StringTokenizer st = new StringTokenizer(splitString, delims);
		while (st.hasMoreElements()) 
		{
			System.out.println("StringTokenizer Output: " + st.nextElement());
		}
 
		System.out.println("\n\nSplit Example: \n");
		String[] tokens = splitString.split(delims);
		int tokenCount = tokens.length;
		for (int j = 0; j < tokenCount; j++)
		{
			System.out.println("Split Output: "+ tokens[j]);
		}
	}
}
