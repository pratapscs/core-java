package com.corejava.OOPs.Polymorphism;

/* 2.what restrictions are placed on method overloading?
 * 
 * no.of parameters
 * type of parameters
 * order of parameters 
 */
public class Poly2 
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
		}  
	  void sum(int a,int b,int c)
	  {
		  System.out.println(a+b+c);
		  }  
	  
	  public static void main(String args[]){  
	  Poly2 obj=new Poly2();  
	  obj.sum(10,10,10);  
	  obj.sum(20,20);  
	  
	  }  
}
