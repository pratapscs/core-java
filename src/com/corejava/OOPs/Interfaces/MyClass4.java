package com.corejava.OOPs.Interfaces;

/* two classes  MyClassa and MyClassb having method with same name  
 * [m() ] and some other class extends both of them, then ambiguity will be
 * caused, because m() is non-abstract method in both classes and they 
 * have different implementations.
 * 
 */
class MyClassa 
{
    void m()
    {
           System.out.println("MyClass1 - m()");
    }
}
 
class MyClassb 
{
    void m()
    {
           System.out.println("MyClass2 - m()");
    }
}
public class MyClass4 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		MyClass4 obj=new MyClass4();
	//	obj.m();
		
		
	}

}
