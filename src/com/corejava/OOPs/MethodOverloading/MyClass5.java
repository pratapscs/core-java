package com.corejava.OOPs.MethodOverloading;
/*
 * In the program, 2 is a int, 2 can be casted to double as well, 
 * but rather than casting compiler will call method with int as argument.
 * 
 */
public class MyClass5 
{
	static void m(double x)
	{
        System.out.println("double");
 }
 static void m(int x) {
        System.out.println("int");
 }
 
 public static void main(String args[]) 
 {
        m(2);
 }

}
