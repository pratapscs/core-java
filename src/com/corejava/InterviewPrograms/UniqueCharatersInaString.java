package com.corejava.InterviewPrograms;

//find the Unique Charaters In a String?

// i/p : pratappratappratap   --- o/p :pratap

public class UniqueCharatersInaString 
{
	
	public static void main(String[] args) {
		
		char ch1='p'; // ch1 - p - 112 (unicode for p)
		char ch2=112; // ch2 - 112 - p (unicode for p)
		
		/*
		 * JVM will check the type of variable if it is char it will perform convertions
		 * 
		 * int (parent)  - char (child)
		 * 
		 * In char variable jvm will will always store unicode values only.
		 * 
		 */
		
		char ch3= 97;
		int i = ch3;
		 // ch3=i;   // can not convert for int to char , this time use TypeCasting.
		ch3=(char)i; //ch3 = ('a')97;
		
		System.out.println(ch1);//p
      	System.out.println(ch2);//p
      	System.out.println(ch3);//a
      	
      	
		// int a[] =new int[123]; //A-Za-z: 65 - 122
      	
      	System.out.println("---logic for Unique charaters in a String ----");
		
		/*  logic for Unique charaters in a String */
		
		//String s=new String("pratappratap");
		
      	//String s=null;
      	
      	String s="null";
      	
      	//System.out.println(s);
      	
		int i1=0 , j=0 ; // j=s.length();
		
		if(s != null)
			j= s.length();
		
		char ch='0';
		int a1[]=new int[123];
		
		while(i1<j)
		{
			ch=s.charAt(i1++);
			a1[ch]=1;
		}
		
		i1=0;
		while (i1<123)
		{
			if(a1[i1] != 0)
			  System.out.println((char)i1 + " ");
			  i1++;
		}
	}
}
