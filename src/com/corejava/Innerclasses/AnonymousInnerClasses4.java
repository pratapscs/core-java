package com.corejava.Innerclasses;

class OuterClass4
{
    void m(){
           System.out.println("m()");
    }
}


/**
*  Main class
*/
public class AnonymousInnerClasses4 
{
   public static void main(String[] args) {

          //Anonymous inner class
          new OuterClass4()
          {
                 
          }.m();         
   }
  /* AnonymousInnerClass was created which extends OuterClass, 
   * m() method of OuterClass was inherited in AnonymousInnerClass.
   * 
   */
}