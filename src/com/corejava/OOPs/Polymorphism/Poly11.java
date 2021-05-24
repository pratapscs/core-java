package com.corejava.OOPs.Polymorphism;

/*
 * 11.what is the problem of performing method overloading with type promotion?
 * One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitely.
 * 
 * Method Overloading with Type Promotion in case of ambiguity   
 * 
 */
public class Poly11
{
	  void sum(int a,long b){System.out.println("a method invoked");}  
	  void sum(long a,int b){System.out.println("b method invoked");}  
	  
	  @SuppressWarnings("unused")
	public static void main(String args[]){  
	  Poly11 obj=new Poly11();  
	//  obj.sum(20,20);//now ambiguity  
	  }  

}
