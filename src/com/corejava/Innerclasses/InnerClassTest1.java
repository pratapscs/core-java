package com.corejava.Innerclasses;

class OuterClass2
{	 
    int i=1; //instanceVariable
    static int staticI=1; //staticVariable
    
    //Inside this method we'll declare local class.
    void myMethod()
    {
           //Local Inner class
           class LocalInnerClass 
           {
                  public void method() 
                  {
                        System.out.println("In LocalInnerClass's method");
                        
                        i=1; //OuterClass instanceVariable
                        staticI=1; //OuterClass staticVariable
                        
                        System.out.println("OuterClass reference="+OuterClass2.this);
                        System.out.println("InnerClass reference="+this);
                        
                  }
           } //End LocalInnerClass
           
           //Creating instance of LocalInnerClass
           new LocalInnerClass().method();
    }  
}
/**
 *  Main class
 */
public class InnerClassTest1 
{
    public static void main(String[] args) 
    {
        
        //Creating instance of OuterClass
        new OuterClass2().myMethod();
        
    }
    /* 
     * OuterClass.class > OuterClass
     * OuterClass$1LocalInnerClass.class >LocalInnerClass
     * InnerClassTest.class  >InnerClassTest (Main class)
     * 
     */
        
}
 