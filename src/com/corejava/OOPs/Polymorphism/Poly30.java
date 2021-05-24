package com.corejava.OOPs.Polymorphism;

/*30.Is operator overloading supported in java?
 * 
 * No, Operator overloading in not allowed in java. 
 * Therefore java is simpler language than C++.
 * Though, java provides built in support for Operator overloading.
 * Example: "+" operator is overloaded operator. 
 * It can be used to add number as well as it can be used to concatenate the strings.
 */
public class Poly30 
{

	public static void main(String[] args) {
		int a=5,b=5;
		int c=a+b;
		 
		String res="Java"+" "+"Language";
		System.out.println("Integer Addition="+c);
		System.out.println("String Concatenation="+res);
	}

}
