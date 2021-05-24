package com.corejava.InterviewPrograms;

//find the Nth Repeating Charaters In a String ?
// i/p:pratappratap   o/p : 2nd repeating charater

public class NthRepeatingCharatersInaString 
{
	static char[] c=new char[123];
	static int top =-1;
	
	public static void main(String[] args) {
		
		String s="pratappratappratap";
		
		int i=0 , len=s.length();

		while(i < len)
	    m1(s.charAt(i++));	
		
		i=0;
		int w1=0; //nth repeating charecter
		while(i <= top) //nth epeating charecter
		{
			int m=0,w=0;// repeating times of a charecter 
		while(m< len)
		{
			if(c[i] == s.charAt(m++))
			{
				w++; //>=2 
				if(w > 1)
				{
					w1++;
					break;
				}
			}//if
		}//while(m< len)
		if(w1==2)
		{
			System.out.println("2 nd repeating charecter is :" +c[i]);
			break;
		}
		
		i++;
		
		}//while(i <= top)
	}
	
	static void m1(char ch) //unique elements logic
	{
		int j=0; 
		boolean b=true;
		
		if(top == -1) c[++top]=ch;
		
		while(j<=top)
			
	    if(c[j++] == ch)
	    {
	    	b=false;
	    	break;
	    }
		if(b)
        c[++top]=ch;
		
	}

}
