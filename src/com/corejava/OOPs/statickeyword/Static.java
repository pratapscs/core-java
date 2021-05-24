package com.corejava.OOPs.statickeyword;

public class Static 
{
	/*
	 * features of static keyword:
	 * 
	 * 1.The static is a keyword in java.
	 * 
	 * 2.Static variable, method, class are stored in perm gen
	 * (permanent generation memory).
	 * 
	 * Static variable
	 * 
	 * 3.static variables are also known as class variables.
	 * 
	 * 4.We need not to create instance of class for accessing static variables.
	 * 
	 * 5.static variables will remain same for different instance/objects of class 
	 * but for every new object instance variables will be initialized to new value.
	 * 
	 * 6.Static variables can be used inside constructor.
	 * 
	 * 7.Static variables are not serialized in java
	 * 
	 *                      Java Heap Memory
	 *                    ---------------------------------
	 *                   |                                 |
	 *                   |  -----------------------------  |
	 *                   | |          (perm gen)         | |
	 *                   | | permananent generation area | |
	 *     XYZ  ---------| |---------- company           | |
	 *                   |  -----------------------------  |
	 *                   |         -------------           |
	 *    emp1 --------- |--------| id="1"      |          |
	 *                   |        |name="pratap"|          |
	 *                   |         -------------           |
	 *                   |         -------------           |
	 *    emp2 --------- |--------| id="2"      |          |
	 *                   |        |name="tarun" |          |
	 *                   |         -------------           |
	 *                   |                                 |
	 *                    ---------------------------------
	 *    company is static variable ,it will remain same for all employee objts(emp1,emp2)
	 * 
	 * only the static variables and their values (primitives or references) are 
	 * stored in PermGen space.
	 * 
	 * If static variable is a reference to an object that which is stored in the 
	 * normal sections of the heap (string pool, young/old generation or survivor 
	 * space). Those objects are not stored in PermGen space.
	 * 
	 * Static variables                                       Non-static variables
	 * 
	 * Known only as class variables.                         Also known as instance variables.
	 * Static variables can be accessed inside >              Non-static variables can be accessed inside >
	 * static block, non-static block (instance block),       non-static block (instance block), 
	 * static method, non-static method (instance method),    non-static method (instance method), 
	 * methods of static nested class and inner class.        methods of inner class.
	 * 
	 * 														  in methods of static nested class.
	 * Static variables are class variables access to         Non-Static variables are instance variables access to 
	 * them is always resolved during compile time.           them is always resolved during runtime.
	 * 
	 * Static variables are not serialized in java            instance variables are serialized in java
	 * 
	 * 
	 * 8.Its important to know that only the variables and their values 
	 * (primitives or references) are stored in PermGen space.
	 * 
	 * If static variable is a reference to an object that which is stored in the normal
	 * sections of the heap (string pool, young/old generation or survivor space). Those objects are not stored in PermGen space.
	 * 
	 * 9.Using instance.staticVariable is bad practice, We must use 
	 * ClassName.staticVariableName   
	 * 
	 * Static method
	 * 
	 * 10.static methods are also known as class methods.
	 * 
	 * 11.We need not to create instance of class for accessing static methods.
	 * 
	 * 12.Static methods can access all static variables, but cannot access 
	 * non-static (instance variables)
	 * 
	 * Important points about overriding static methods >
	 * 
	 * 13.Static method cannot be overridden, any attempt to do this will not 
	 * cause compilation error.
	 * 
	 * 14.Static method cannot be overridden with non-static method, any attempt 
	 * to do this will cause compilation error.
	 * 
	 * 15.Non-static method cannot be overridden with static method, any attempt 
	 * to do this will cause compilation error.
	 * 
	 * 
	 * Static class
	 * 16.static class are also known as static nested classes
	 * 
	 * 17.Top level class can never be static in java.
	 * 
	 * 18.Only static variables can be accessed inside static class.
	 * 
	 * Static block
	 * 
	 * 19.static blocks are also known as static initialization blocks in java.
	 * 
	 * 20.static blocks executes as soon as class is loaded even before instance 
	 * of class is created (i.e. before constructor is called).
	 * 
	 * 21.static blocks executes before instance blocks.
	 * 
	 * 22.Any code written inside static block is thread safe.
	 * 
	 * 23.Only static variables can be accessed inside static block
	 * 
	 * 24.static blocks can be used for initializing static variables or  
	 * calling any static method.
	 * 
	 * 25.this keyword cannot be used in static blocks.
	 * 
	 * 
	 * Why Static method cannot be overridden in java?
	 * Static method cannot be overridden in java, any attempt to do this will not 
	 * cause compilation error, but the results won’t be same when we would have 
	 * overridden non-static methods.
	 * But why? 
	 * Overriding in Java means that the method would be called on the run time 
	 * based on type of the object and not on the compile time type of it .
	 * But static methods are class methods access to them is always resolved during 
	 * compile time only using the compile time type information. 
	 * 
	 */

}
