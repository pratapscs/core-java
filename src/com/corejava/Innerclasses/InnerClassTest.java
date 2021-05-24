package com.corejava.Innerclasses;

class OuterClass
{	 
    int i=1; //instanceVariable
    
    void m(){} //instanceMethod
 
    static int staticI=1; //staticVariable
    
    static void staticM(){} //staticMethod
    
    //Inner class
    class InnerClass 
    {
          public void method() 
          {
                  System.out.println("In InnerClass's method");
                  
                  i=1; //OuterClass instanceVariable
                  m(); //OuterClass instanceMethod
                  
                  staticI=1; //OuterClass staticVariable
                  staticM(); //OuterClass staticMethod
                  
                  System.out.println("OuterClass reference="+OuterClass.this);
                  System.out.println("InnerClass reference="+this);
                  
             OuterClass.this.i=2;//Accessing OuterClass instanceVariable using OuerClass reference
             OuterClass.this.m();//Accessing OuterClass instanceMethod using OuterClass reference
                  
          }
    } //End InnerClass
}
/*
 *  Main class
 */
public class InnerClassTest 
{
    public static void main(String[] args) 
    {
        //Creating instance of InnerClass
        new OuterClass().new InnerClass().method();
        
    }
        
}

/* 
 * OuterClass.class > OuterClass
 * OuterClass$InnerClass.class  >InnerClass
 * InnerClassTest.class  >InnerClassTest (Main class)
 * 
 */
 