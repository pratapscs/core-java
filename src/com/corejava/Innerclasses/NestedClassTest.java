package com.corejava.Innerclasses;

class OuterClass1
{
	 
    static int staticI=1; //staticVariable
    static void staticM(){} //staticMethod
    
    //static Nested class
    static class StaticNestedClass 
    {
           public void method() 
           {
                  System.out.println("In StaticNestedClass's method");
                  
                  staticI=1; //OuterClass staticVariable
                  staticM(); //OuterClass staticMethod
                  
                  //System.out.println("StaticNestedClass reference="+this); //allowed       
                  
           }

    }//End StaticNestedClass
 
}
/*
 *  Main class
 */
public class NestedClassTest 
{
    public static void main(String[] args) 
    {
        
       //Accessing method of StaticNestedClass
       new OuterClass1.StaticNestedClass().method();
        
    }
        /* 
         * OuterClass.class > OuterClass
         * OuterClass$StaticNestedClass.class >StaticNestedClass
         * InnerClassTest.class  >InnerClassTest (Main class)
         * 
         * Note : Static nested class is not a inner class, its just a 
         *        nested class.
         */
}
