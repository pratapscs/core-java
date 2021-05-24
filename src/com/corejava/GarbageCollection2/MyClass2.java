package com.corejava.GarbageCollection2;

import  com.corejava.GarbageCollection1.MyClass1;

public class MyClass2 
{
	 @SuppressWarnings("unused")
	public static void main(String[] args)
	    {
	           MyClass1 subclass = new MyClass1();
	           System.out.println("in main() method");
	           try {
	                //  subclass.finalize(); //call finalize() method explicitly
	        	   
	//finalize method for object can’t be called from some other class outside 
	//the package without inheritance.
	        	   
	           } catch (Throwable throwable) {
	                  throwable.printStackTrace();
	           }
	           
	    }

}
