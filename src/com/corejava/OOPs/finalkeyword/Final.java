package com.corejava.OOPs.finalkeyword;

public class Final
{
	/* features of final keyword in java :
	 * 
	 * 1.Final is a keyword in java.
	 * 
	 * 2.Final keyword can be applied to variable, method and class in java.
	 * 
	 * 3.Final memberVariable/instanceVariable of class must be initialized at 
	 * time of declaration, once initialized final memberVariable cannot be 
	 * assigned a new value.
	 *
	 */
	   
//	final int x=1; //memberVariable/instanceVariable
	
	/* 4.If final memberVariable is not declared at time of declaration we 
	 * will face compilation error= “The blank final field x may not have 
	 * been initialized”’.
	 * 
	 */

//	final int x; //memberVariable/instanceVariable
	
	/*5.If final memberVariable is assigned a new value we will face 
	 * compilation error=”The final field FinalTest.x cannot be assigned ”.
	 * 
	 */

//	final int x=1; //memberVariable/instanceVariable
//	public void method()
//	{
//		x=2; //final memberVariable can be initialized in constructor
//	}
	
	/* 6.If constructor is defined then final memberVariable can be initialized 
	 * in constructor but once initialized cannot be assigned a new value.
	 * 
	 */
//	 final int x; //memberVariable/instanceVariable
//	    Final() {
//	           x = 1; //final memberVariable can be initialized in constructor.
//	    }
//Best Practice:We must initialize member variables of class in constructor.

	
	/*7.Final local variable can be left uninitialized at time of declaration 
	 * and can be initialized later, but once initialized cannot be assigned 
	 * a new value.
	 * 
	 */
//	void method(){          
//        final int x; //uninitialized at time of declaration
//        x=1;
   
	/* 8.Final static variable of class must be initialized at time of declaration
	 *  or can be initialized in static block, once initialized final static 
	 *  variable cannot be assigned a new value in java.
	 *  
	 * 9.Final static member variables of class are called constants in java.
	 * variables in interface are public, static and final by default. 
	 * Interface variables are also known as constants.
	 * 
	 * 10.If static block is defined then final static variable can be initialized 
	 * in static block, once initialized final static variable cannot be assigned
	 * a new value in java.
	 * 
	 */
//	final static int x; //static variable
//    static{ //static block
//          x=1;
	
	 /*11.Final method cannot be overridden, any attempt to do so will cause 
	  * compilation error in java.
	  * 
	  */
//	class SuperClass
//	{
//	final void method(){} //final method
//    }
//	class SubClass extends SuperClass
//	{
//		void method(){}//final methos cannot overridden
//	}
	
	/*12.Final method are inherited in subclasses in java.
	 * 
	 * class Superclass {
    final void superclassFinalMethod(){
           System.out.println("in Superclass final method");
    }
}
class Subclass extends Superclass{
    void subclassmethod(){
           System.out.println("in sub class method");
    } 
}

public class FinalTest {
    public static void main(String[] args) {
           Subclass obj=new Subclass();
           obj.superclassFinalMethod(); //in Superclass final method
    }
}
	 * 
	 * 
	 * 13.Final class cannot be extended, any attempt to do so will cause 
	 * compilation error in java.
	 * 
	 */
//	final class SuperClass
//	{ //final class
//	}
//	class subclass extends SuperClass //final class can not be extended
//	{
//	}
	
	/*14.Constructor of a class can never be final in java - because they 
	 * are not inherited neither overridable.
	 * Only public, protected & private are permitted modifiers with constructor.
	 * ,any attempt to make constructor final will cause compilation error
	 * =”Illegal modifier for the constructor in type FinalTest; only public, 
	 * protected & private are permitted” in java.
	 * 
	 */
//	final Final(){} //constructor of a class can never be final in java
	
	/*15.There is nothing like final object in java - if final reference 
	 * variable refers to object in java than it does not mean that Object 
	 * is final, it simply means that reference variable cannot refer to 
	 * another object in java.
	 * 
	 * 
	 * 16.final list does not means that - value cannot be added to it or 
	 * removed from list. 
	 * final list means reference cannot refer to any new ArrayList, any 
	 * attempt to do so will cause compilation error in java.
	 * 
	 */
//	public static void main(String[] args) {
//		final  List<Integer> list=new ArrayList<Integer>();
//		list.add();//element can be added in final list
//		list=new ArrayList<integer>();//final list cannot refer to new arraylist
	
	/* 17.If parameter is final its value cannot be changed, any attempt 
	 * to do so will cause compilation error in java.
	 *
	 */
//	public static void main(String[] args) {
//		metho1(2);
//	}
//	static void metho1(final int x){//final parameter
//	x=1;
//	}
	
	/*18.Final class can never be abstract, because final class cannot be extended 
	 * and abstract class is meant for extending any attempt to do so will cause 
	 * compilation error in java.
	 * 
	 */
//	abstract final class Final{
//	}
	
	/*19.declaring variable, class or method as final improves performance, 
	 * because JVM caches them. JVM caches them because -
	 * final variable cannot be changed in java, 
	 * Runtime polymorphism is not applicable on final methods because they cannot 
	 * be overridden in java.
	 * final classes cannot be inherited in java.
	 * 
	 * 20. As per java naming conventions final variable must be written in 
	 * UPPERCASE because they are considered as constants in java.
	 *
	 */
//	final int VARIABLE=1;
	
	/*21.Only final local variable can be used inside an inner class defined in a method.
	 * Though non-final member variable can be used inside an inner class defined 
	 * in a method.
	 * 
	 */
}
	
 
	
