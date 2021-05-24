package com.corejava.OOPs.MethodOverloading;

/* program, 2 is a int, 2 can be casted to double and float as well, 
 * but rather than casting to double compiler will cast 2 to float and 
 * call method with float as argument.
 * 
 */
public class MyClass6 
{
	static void m(double x) {
        System.out.println("double");
 }
 static void m(float x) {
        System.out.println("float");
 }
 
 public static void main(String args[]) {
        m(2);
 }
}
