package com.corejava.java.lang.ObjectClass;

public class Cloning 
{
	/* 8 important points about cloning in java>
	 * 
	 * Cloning is done for copying the object, cloning can be done using shallow or deep copy
	 * 
	 * 1) Definition of clone method -protected native Object clone() throws 
	 * CloneNotSupportedException;Clone method is present in java.lang.Object class.
	 * 
	 * Clone is a protected method - clone method can’t be called outside class without 
	 * inheritance.
	 * 
	 * Clone is native method, if not overridden its implementation is provided by JVM.
	 * It returns Object - Means explicitly cast is needed to convert it to original 
	 * object.Clone is not a keyword in java.
	 * 
	 * 2) By default clone method do shallow copy.
	 * 
	 * 3) Class must implement marker interface java.lang.Cloneable. 
	 * If class doesn’t implement Cloneable than calling clone method on its object will 
	 * throw CloneNotSupportedException.
	 * 
	 * 4) shallow copy- If we implement Cloneable interface, we must override clone 
	 * method and call super.clone() from it, invoking super.clone() will do shallow copy.
	 * 
	 * 5) Deep copy - We need to provide custom implementation of clone method for 
	 * deep copying.  When the copied object contains some other object its references 
	 * are copied recursively in deep copy. When you implement deep copy be careful 
	 * as you might fall for cyclic dependencies
	 * 
	 * 6) Constructor of object is not called when clone method is called.
	 * 
	 * 7) According to javaDocs  
	 * The precise meaning of "copy" may depend on the class of the object. 
	 * 
	 * The general intent is that, for any object x, the expression:
	 * x.clone() != x
	 * will be true, and that the expression:
	 * x.clone().getClass() == x.getClass()
	 * \will be true, but these are not absolute requirements. While it is typically 
	 * the case that: x.clone().equals(x)
	 * will be true, this is not an absolute requirement.
	 * 
	 * 8) According to javaDocs  -the returned object should be obtained by calling 
	 * super.clone. If a class and all of its superclasses (except Object) obey this 
	 * convention, it will be the case that x.clone().getClass() == x.getClass()
	 *
	 * 
	 */


}
