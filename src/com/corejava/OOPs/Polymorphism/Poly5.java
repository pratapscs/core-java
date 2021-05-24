package com.corejava.OOPs.Polymorphism;
/*5.can overloaded methods have different access modifiers?
 *  yes
 *  
*/
public class Poly5

{
public void display()
{
	System.out.println("display!!");
}
protected void display1() //private or protected 
{
System.out.println("display this");
}
public static void main(String[] args)
{

Poly5 som = new Poly5();

som.display();
som.display1();
}

}