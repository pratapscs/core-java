package com.corejava.OOPs.Polymorphism;

/*10.what is meant by method overloading with type promotion?
 * Method Overloading with Type Promotion if matching found
 * 
 * during the function callif the type parameters does't match the compiler
 * would promote the type and try to find nearest function call this refers to as
 * type pramotion
 */
public class Poly10b 
{
	void sum(int a,int b){
		System.out.println("int arg method invoked");
		}  
	  void sum(long a,long b){
		  System.out.println("long arg method invoked");
		  }  
	  
	  public static void main(String args[]){  
	  Poly10b obj=new Poly10b();  
	  obj.sum(20,20);//now int arg sum() method gets invoked  
	  }  

}
