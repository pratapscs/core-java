package com.corejava.Innerclasses;

public class Innerclass 
{
	/*
	 * A class within another class is called nested class.
	 * 
	 *  4 Different type of Nested classes >
	 *  1) Inner class / member Inner class
	 *  2) static nested class (not a inner class, its just a nested class)
	 *  3) Local inner class
	 *  4) Anonymous inner class
	 *  
	 *  
	 *   1) Inner class / member Inner class:
	 *   
	 *  1.1) An inner class is a nested class that is not explicitly or 
	 *       implicitly declared static.
	 *       
	 *  1.2) Inner class is also known as member inner class. 
	 *  
	 *  1.3) Inner class is considered as instance member variable of outer 
	 *       class.
	 *       
	 *  1.4) Inner class has access to all other member variables of outer
	 *       class. Inner class can access -instance member variable of outer class
	 *                                      instance methods of outer class
	 *                                      static member variable of outer class
	 *                                      static methods of outer class
	 *                                      Outer class reference 
	 *                                      Inner class reference
	 *                                      
	 *       Inner class is instance specific/ object specific class. 
	 *       It has got access to this reference of outer class.
	 *       Hence, can access OuterClass instance variable and instance method 
	 *       using OuterClass reference this.
	 *       
	 *  1.5) InnerClass can be declared private, protected, public.
	 *  
	 *  1.6) strictfp modifier can also be used with InnerClass.
	 *  
	 *  1.7) InnerClass can be abstract or final.
	 *  
	 *  1.8) Inner classes cannot declare static initialization blocks
	 *  
	 *  1.9) Inner classes cannot declare member interfaces.
	 *  
	 *  1.10) Inner classes can declare instance initialization blocks.
	 *  
	 *  class OuterClass{
	 *  //Inner class
	 *  class InnerClass {
          //Inner classes cannot not declare static initialization blocks
           static{} //compilation error
           
           //Inner classes cannot not declare member interfaces.
           interface I{} //compilation error

           //Inner classes can declare instance initialization blocks
           {}
           
           //Inner class constructor
           InnerClass() {}
    }
}        
      *  1.11) Inner classes cannot declare static members
      *  
      *  1.12) Inner classes can declare constant variables
      *  
      *  1.13) Inner classes can inherit static members that are not constant variables.
      *  
      *  class A{
    
    //Inner classes can inherit static members that are not constant variables
    static int x = 1;
}
 
class OuterClass {
    // Inner class
    class InnerClass extends A{
           
           // Inner classes cannot not declare static members
           static int i = 2; // compilation error
           
           //Inner classes can declare constant variables
           static final int j = 3; // Fine
    }
}
     * 1.14) Inner classes can be declared in abstract class.
     * 
     * 1.15) Inner classes can be declared in interface.
     * 
     * 
     * 
     * 
	 */

}
