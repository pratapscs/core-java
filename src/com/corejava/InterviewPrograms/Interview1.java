package com.corejava.InterviewPrograms;

public class Interview1 
{
	static StringBuffer s=new StringBuffer("position 1 no. @ pratap is This");
										  //012345678
	public static void main(String[] args)
	{
		//w  - represents start index of a particular word
		//j  - represents last index of a particular word
		int i=0,j=0,w=0;
		while(i < s.length())
		{
			if(i==0)
				w=0;
			if(s.charAt(i) == ' '|| i==s.length()-1)
			{
				j=i;//i=8  j=8
				if(i== s.length()-1)
				j=i; //j=29
				else
				j--;//j=7
				swap(w,j);
				w=i+1;
				
			}//if(s.charAt(i) == ' ')
			i++;
			
		}//while(i < s.length())
		
		swap(0,s.length()-1);
		
		System.out.println(s);
		
	}//main
	static void swap(int i, int j)
	{
		while(i<j)
		{
			char ch=s.charAt(i);
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, ch);
			i++;
			j--;
		}//while(condition)
	}//static void swap()
}//interview1
