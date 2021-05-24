package com.corejava.Innerclasses;

public class AnonymousInnerClasses2 
{
	public static void main(String[] args) 
	{
		B2 obj=new B2()
		{
			public void show()
			{
				System.out.println("Hi");
			}
		};
			obj.show();
		
	}

}
class B2
{
	public void show()
	{
		System.out.println("Hello");
	}
}
