package com.corejava.InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

/* program to remove duplicates from string in java?
 * 
 * 1.create a string in which duplicates has to be removed
 * 2.write a method removeDuplicates which accepts Strings
 * 3.in removeDuplicates method create a hashset.
 * 4.create a StringBuffer
 * 5.Loop through the each charater in the string
 * 6.take each charater rom array and check in hashset if it is not
 *   present in hashset add to hashset and StringBuffer
 * 7.After iterating each charater in string return the string object from the method 
 *  
 */
public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		
		String str="java";
		
		System.out.println(removeDuplicates(str));
	}
	public static String removeDuplicates(String str){
		
		Set<Character> set=new HashSet<>();
		
		StringBuffer  sf=new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);//str.charAt(0) -> j
			
			if(!set.contains(c)){ //if 'j' is not present in hashset
				set.add(c);       //add j to hashset
				sf.append(c);     //j
			}
		}
		return sf.toString();
	}
}
