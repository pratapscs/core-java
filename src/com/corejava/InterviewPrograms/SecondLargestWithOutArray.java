package com.corejava.InterviewPrograms;

/*write a java program to find the second largest number without using array?
 * 
 */
public class SecondLargestWithOutArray 
{
	public static void main(String args[])
	{ 
	 
	int numbers[] = {6,3,37,12,46,5,64,21};
	int highest = 0;
	int second_highest = 0;
	 
	for(int n:numbers){
	 
	if(highest < n){
	 
	      second_highest = highest;
	      highest = n;
	 
	 } else if(second_highest < n){
	 
	                second_highest = n;
	 
	}
	 
	}
	        System.out.println("First Max Number: "+highest);
	        System.out.println("Second Max Number: "+second_highest);
	 }
}
