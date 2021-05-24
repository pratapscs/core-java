package com.corejava.Basics.ClassAndMethods;

class MyClass1 { //class name
	 
    /* Static initialization block */
    static 
    {
           System.out.println("static block");
    }
 
 
    /*Non-Static block (Instance initialization block)*/
    {
           System.out.println("non-static block");
    }
 
    public MyClass1() { //constructor
           super();
    }
    
 
    @SuppressWarnings("unused")
	private int instanceVar; //instance variable/ member variable
    
    @SuppressWarnings("unused")
	private static int staticVar; //static variable/ class variable
 
    @SuppressWarnings("unused")
	public void instanceMethod() { //instance method
           this.instanceVar=2;
           class LocalInnerClass {} //LocalInnerClass
           MyClass obj=new MyClass(){}; //Anonymous inner class
 
    }
    
    public static void staticMethod() { //static method
    }
 
    class InnerClass{} //inner class
    static class StaticNestedClass {} //StaticNestedClass
 
    interface NestedInterface{} //nested interface
    static interface staticNestedInterface{} //static nested interface
 
}