package com.corejava.Innerclasses;

//In java, AnonymousInnerClass means class with no name.

class OuterClass3
{
    void m()
    {
           System.out.println("m()");
    }
}
/*
*  Main class
*/
public class AnonymousInnerClasses3 
{
   public static void main(String[] args)
   {
          //Anonymous inner class
          OuterClass3 obj=new OuterClass3()
          {       
                 //Override m() method of OuterClass
                 void m()
                 { 
                       System.out.println("overridden m()");
                 }
          };      
          obj.m(); //calls overridden m()
   }      
   
   /*
    * AnonymousInnerClass was created which extends OuterClass, 
    * m() method of OuterClass was overridden in AnonymousInnerClass.
    * 
    * Note :  AnonymousInnerClass extends OuterClass, without explicit 
    *         use of extends keyword.
    *         
    * OuterClass.class > OuterClass
    * InnerClassTest$1.class >AnonymousInnerClass
    * InnerClassTest.class  >InnerClassTest (Main class)
    * 
    */
}
