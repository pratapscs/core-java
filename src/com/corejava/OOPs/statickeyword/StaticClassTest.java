package com.corejava.OOPs.statickeyword;

class Employee1{
    
    //Inner class
    class InnerClass {
           public void method() {
                  System.out.println("In InnerClass's method");
           }
    }
   
    //static nested class
    static class StaticNestedClass{
       public void method(){
           System.out.println("In StaticNestedClass's method");
        }
    }
 
}
 

public class StaticClassTest 
{
    public static void main(String[] args) {
           
           //Accessing inner class
           new Employee1().new InnerClass().method();
           
           //Accessing static nested class
           new Employee1.StaticNestedClass().method();
    }
           
}