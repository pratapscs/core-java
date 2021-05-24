package com.corejava.OOPs.Polymorphism;

/*10.what is meant by method overloading with type promotion?
 * One type is promoted to another implicitly if no matching datatype is found.
 * 
 *                 byte
 *                  |
 *                 short
 *                  |
 *       char - >  int  ->  float
 *                  |        |
 *                 long -> double
 *                                 
 */
public class Poly10a 
{
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}  
	  void sum(int a,int b,int c)
	  {
		  System.out.println(a+b+c);
		}  
	  
	  public static void main(String args[])
	  {  
	  Poly10a obj=new Poly10a();  
	  obj.sum(20,20);//now second int literal will be promoted to long  
	  obj.sum(20,20,20);  
	  
	  }  

}
