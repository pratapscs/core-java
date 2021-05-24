package com.corejava.InterviewPrograms;

import java.util.Arrays;

public class MinimumMaximumArray {

	public static void main(String[] args) {
	    int a[] = new int[]{1,2,4,1,5,7,3,4};
	    
	    Arrays.sort(a);
	    
	    int min = a[0];
	    System.out.println("The minmum value is    " + min);
	    
	    int max = a[a.length - 1];
	    System.out.println("The maximum value is   " + max);
	    
	    for (int i = 0; i < a.length; i++) {
	        System.out.println(a[i]);
	      }
	 }
}
