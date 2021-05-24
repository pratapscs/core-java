package com.corejava.Innerclasses;

interface MyInterface1 extends Runnable
{
    void m();
}
/**
 *  Main class
 */
public class AnonymousInnerClasses6 
{
    public static void main(String[] args) 
    {
           
           //Anonymous inner class
           new MyInterface1(){ //implementing interface
 
                  @Override //Provide implementation of MyInterface's m() method
                  public void m(){
                        System.out.println("implementation of MyInterface's m() method");
                  }
 
                  @Override //Provide implementation of Runnable's run() method
                  public void run() {
                  }
           }.m();         
           
    }
}
