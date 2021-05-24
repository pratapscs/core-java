package com.corejava.Basics.java;

public class Java 
{
	/*
	 * 
	 * 1.What is classpath in java?
	 * A classpath environment variable is the location from which classes 
	 * are loaded at runtime by JVM in java.
	 * Classes may may include system classes and user-defined classes.
	 * 
	 * 2.What if class is not available in classpath in java?
	 * ClassNotFoundException is thrown when JVM tries to class from 
	 * classpath but it does not find that class.
	 * 
	 * 
	 * 3.Is there any difference between creating string with and without new operator?
	 * When String is created without new operator, it will be created in string pool.
	 * When String is created using new operator, it will force JVM to create new string
	 * in heap (not in string pool).
	 * 
	 * ex:
	 * String s1 = "abc";
	 * No string with “abc” is there in pool, so JVM will create string in string pool 
	 * and s1 will be a reference variable which will refer to it.
	 * 
	 * String s2 = new String("abc");
	 * string is created using new operator, it will force JVM to create new string 
	 * in heap (not in string pool).
	 * 
	 * String s3 = "abc";
	 * string with “abc” is there in pool, so s3 will be a reference variable which 
	 * will refer to “abc” in string pool.
	 * 
	 * String s4 = new String("abc");
	 * string is created using new operator, it will force JVM to create new string in 
	 * heap (not in string pool).
	 * 
	 * String s5 = new String("abc").intern();
	 * string is created using new operator but intern method has been invoked on it, so 
	 * s5 will be a reference variable which will refer to “abc” in string pool.
	 * 
	 * 
	 * 4.Can we use custom object as key in HashMap? If yes then how?
	 * For using object as Key in HashMap, we must implements equals and hashcode method. 
	 * Classes must be made immutable classes.
	 * 
	 * 
	 * 5.What are immutable classes in java? How we can create immutable classes 
	 * in java? And what are advantages of using immutable classes?
	 * 
	 * Any change made to object of immutable class produces new object. 
	 * Example- String is Immutable class in java, any changes made to Sting class.
	 * We must follow following steps for creating immutable classes -
	 * 1) Final class - Make class final so that it cannot be inherited
	 * 2) private member variable -> Making member variables private ensures 
	 * that fields cannot be accessed outside class.
	 * 3) final member variable -> Make member variables final so that once assigned 
	 * their values cannot be changed
	 * 4) Constructor -> Initialize all fields in constructor. 
	 * assign all mutable member variable using new keyword.
	 * 5) Don't provide setter methods in class/ provide only getter methods.
	 * 
	 * 
	 * * 6.What are some immutable classes in java?
	 * String is Immutable class in java, any changes made to Sting object produces 
	 * new String object.
	 * Example of more immutable classes in java (Wrapper class)>
	 * Integer, Double ,Long ,Short,Byte ,And all other Wrapper classes.
	 * 
	 * 
	 * 7.What are differences between Iterator and Enumeration?
	 * 
	 * 8.Does finally block always execute? Will finally block execute 
	 * when System.exit is called?
	 * 
	 * 9.What are differences between checked and unchecked exceptions?
	 * 
	 * 10.What are exception handling keywords in java? 
	 * 
	 * 11.What are differences between Exception and Error in java?	
	 * 
	 * 12.What is difference between throw and throws in java?
	 * 
	 * 13.What is Difference between multiple catch block and multi catch syntax ?
	 * 
	 * 14.What is Difference between Final, Finally and Finalize?
	 * 
	 * 15.What is exception propagation in java?
	 * Whenever methods are called stack is formed and an exception is first thrown 
	 * from the top of the stack and if it is not caught, it starts coming down the 
	 * stack to previous methods until it is not caught. 
	 * If exception remains uncaught even after reaching bottom of the stack it is 
	 * propagated to JVM and program is terminated. 
	 * 
	 * 16.What is cloning in java?
	 * 
	 * 17.Is overriding of static method allows in java?
	 * 
	 * 18.Is overriding of private method allows in java?
	 * No, private methods are inherited in subclass and hence cannot be overridden. 
	 * Though subclass can have same name of private method in superclass.

class A {
    private final void m(){
           System.out.println(1);
    }
}
 
class B extends A {
    void m(){
           System.out.println(2);
    }
}
	
	 * 19.What is difference between Interface and abstract class in java?
	 * 
	 * 20.What is difference between Method overloading and Method overriding in java?
	 * 
	 * 21.What is difference between equals method and == operator in java? 
	 * 
	 * 22.What is constructor chaining in java?
	 * 
	 * 23.What are 4 java platforms ?
	 * 
	 * 24.What are Differences between JDK, JRE and JVM, OpenJDK, JIT Compiler?
	 * 
	 * 25.How many primitive data types are provided by java ?
	 * 
	 * 26.Explain Implicit casting/promotion of primitive Data type in java?
	 * 
	 * 27.What is Thread in java?
	 * 
	 * 28.How to implement Threads in java?
	 * 
	 * 29.We should implement Runnable interface or extend Thread class. 
	 * What are differences between implementing Runnable and extending Thread?
	 * 
	 * 30.How can you ensure all threads that started from main must end in order
	 *  in which they started and also main should end in last? 
	 *  
	 * 31.What is difference between starting thread with run() and start() method? 
	 * 
	 * 32.What is significance of using Volatile keyword?
	 * 
	 * 33.Differences between synchronized and volatile keyword in Java?
	 * 
	 * 34.Can you again start Thread?
	 * 
	 * 35.What is race condition in multithreading and how can we solve it?
	 * 
	 * 36. How threads communicate between each other?
	 * 
	 * 37.Why wait(), notify()  and notifyAll() are in Object class and not 
	 * in Thread class?
	 * 
	 * 38.Is it important to acquire object lock before calling wait(), 
	 * notify() and notifyAll()?
	 * 
	 * 39.How can you solve consumer producer problem by using wait() and notify() method?
	 * 
	 * 40.How can you solve consumer producer pattern by using BlockingQueue?
	 * 
	 * 41.What is difference between String, StringBuffer and StringBuilder in java ?
	 * 
	 * 42.What is reflection in java? Have you ever used reflection directly or directly?
	 * Reflection is used to load java classes at runtime.
	 * Frameworks like struts, spring and hibernate uses reflection for loading 
	 * classes at runtime.
	 * 
	 * 43.What is significance of static in java?
	 * 
	 * 44.Can we override static method in java?
	 * 
	 * 45.Which method is called for garbage collection in java? 
	 * What algorithm does garbage collector follows?
	 * finalize method,mark and sweep algorithm
	 * 
	 * 46.What is Singleton class/design pattern in java?
	 * Singleton class means only one instance of class can exist.
	 * 
	 * 47.objects and primitive types are passed by value or reference?
	 * 
	 * 48.What are different type of classes in java?
	 * 1) Inner class/ nested class
	 * 2) static nested class
	 * 3) Local inner class
	 * 4) Anonymous inner class
	 * 
	 * 49.What is Differences between Instance initialization block and 
	 * Static initialization block?
	 * 
	 * 50.How ConcurrentHashMap works? Can 2 threads on same ConcurrentHashMap 
	 * object access it concurrently?
	 * ConcurrentHashMap is divided into different segments based on concurrency 
	 * level. So different threads can access different segments concurrently.
	 * 
	 * 51.What is deadlock in multithreading? Write a program to form DeadLock 
	 * in multi threading and also how to solve DeadLock situation. 
	 * What measures you should take to avoid deadlock? 
	 * 
	 * 52.What is life cycle of Thread, explain thread states? 
	 * New,Runnable,Running,Waiting/blocked/sleeping,Terminated (Dead) 
	 * 
	 * 53.What are daemon threads? 
	 * Daemon threads are low priority threads which runs intermittently in 
	 * background for doing garbage collection. 
	 * 
	 * 54.Difference between wait() and sleep() ?
	 * 
	 * 55.Differences and similarities between yield() and sleep() ?
	 * 
	 * 56.Name few methods of Object class?
	 * wait(), notify() and notifyAll(),equals and hashcode,clone() ,toString()
	 * 
	 * 57.Are primitive types part of serialization process? 
	 * Yes, primitive types are part of serialization process. 
	 * Interviewer tends to check your basic java concepts over here.
	 * 
	 * 
	 * 
	 * 
	 */

	 int i=10;
	public static void main(String[] args) 
	{
		int i=11;
		System.out.println(i);
		
	}
	
}
