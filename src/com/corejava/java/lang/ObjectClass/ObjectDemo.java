package com.corejava.java.lang.ObjectClass;

//import java.util.GregorianCalendar;

//public class ObjectDemo extends GregorianCalendar
public class ObjectDemo
{
public static void main(String[] args) {
	
	//System.out.println("hi world");
	
	/* System : System is a class it is available in java.lang package.
	 * 
	 * out : it is a static variable available with in the System class which is 
	 * returning instance of PrintStream.(that is object of PrintStream) with in 
	 * the PrintStream class println() method will be present, as an argument 
	 * println() that will be giving as an output to the console through IOStream.
	 *
	 * System class having some predefined implementations those impementations are 
	 * available with in the class called Object class.
	 * 
	 * By default java.lang package classes/abstract classes/ intefaces 
	 * will be avilable in java. it will optional implementation.(import java.lang.*)
	 * 
	 */
	
	/* Object(c) :
	 * 
	 * why all the implementations which are required to our java classes have been put
	 * in Objct class?
	 * oops concept(Inheritance)
	 * 
	 * Ex:
	 * class Object
	 * {
	 *   12 methods (only 11 are accesible 1 will no access why means it is private method
	 *    
	 * }
	 * class Foo extends Object
	 * {
	 *    Must be there in each and every class to access Object class methods implementation 
	 * }
	 * class Bar extends Object
	 * {
	 *    Must be there in each and every class to access Object class methods implementation
	 *    
	 *    no need to use extends keyword by default jvm will extends Object class through 
	 *    direct hirarchy or multilevel hirarchy.
	 * }
	 * 
	 * Ex:
	 * class Foo 
	 * {
	 *  this class direct child to Object class
	 * }
	 * class Bar exends Foo
	 * {
	 *  this class Object class through multilevel hirarchy
	 * }
	 * 
	 * 12 methods in Object class:
	 * 
	 * 1.public String toString();
	 * 
	 * 2.pulic native int hashCode();
	 *   native : having implementation in other than java progamming like c,c++.
	 * 
	 * 3.protected native Object clone() throws CloneNotSupportedException
	 * 
	 * 4.protected void finalize() throws Throwable - at garbage collection
	 * 
	 * 5.public final Class getClass();
	 * 
	 * 6.public boolean equals(Object o);
	 * 
	 * 7.public final void wait() throws InteruptedException - at interthread Communication
	 * 
	 * 8.public final native void wait(long ms) throws InteruptedException - at interthread Communication
	 * 
	 * 9.public final native void wait(long ms,int ns) throws InteruptedException - at interthread Communication
	 * 
	 * 10.public final native void notify();
	 * 
	 * 11.public final native void notifyAll();
	 * 
	 * 12.private static native void registerNatives() 
	 * u can not access with in the child class
	 * 
	 * 
	 * Ex:
	 * class Foo
	 * {
	 *     public static void main(String[] args)
	 *     {
	 *      Foo f=new Foo();
	 *      System.out.println(f.hashCode());
	 *      System.out.println(new Foo().hashCode());
	 *     }
	 * }
	 * 
	 * why all 11 methods of object class maintained with in object class only?
	 * to achive inhertance, to have implementations of those methods to all the java 
	 * class objects. no need to create  Object o=new Object(); like this.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
//	ObjectDemo o=new ObjectDemo();
//	System.out.println(o.hashCode());
//	System.out.println(new ObjectDemo().hashCode());
	
	
	/* ---- clone method ------
	 *  
	 // create a gregorian calendar, which is an object
	   GregorianCalendar cal = new GregorianCalendar();

	   // clone object cal into object y
	  GregorianCalendar y = (GregorianCalendar) cal.clone();

	   // print both cal and y
	  System.out.println("" + cal.getTime());
	  System.out.println("" + y.getTime());
	  
	   System.out.println(cal.clone() != cal);
	   System.out.println(cal.clone().getClass() == cal.getClass());
	   System.out.println(cal.clone().equals(cal));
	   
	 */
	   
	
	   /*  --- equals method ----- 
	    * 
	    * // get an integer, which is an object
   Integer x = new Integer(50);

   // get a float, which is an object as well
   Float y = new Float(50f);

   // check if these are equal,which is 
   // false since they are different class
   System.out.println("" + x.equals(y));

   // check if x is equal with another int 50
   System.out.println("" + x.equals(50));
	    * 
	    */
	
	/*  ----- finalize method ----- 
	 * 
	
	try {
		   // create a new ObjectDemo object
		   ObjectDemo cal = new ObjectDemo();

		   // print current time
		   System.out.println("" + cal.getTime());

		   // finalize cal
		   System.out.println("Finalizing...");
		   cal.finalize();
		   System.out.println("Finalized.");

		   } catch (Throwable ex) {
		   ex.printStackTrace();
		   }
		 */
	
	/* ----- getClass() ------
	 * 
	// create a new ObjectDemo object
	   GregorianCalendar cal = new GregorianCalendar();

	   // print current time
	   System.out.println("" + cal.getTime());

	   // print the class of cal
	   System.out.println("" + cal.getClass());

	   // create a new Integer
	   Integer i = new Integer(5);

	   // print i
	   System.out.println("" + i);

	   // print the class of i
	   System.out.println("" + i.getClass());
	
	*/
	
	
  }	
}


