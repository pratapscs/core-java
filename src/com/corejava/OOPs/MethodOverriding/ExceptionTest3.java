package com.corejava.OOPs.MethodOverriding;

/* If superclass method throws/declare checked/compileTime exception - 
 * overridden method of subclass can declare/throw narrower (subclass of)
 * checked exception.
 * 
 * IOException is superclass of FileNotFoundException.
 */
import java.io.FileNotFoundException;
import java.io.IOException;
 
class SuperClass3
{
    void method() throws IOException
    {
           System.out.println("superClass method");
    }
}
 
class SubClass3 extends SuperClass3
{
    void method() throws FileNotFoundException
    {
           System.out.println("SubClass method");
    }
}
 
 
/*
 * Main class */

public class ExceptionTest3 
{
    public static void main(String[] args) throws Exception 
    {
           SuperClass3 obj=new SubClass3();
           obj.method();
    }
}
 