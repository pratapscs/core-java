package com.corejava.Innerclasses;

public class StaticNestedClass 
{
	/*  Static nested class
	 * 
	 * 1) Method of nested class can only be static if nested class is a static 
	 *    nested class.
	 * 
	 * 2) Static nested class is considered as static member variable of 
	 *    outer class.
	 * 
	 * 3) StaticNestedClass has access to all static member variables and 
	 *    static methods of OuterClass.
	 *    
	 * 4) StaticNestedClass can be abstract or final.
	 * 
	 * 5) StaticNestedClass can be private, protected, public.
	 * 
	 * 6) strictfp modifier can also be used with StaticNestedClass.
	 * 
	 * 7) Static nested classes can declare static initialization blocks
	 * 
	 * 8) Static nested classes can declare member interfaces.
	 * 
	 * 9) Static nested classes can declare static members
	 * 
	 * 10) Static nested classes can declare constant variables
	 * 
	 * 11) Static nested classes can inherit static members that are not constant variables.
	 * 
	 * 12) Static nested classes can declare instance initialization blocks.
	 * 
	 * 
	 * class OuterClass 
	 * {
    // StaticNestedClass
    static class StaticNestedClass {
 
           // StaticNestedClass can declare static initialization blocks
           static {
           }
 
           // StaticNestedClass can declare member interfaces.
           interface I {
           }
 
           // StaticNestedClass can declare static members
           static int i = 2;
 
           // StaticNestedClass can declare constant variables
           static final int j = 3;
  
           //StaticNestedClass classes can declare instance initialization blocks
           {}
           
           //StaticNestedClass constructor
           StaticNestedClass() {}

      }
}
 
	 * 13) Static nested classes cannot be declared in abstract class.
	 * 
	 * 14) Static nested classes cannot be declared in interface.
	 * 
	 * NestedClassTest.class
	 * 
	 * 
	 * 
	 * Difference between static and non-static class:
	 * 
	 *           Static class                                  class (Non-static class)
	 * 
	 * Top level class can never be static in java.            Top level class is always non static in java.
	 * 
	 * static class are also known as static nested classes.   Top level class is just called as class .
                                                               But,
                                                               nested class is known as >
															   inner class or member inner class.
																
	 * Only Static member variables of outer class can be      Static and non-static member variables of outer class can be 
	 * accessed inside methods of static nested class.         accessed inside methods of non-static class
	 * 
	 * Accessing method of static nested class                 Accessing method of inner class 
	 * new OuterClass.StaticNestedClass().method();            new OuterClass().new InnerClass().method();
	 * -Instance of top level class is not needed,             Instance of top level class and InnerClass is needed.
	 * we need to have instance of static nested class only
	 * 
	 * 
	 */

}
