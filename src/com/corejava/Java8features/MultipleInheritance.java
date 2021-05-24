package com.corejava.Java8features;


public class MultipleInheritance implements A,B
{
public static void main(String args[])
{
	MultipleInheritance cObj=new MultipleInheritance();
	
    cObj.printUsingA();
    cObj.printUsingB();
}  
}
