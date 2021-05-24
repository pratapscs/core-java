package com.corejava.InterviewPrograms;

import java.util.Arrays;

/* 
 * 1.take one strinf as input
 * 2.convert first string to charater array
 * 3.sort the characters in array using arrays.sort() method
 * 4.construct string by using sorted charated array.
 */
public class SortCharatersInString {

	public static void main(String[] args) {
		
		String str="java";
		
		char ch[]= str.toCharArray();
		
		Arrays.sort(ch);
		
		String sortedStr=new String(ch);
		
		System.out.println(sortedStr);
		
		
		
		
	}
}

