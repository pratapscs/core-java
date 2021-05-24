package com.corejava.Innerclasses;

interface MyInterface
{
    void m();
}
 
/*
 *  Main class
 */
public class AnonymousInnerClasses5 
{
    public static void main(String[] args) {
           
           //Anonymous inner class
           new MyInterface(){ //implementing interface
                  public void m(){ //Provide implementation of MyInterface's m() method
                        System.out.println("implementation of MyInterface's m() method");
                  }
           }.m();         
    }
    /*
     * AnonymousInnerClass implements MyInterface, without explicit use 
     * of implements keyword.
     */
        
}