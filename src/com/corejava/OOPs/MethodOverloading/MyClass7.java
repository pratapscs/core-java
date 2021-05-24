package com.corejava.OOPs.MethodOverloading;

/* program, 2 is a int, 2 can be casted to double but cannot be casted to short, 
 * compiler will cast 2 to double and call method with double as argument.
 */
public class MyClass7 
{
	static void m(double x) {
        System.out.println("double");
 }
 static void m(short x) {
        System.out.println("short");
 }
 
 public static void main(String args[]) {
        m(2);
 }

}
