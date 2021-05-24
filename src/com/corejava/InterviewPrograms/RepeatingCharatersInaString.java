package com.corejava.InterviewPrograms;

//find the Repeating Charaters In a String ?
// i/p :pratap , o/p : p is repeating charater

public class RepeatingCharatersInaString 
{
	public static void main(String[] args) {
		
		String s=new String("pratappratap");
		 
		System.out.println(s);
		
		 int i1=0 , j=0 ; // j=s.length();
			
			if(s != null)
				j= s.length();
			
			char ch='0';
			int a1[]=new int[123];
			
			while(i1<j)
			{
				ch=s.charAt(i1++);
				a1[ch]+=1;
			}
			
			i1=0;
			System.out.println("*************");
			while (i1<123)
			{
				if(a1[i1] > 1) // once if they get repeats it indictes repeating 
				  System.out.println((char)i1 + " repeating charecters");
				  i1++;
			}
	} 
}