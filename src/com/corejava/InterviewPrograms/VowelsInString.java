package com.corejava.InterviewPrograms;

import java.util.Scanner;

public class VowelsInString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Ener String :");
		
		Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    
	    char[] chars=str.toCharArray();
	    
	    int count = 0;
	    
	    for(char c : chars){
	    	
	    	switch(c){
	    	case 'a': 
	    	case 'e':
	    	case 'i':
	    	case 'o':
	    	case 'u':
	    		
	    		count++;
	    		break;

	    	}
	    }
   	 System.out.println("no of vowels in string = "+count);
		
	}
}
