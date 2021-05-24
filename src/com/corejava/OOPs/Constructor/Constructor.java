package com.corejava.OOPs.Constructor;

public class Constructor 
{
	/* Constructor:
	 * Constructor are used to create object in java.
	 * whenever new keyword is used constructor of class is called to 
	 * create new object.
	 * 
	 * 1.Constructor have same name that of class.
	 *   
	 * ex: public class MyClass {
	 *     MyClass(){} //constructor
	 *     }
	 *     
	 * 2.Constructor do not have any return type.
	 * 
	 * 3.When no constructor is defined explicitly in the class, 
	 *   compiler implicitly provides no-argument constructor
	 *   (no-arg constructor) in class.
	 *   
	 *   ex: our class is like this -
	 *   public class MyClass {
	 *   }
	 *   
	 *   compiler will provide default implicit no-arg constructor -
	 *   public class MyClass 
	 *   {
	 *   //default implicit no-arg constructor constructor provided by compiler.
	 *   MyClass()
	 *   {
	 *   super();
	 *    }
	 *   }
	 *   
	 *  4.Constructor chaining - whenever the object of class is created, 
	 *    implicitly default no-arg constructor of class and its super class 
	 *    constructor is called.
	 *  
	 *  Q. But how constructor of superclass is called? -> (MyClass1.java)
	 *     Implicitly first statement of constructor is super(), 
	 *     [that means by default first statement of constructor super() is 
	 *     called, super() calls implicit/explicit no-arg constructor of 
	 *     superclass].
	 *     
	 *     we have superclass and subclass like this -
	 *     class SuperClass{
	 *     }
	 *     class SubClass extends SuperClass{
	 *     }
	 *     
	 *     compiler will add default implicit no-arg constructor -
	 *     class SuperClass
	 *     {
	 *     SuperClass(){ //no-arg /no argument constructor
	 *     super();
	 *     }
	 *    }
	 *    class SubClass extends SuperClass
	 *    {
	 *    SubClass()
	 *    {
	 *    super();
	 *    }
	 *   }
	 *   
	 * 5.Instance variables cannot be accessed in constructor until superclass 
	 *   constructors have been called - Because, as mentioned in above point, 
	 *   superclass constructors are called before constructor of class is 
	 *   executed.
	 *   
	 * 6.If superclass does not contain no-arg constructor but contain argument 
	 *   constructor.Than compiler won’t provide no-arg constructor.
	 *   To avoid compilation error >
	 *   Solution 1 > subclass must call super(argument) or
	 *   Solution 2 > declare no-arg constructor explicitly.
	 *   
	 * 7.First line in constructor can either be super() or this(). 
	 *   But, super() and this() cannot be used in same constructor. 
	 *   (MyClass3.java)
	 *   
	 * 8.Constructor can use access modifiers like - private, protected and 
	 *   public. If no access modifier is defined than its default.
	 *   
	 *   private constructor can be used in Singleton classes where object of 
	 *   the class cannot be created outside class.
	 *   class with protected constructor cannot be instantiated in other 
	 *   package. Though constructor can be called through inheritance.
	 *   (MyClass4.java)
	 * 
	 * 9.Constructor is not a keyword in java.
	 * 
	 * 10.Interface does not have constructor in java.
	 * 
	 * 11.Constructors are never inherited and hence cannot be overridden.
	 * 
	 * 12.Constructors can be overloaded.(MyClass5.java)
	 * 
	 * 13.Abstract class also have constructor, and those constructors are 
	 *    called when object of concrete subclass is created, because abstract
	 *    class cannot be instantiated directly.(MyClass6.java)
	 *    
	 * 14.If constructor throws >
	 * RuntimeException/unchecked - Its fine even if not handled.
	 * 
	 * CompileTime/checked Exception - It must be caught at time of object 
	 * creation, or method in which object is created must throw appropriate 
	 * Exception.(MyClass7.java MyClass8.java)
	 * 
	 *      
	 */

}
