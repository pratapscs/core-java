package com.corejava.ExceptionHandling;

//import java.io.FileNotFoundException;
import java.io.IOException;

/*1.overridden method of subclass can declare/throw any unchecked /RuntimeException 
 * (superclass or subclass)
 */
//class SuperClass //extends Exception
//{
//    void method(){
//           System.out.println("superClass method");
//    }
//}
// 
//class SubClass extends SuperClass
//{
//    void method() throws NullPointerException
//    {
//           System.out.println("SubClass method");
//    }
//}
 


/*2.If superclass method does not throw/declare any exception - overridden method of 
 * subclass cannot declare/throw any checked exception
 * 
 * Any attempt to throw checked exception in overridden method of subclass will 
 * cause compilation error.
 */
//class SuperClass
//{
//    void method()
//    {
//           System.out.println("superClass method");
//    }
//}
// 
//class SubClass extends SuperClass
//{
//    void method() throws Exception  //it will throw Exception
//    {
//           System.out.println("SubClass method");
//    }
//}


/*3.If superclass method throws/declare checked/compileTime exception - overridden 
 * method of subclass can declare/throw narrower (subclass of) checked exception
 * 
 * IOException is superclass of FileNotFoundException.
 */
//class SuperClass{
//    void method() throws IOException{
//           System.out.println("superClass method");
//    }
//}
// 
//class SubClass extends SuperClass{
//    void method() throws FileNotFoundException{
//           System.out.println("SubClass method");
//    }
//}
 
/*4.If superclass method throws/declare checked/compileTime exception - overridden 
 * method of subclass cannot declare/throw broader (superclass of) checked exception
 * 
 * Any attempt to throw broader (superclass of) checked exception in overridden method 
 * of subclass will cause compilation error.
 * Exception is superclass of IOException.
 */
//class SuperClass
//{
//    void method() throws IOException
//    {
//           System.out.println("superClass method");
//    }
//}
// 
//class SubClass extends SuperClass
//{
//    void method() throws Exception //it will throw Exception
//    {
//           System.out.println("SubClass method");
//    }
//}

/*5.If superclass method throws/declare checked/compileTime exception - overridden 
 * method of subclass can declare/throw any unchecked /RuntimeException.
 */
//class SuperClass
//{
//    void method() throws IOException
//    {
//           System.out.println("superClass method");
//    }
//}
// 
//class SubClass extends SuperClass
//{
//    void method() throws NullPointerException
//    {
//           System.out.println("SubClass method");
//    }
//}
/* 6.If superclass method throws/declare unchecked/RuntimeException - overridden method 
 * of subclass can declare/throw any unchecked /RuntimeException
 * 
 * RuntimeException is superclass of NullPointerException.
 */
//class SuperClass
//{
//    void method() throws NullPointerException
//    {
//           System.out.println("superClass method");
//    }
//}
// 
//class SubClass extends SuperClass
//{
//    void method() throws RuntimeException
//    {
//           System.out.println("SubClass method");
//    }
//}

class SuperClass
{
    void method() throws IOException{
           System.out.println("superClass method");
    }
}
 
class SubClass extends SuperClass{
    void method(){
           System.out.println("SubClass method");
    }
}
public class ExceptionTest19
{
    public static void main(String[] args) throws Exception 
    {
           SuperClass obj=new SubClass();
           obj.method();
    }
}