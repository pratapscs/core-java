package com.corejava.java.lang.ObjectClass;

public class ToString 
{
	//static int i=999;
	
	/* toString method exists in which class in java?
	 * toString method exists in java.lang.Object class. 
	 * As all classes extends java.lang.Object class by default in java so 
	 * toString method becomes available to all the classes in java.
	 * 
	 * What is purpose of toString() method in java?
	 * toString() method is used to give the String representation of any object 
	 * in java.
	 * 
	 * Which java api classes override toString() method in java?
	 * String, Integer, all the Collection Api classes override toString() 
	 * method in java.
	 * 
	 */
	int j=-9;
	
	@Override
	public String toString()
	{
		return j+" ";
	}
	
	public static void main(String[] args) {
		
		
		//System.out.println(i);//999
		Base b=new Base();
		System.out.println(Base.i);//999
		System.out.println(b.i1);//-999
		
		System.out.println(b);//internally jvm will execute toString() related to this (b) object
		
		System.out.println(b.toString());
	/* 
	 * toString internally return like this way 
	 * (it return object data)
	 * getClass().getName()+"@"+ toHexString(hashcode)
	 * 
	 */
		
		
	}

}

class Base
{
	int i1=-999; //instance variable beaing part of Object
	static int i=999; //static variable wil sore at method area 
	
	/* now i have 100 variable , how to access them?
	 *  s.o.p(b.i1),s.o.p(b.i2),..... s.o.p(b.i100)
	 *  
	 *  problem is readability,accesssable.
	 *  
	 */
}
