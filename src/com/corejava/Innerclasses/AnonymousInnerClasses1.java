package com.corejava.Innerclasses;

public class AnonymousInnerClasses1 
{
	public static void main(String[] args) 
	{
		B1 obj=new C();
		
			obj.show();
	}

}
class B1
{
	public void show()
	{
		System.out.println("Hello");
	}
}
class C extends B1
{
	public void show()
	{
		System.out.println("Hi ");
	}

	
}
