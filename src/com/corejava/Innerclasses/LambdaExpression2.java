package com.corejava.Innerclasses;

public class LambdaExpression2
{
		public static void main(String[] args) 
		{
			
			B3 obj= ()-> { 
				System.out.println("Hello");
			};
			obj.show();
			  
		}
}
@FunctionalInterface
interface B4  
	{
		 void show(); 
		                  
		
	}

