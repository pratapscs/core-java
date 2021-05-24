package com.corejava.OOPs.MethodOverriding;

public class MethodOverriding 
{
	/* MethodOverriding :
	 * Method of superclass is overridden in subclass to provide more 
	 * specific implementation in java.
	 * 
	 * Ex:
	 * Different animals eat different food, like Lion eat flesh and Goat eat grass. 
	 * So we can have generic SuperClass which tells that Animal might eat flesh, 
	 * grass or may be some other thing.
	 * Now, we can have SubClasses like Lion which more specifically that Lion eat 
	 * flesh.
	 * So at runtime, rather than calling food() method of SuperClass, food() method
	 * of subclass will be called and this way we could derive advantage of creating 
	 * more specific SubClasses and overriding method. -> MyClass1.java
	 * 
	 * 1.Method name - Overriding method same name as of superclass method in java.
	 * 
	 * 2.Access modifier - Overriding method must not have more restrictive 
	 * access modifier in java. 
	 * 
	 * Example 1 - public method cannot be overridden by private method in java.
	 * 
	 * Example 2 - default method can be overridden by default, protected or public 
	 *             method in java.
	 *             
	 * 3.Return type - Java allow method overriding by changing the return type, 
	 * but only Covariant return type are allowed. (see Program MyClass4.java)
	 * 
	 * Covariant return in java:
	 * Java allow overriding by changing the return type, but only Covariant 
	 * return type are allowed.
	 * 
	 * Ex: return type of SuperClass’s myMethod is  SuperClass but
	 *     SubClass’s myMethod returns  SubClass.
	 * 
	 * Covariant returns in java means overriding method can return SubClass.
	 * 
	 * 4.Number of parameters - Overriding method must have same number of parameters 
	 *  in java.
	 *  
	 * 5.Exception thrown - 
	 * Overriding method must not throw new or broader checked exception in java, 
	 * though Overriding method may throw new narrower(subclass) of checked exception 
	 * or Overriding method can throw any runtime exception in java.
	 * 
	 * Features of Method overriding in java -
	 * 
	 * 1.Call to overridden method is bonded at runtime in java.
	 * 
	 * 2.Method overriding concept is also known as runtime time polymorphism in java.
	 * 
	 * 3.Only instance methods can be overridden in java.
	 * 
	 * 4.private methods can’t be overridden in java, because private methods 
	 * are not inherited in subClass.
	 * 
	 * 5.final methods can’t be overridden in java, because final methods are 
	 * not inherited in subClass.
	 * 
	 * 6.Static methods can’t be overridden in java. 
	 * 
	 * 7.Main method also can’t be overridden in java, because main is 
	 * static method and static methods can’t be overridden in java 
	 * 
	 * 8.It’s important to know that instance variables are never overridden in java.
	 * 
	 * 9.Overriding method must not have more restrictive access modifier in java.
	 * 
	 * 10.Method overriding and Exception handling in java - Throw/declare checked 
	 * and unchecked exception while overriding superclass method in java.
	 * 
	 */

}
