package com.corejava.OOPs.Interfaces;

public class Interfaces 
{
	/* Features of Interface in java >
	 * 
	 * 1.Pure abstraction  - Interfaces helps in achieving pure abstraction 
	 * in java. Interface are purely abstract in java. Interfaces can only have
	 * abstract methods.
	 * 
	 * 2.All Interface are abstract by default. So, it’s not mandatory to write 
	 * abstract keyword with interface.
	 * 
	 * 3.Multiple inheritance - Interface allows us to achieve multiple 
	 *                          inheritance as well.
	 *                          
	 * 4.Interface always extends another interface. 
	 * 
	 * 5.Interface can extend more than one interface.
	 * 
	 * 6.variables in interface are public, static and final by default. 
	 * Interface variables are also known as constants.
	 * 
	 * 7.methods in interface are public and abstract by default.
	 * 
	 * 8.Class always implements interface.
	 * 
	 * 9.Interface does not have constructors.
	 * 
	 * 10.Interface doesn’t extend classes.
	 * 
	 * 11.If any new method is added in Interface then all concrete classes 
	 * which implements that interface must provide implementation of newly 
	 * added method, because all methods in interface are abstract by default.
	 * (MyClass5.java)
	 * 
	 * 12.Interface methods cannot have declare abstract methods as 
	 *    synchronized concrete class which implements interface can make 
	 *    methods synchronized.
	 *    
	 *    interface MyInterface {  //compiler will add abstract
	 *     int i=2; //compiler will add public, static and final
	 *     void m(); //compiler will add public and abstract
	 *     }
	 * 
	 * What are concrete classes?
	 * Non-abstract classes are known as concrete classes.
	 * 
	 * why java allows multiple inheritance using interface but not by using 
	 * classes?
	 * Because Interfaces are purely abstract in java. (MyClass3.java)
	 * 
	 * why classes doesn’t allow multiple inheritance?
	 * Because classes are not purely abstract in java. (MyClass4.java)
	 * 
	 * Marker interfaces :
	 * Marker interfaces are those interfaces which does not have any 
	 * methods or any member variables.
	 * Example - Serializable, Cloneable.
	 * Marker interfaces are also known as tagged interfaces.
	 * 
	 * When to use abstract class or interface practically - Choosing between 
	 * interface and abstract class>
	 * When to use interface practically - MyClass6.java
	 * When to use abstract class practically - MyClass7.java
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
