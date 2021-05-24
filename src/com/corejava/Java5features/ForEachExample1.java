package com.corejava.Java5features;

/*For-each loop:
 * It is mainly used to traverse array or collection elements.
 * 
 * Advantage:
 * It makes the code more readable.
 * It elimnates the possibility of programming errors.
 * 
 * Syntax: (The colon in the syntax can be read as "in.")
 * for(data_type variable : array | collection){} 
 * 
 * Enhanced for loops are simple but inflexible. 
 * 
 * They can be used when you wish to step through the elements of the array in first-to-last order,
 * and you do not need to know the index of the current element. 
 * In all other cases, the "standard" for loop should be preferred.
 * 
 * Two additional statement types, break and continue, can also control the behavior 
 * of enhanced for loops.
 * 
 */
public class ForEachExample1 
{
	 public static void main(String args[])
	 {  
		   int arr[]={12,13,14,44};  
		  
		   for(int i:arr){  
		     System.out.println(i);  
		   }  
		  
		 }   

}
