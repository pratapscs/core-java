package com.corejava.InterviewPrograms;

//find the no.of times each charater is occuring?
//i/p : pratappratap - p:4 , r=2 etc

public class CountNoofOccurencesInString 
{
 public static void main(String[] args) {
	
//	 String str = "pratap";
//	 
//		int i,j;
//		
//		char[] ch = str.toCharArray();
//		
//		for ( i = 0; i < ch.length; i++) 
//		{
//		int counter = 0;
//		
//		char c=str.charAt(i);
//		
//		for ( j = 0; j < ch.length; j++)
//		{
//		if (c==ch[j])
//		{
//		counter++;
//		ch[j]='\u0000';
//		}
//		}
//		if(counter>0)
//			
//			System.out.println(c+"="+counter);
//
//		}
//    }
    
	 String s=new String("pratappratap");
	 
	 int i1=0 , j=0 ; // j=s.length();
		
		if(s != null)
			j= s.length();
		
		char ch='0';
		int a1[]=new int[123];
		
		while(i1<j)
		{
			ch=s.charAt(i1++);
			a1[ch]+=1; // a1[ch] = a[ch]+1 ; 
			           // a1[2] = 1+1 ;
		}
		
		i1=0;
		while (i1<123)
		{
			if(a1[i1] != 0)
			  System.out.println((char)i1 + " repeating times are "+a1[i1]);
			  i1++;
		}
	} 
 }
