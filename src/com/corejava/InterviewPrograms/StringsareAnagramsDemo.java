package com.corejava.InterviewPrograms;

import java.util.Arrays;

/* write a program to check two strings are anagrams are not using arrays
 * comaprison? 
 * two string are anagrams if they contain same charaters but in different order
 * 
 * 1.take two strings as input
 * 2.convert two strings to charater array
 * 3.sort two charater arrays using arrays.sort();
 * 4.compare two string arrays if they are equal they are anagrams
 *  otherwise they are not.
 */
public class StringsareAnagramsDemo {

	public static void main(String[] args) {
		
		//String str1="java";
		String str1="mava";
		String str2="avaj";
		
		System.out.println("Both strings are anagrams:"+anagramCheck(str1, str2));
	}
	public static boolean anagramCheck(String str1,String str2)
	{
		char[] charArrayFromString1=str1.toCharArray();
		char[] charArrayFromString2=str2.toCharArray();
		
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);
		
		return Arrays.equals(charArrayFromString1, charArrayFromString2);
	}
}
