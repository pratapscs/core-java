package com.corejava.InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

/* write a java program to print duplicate elemets in array?
 * 
 * 1.create and initialize input array.
 * 2.create an empty set and name it as non duplicate set
 * 3.create ans empty set and name it as duplicate set
 * 4.Iterate through the each element in array and check whether
 *   non duplicates contains the element.if it is 
 *   present add i to the duplicate set.
 * 5.if it not present add it to non duplicate set.
 * 6.Finally print the elements in duplicate set.  
 */
public class DuplicateElementsinArray {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		String duplicates[] =new String[]{"java","spring","hibernate","java"};
	    
		Set nonDuplicatesSet=new HashSet<>();
		
		Set duplicatesSet=new HashSet<>();
		
		for (String string : duplicates ) {
			if(!nonDuplicatesSet.contains(string)){
				nonDuplicatesSet.add(string);
			}else{
				duplicatesSet.add(string);
			}
		}
		System.out.println(duplicatesSet);
	}
}
