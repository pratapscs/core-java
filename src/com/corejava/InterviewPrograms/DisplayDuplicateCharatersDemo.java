package com.corejava.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *  program o print duplicate charaters with no of occurences in java?
 *  ex: java --  o/p : a:2
 *  
 *  1.create s string in which duplicates has to be removed
 *  2.wrie a method displayDuplicates which accepts strings
 *  3.in displayDuplicates mehod create a hashmap with charater
 *    as key and occurence as value (Charater,Integer).
 *  4.convert String o charater array.
 *  5.Loop through the each character in an array.
 *  6.take each charater from array and check for key in hashmap if it is not 
 *  present in hashmap add to hashmap wih charater as key and 1 as value.
 *  7.if it present in hashmap add the key as charaer and increment the count.
 *  8.loop through the each character in the map and print only
 *  value with ocuurence greater than 1.  
 *  
 */

public class DisplayDuplicateCharatersDemo {
	
	public static void main(String[] args) {
	
		String str="java";

		displayDuplicates(str);
	}
	
	public  static void displayDuplicates(String str){
		
		Map<Character,Integer> map=new HashMap<>();
		
		char[] charaters=str.toCharArray();
		
		for(char c: charaters)
		{
			if(!map.containsKey(c)){
				map.put(c,1);
			}else
			{
				map.put(c, map.get(c)+1);
			}
			
			Set<Map.Entry<Character,Integer>> entrySet=map.entrySet();
			
			for(Map.Entry<Character,Integer> entry: entrySet){
				
				if(entry.getValue()>1){
					System.out.printf("%s : %d  %n",entry.getKey(),entry.getValue());
				}
			}
		}
		
	}
}
