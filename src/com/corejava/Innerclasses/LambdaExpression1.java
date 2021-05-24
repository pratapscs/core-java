package com.corejava.Innerclasses;

public class LambdaExpression1
{
		public static void main(String[] args) 
		{
			// B obj=new B();//in interfaces can not create instance directly.
			// B obj=new Xyz();
			
			B3 obj=new B3()
			{
				public void show()
				{
					System.out.println("Hello");
				}
			};
			obj.show();
			  
		}
}
interface B3   //SAM- Single abstract method
	{
		 void show(); //before 1.7 in interfaces methods only declared
		                    //but in 1.8 method defined also possibles
		
	}
class Xyz implements B3
{
	public void show()
	{
		
	}

}
