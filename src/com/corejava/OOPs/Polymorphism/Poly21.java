package com.corejava.OOPs.Polymorphism;
/*21.what is meant by method overloading?
 * 
 * If a class have multiple methods by same name but different parameters, 
 * it is known as Method Overloading.
 * 
 * If we have to perform only one operation, having same name of the methods
 * increases the readability of the program.
 * 
 */
public class Poly21 
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
	  Poly21 obj=new Poly21();  
	  obj.sum(10,10,10);  
	  obj.sum(20,20);  

}
}
