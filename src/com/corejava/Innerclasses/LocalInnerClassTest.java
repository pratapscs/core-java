package com.corejava.Innerclasses;

/*
 * Java doesn't support closures, i.e. local variable can’t be accessed outside 
 * the method, but fields of class can be accessed from outside the class.
 * 
 * What are local variables in java?
 * All variables of the method are called local variables in java.
 * 
 * Where do local variables live in java?
 * Methods are pushed on stack so local variables live on the stack.
 * Local variables of the method are kept on the stack and are lost as soon as 
 * the method ends in java.
 * 
 * Where do object of local inner class live in java?
 * As object of local inner class live on the heap, objects may be alive even 
 * after method ends in which local inner class have been defined.
 * As, local variables of the method are kept on the stack and are lost as soon 
 * as the method ends, but even after the method ends, the local inner class 
 * object may still be alive on the heap. 
 * 
 * 
 * 
 * 
 */

class OuterClass6
{
    
    //Inside this method we'll declare local class.
    void myMethod(){
           
           final int localVariable = 2; //Declare final local variable
           
           //Local Inner class
           class LocalInnerClass {
                  public void method() {
                        
                        System.out.println("inside local inner class's method > "
                                +localVariable);
                        
                  }
           } //End LocalInnerClass
           
      //Creating instance of LocalInnerClass
           new LocalInnerClass().method();
     
    }
   
}
 
/**
 *  Main class, which will call local class via outer class instance
 */
public class LocalInnerClassTest {
    public static void main(String[] args) 
    {    
        //Creating instance of OuterClass
        new OuterClass6().myMethod();
        
    }
        
}