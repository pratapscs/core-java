package com.corejava.OOPs.MethodOverriding;

/* If superclass method throws/declare checked/compileTime exception - 
 * overridden method of subclass can declare/throw any unchecked /RuntimeException
 */
import java.io.IOException;

class SuperClass4{
    void method() throws IOException
    {
           System.out.println("superClass method");
    }
}
 
class SubClass4 extends SuperClass4{
    void method() throws NullPointerException{
           System.out.println("SubClass method");
    }
}
  
/*
 * Main class */
public class ExceptionTest4 {
    public static void main(String[] args) throws Exception {
           SuperClass4 obj=new SubClass4();
           obj.method();
    }
}
 