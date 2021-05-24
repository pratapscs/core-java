package com.corejava.CollectionFramework;

import java.util.Collection; 
//root interface in the hierarchy of Java Collection framework.
							
//collection represents a group of objects, known as its elements.

/* features/properties of java.util.Collection in java:
 * 
 * Some allow Duplicate elements.
 * Some maintains insertion order.
 * Some are Sorted by natural order.
 * Some are synchronized.
 * Some allow null elements.
 * Some return fail-fast iterator while others return fail-safe iterator.
 * 
 * 
 * Advantages of using java.util.Collection:
 * 
 * Performance - JDK provides many classes which implements subInterface of 
 *               Collection like java.util.List and java.util.Set interface.
 *               
 * Optimised and tested - Collection implementations are optimised and well 
 *                        tested in java.
 *                        
 * Reusability - They can be reused in java.
 * 
 * No need to write code - We need not to write code for storing elements i.e. 
 * we need to write code to implement basic data structure, neither we need not
 * to write any code to implement Set and List in java.
 * 
 * 
 * java.util.Map interface is a member of the Java Collections Framework, 
 * but it does not implement java.util.Collection interface in java.
 * 
 */
@SuppressWarnings("unused")
public interface Collections1
{
	/* 1. What is Collection framework in java? 
	 * 
	 * 
	 * 2. Which interfaces and classes are most frequently used in Collection
	 *  framework in java?
	 *  interfaces: List, Set and Map.
	 *  
	 *  classes: 
	 *  HashSet, LinkedHashSet, TreeSet, ConcurrentSkipListSet classes implements 
	 *  Set interface.
	 *  ArrayList, LinkedList, Vector, CopyOnWriteArrayList classes implements 
	 *  List interface.
	 *  HashMap, Hashtable, ConcurrentHashMap, LinkedHashMap, TreeMap, 
	 *  ConcurrentSkipListMap classes implements Map interface.
	 *  
	 *  
	 * 3.What are subinterfaces of Collection interface in java? Is Map interface 
	 * also a subinterface of Collection interface in java?
	 * List and Set are subinterfaces of java.util.Collection in java.
	 * Map interface is a member of the Java Collections Framework, but it does not 
	 * implement Collection interface in java
	 * 
	 * 
	 * 
 	 * 
 	 * 7. What are differences between Iterator and ListIterator? in java?
 	 *  
 	 *  java.util.ListIterator                   java.util.Iterator 
 	 *  All the implementations of List          All Implementation classes of Collection
 	 *  interface like ArrayList, LinkedList,    interface’s subinterfaces like Set 
 	 *  Vector, CopyOnWriteArrayList classes     and List return iterator.
 	 *  returns listIterator.
 	 *  
 	 *  
 	 *  8. What are differences between Collection and Collections in java?
 	 *  java.util.Collection ​ is the root interface in the ​hierarchy 
 	 *  of Java Collection framework​. 
 	 *  
 	 *  The JDK does not provide any classes which directly implements 
 	 *  java.util.Collection interface, but it  provides classes such as 
 	 *  ArrayList, LinkedList, vector, HashSet, EnumSet, LinkedHashSet, 
 	 *  TreeSet, CopyOnWriteArrayList, CopyOnWriteArraySet, 
 	 *  ConcurrentSkipListSet  which implements more specific subinterfaces 
 	 *  like ​Set and List​ in java. 
 	 *  
 	 *  java.util.Collections is a utility class which consists of static 
 	 *  methods that operate on or return Collection in java.
 	 *  
 	 *  java.util.Collections provides method like >
 	 *  reverse method for reversing List in java.
 	 *  
 	 *  shuffle method for shuffling elements of List in java.
 	 *  
 	 *  unmodifiableCollection, unmodifiableSet, unmodifiableList, 
 	 *  unmodifiableMap methods for making List, Set and Map unmodifiable 
 	 *  in java.
 	 *  min method to return smallest element in Collection in java.
 	 *  max method to return smallest element in Collection.
 	 *  sort method for sorting List.
 	 *  
 	 *  synchronizedCollection,  synchronizedSet, synchronizedList, 
 	 *  synchronizedMap methods for synchronizing List, Set and Map 
 	 *  respectively in java.
 	 *  
 	 *  
 	 *  9. What are core classes and interfaces in java.util.List hierarchy in java?
 	 *  java.util.List interface extends java.util.Collection interface.
 	 *  java.util.ArrayList, java.util.LinkedList, java.util.Vector, 
 	 *  java.util.concurrent.CopyOnWriteArrayList classes implements 
 	 *  java.util.List interface.
 	 *  
 	 *  
 	 *  10. What are core classes and interfaces in java.util.Set hierarchy?
 	 *  java.util.Set interface extends java.util.Collection interface.
 	 *  java.util.HashSet, java.util.concurrent.CopyOnWriteArraySet, 
 	 *  java.util.LinkedHashSet, java.util.TreeSet, 
 	 *  java.util.concurrent.ConcurrentSkipListSet, java.util.EnumSet 
 	 *  classes implements java.util.Set interface.
 	 *  
 	 *  
 	 *  11. What are core classes and interfaces in java.util.Map hierarchy?
 	 *  java.util.Map interface extends java.util.Collection interface.
 	 *  java.util.HashMap, java.util.Hashtable, 
 	 *  java.util.concurrent.ConcurrentHashMap, java.util.LinkedHashMap, 
 	 *  java.util.TreeMap, java.util.concurrent.ConcurrentSkipListMap, 
 	 *  java.util.IdentityHashMap, java.util.WeakHashMap, 
 	 *  java.util.EnumMap classes implements java.util.Map interface.
 	 *  
 	 *  
 	 *  12.  What are differences between Iterator and Enumeration in java?
 	 *  
 	 *  13. How do we override equals and hashcode method in java, write a 
 	 *  code to use Employee as key in HashMap in java?
 	 *  
 	 *  14.What classes should i prefer to use a key in HashMap in java?
 	 *  
 	 *  15.What are differences between HashMap and Hashtable in java?
 	 *  
 	 *  
 	 *  16. when to use HashSet vs LinkedHashSet vs TreeSet in java?
 	 *  
 	 *  17. What are differences between HashMap and ConcurrentHashMap in java?
 	 *  
 	 *  18. When to use HashMap vs Hashtable vs LinkedHashMap vs TreeMap in java?
 	 *  
 	 *  19. What are differences between HashMap vs IdentityHashMap in java?
 	 *  
 	 *  20. What is WeakHashMap in java?
 	 *  
 	 *  21. What is EnumSet in java?
 	 *  
 	 *  22. What is EnumMap in java?
 	 *  
 	 *  23. How to implement own/custom HashMap in java? Or How HashMap works in java?
 	 *  
 	 *  24. How to implement own LinkedHashMap in java? Or LinkedHashMap works in java?
 	 *  
 	 *  25. How to implement own ArrayList in java?Or How ArrayList works in java ?
 	 *  
 	 *  26. How to implement own HashSet in java? Or How HashSet works in java ?
 	 *  
 	 *  27. How to implement own LinkedHashSet in java? Or How LinkedHashSet works in java?
 	 *  
 	 *  28. What do you mean by fail-fast and fast-safe? What is ConcurrentModificationException?
 	 *  
 	 *  29. What are different ways of iterating over elements in List?
 	 *  
 	 *  30. What are different ways of iterating over elements in Set?
 	 *  
 	 *  31. What are different ways of iterating over keys, values and entry 
 	 *  in Map?
 	 *  
 	 *  32. What is difference between Comparable and Comparator? How can you 
 	 *  sort List?
 	 *  
 	 *  33. How sort method of Collections class works internally?
 	 *  
 	 *  34. How can you sort given HashMap on basis of keys?
 	 *  
 	 *  35. How can you sort given HashMap on basis of values?
 	 *  
 	 *  36. In what all possible ways you can sort a given Set?
 	 *  
 	 *  37. How you can sort arrays? And how Comparator of superclass can be used by subclasses?
 	 *  
 	 * 38.What are differences between ArrayList vs CopyOnWriteArrayList?
 	 * 
 	 * 39. What are differences between HashSet vs CopyOnWriteArraySet?
 	 * 
 	 * 40. What are differences between TreeSet vs ConcurrentSkipListSet?
 	 * 
 	 * 41.What are differences between TreeMap vs ConcurrentSkipListMap?
 	 * 
 	 * 42.Can we use null element in TreeSet? Give reason?
 	 * 
 	 * 43.Can we use null key in TreeMap? Give reason?
 	 * 
 	 * 44.How ConcurrentHashMap works? Can 2 threads on same ConcurrentHashMap 
 	 * object access it concurrently?
 	 * 
 	 * 45.Write a program to show consequence of using ArrayList in multithreading
 	 *  environment? 
 	 *  ArrayListCustomExample.java
 	 *  
 	 * 
 	 * 46.Write a program to show advantage of using Vector in multithreading environment?
 	 *  VectorCustomExample.java
 	 *  
 	 * 47. Which list class must be preferred in multithreading environment, 
 	 * considering performance constraint?
 	 * CopyOnWriteArrayList
 	 * 
 	 * 48.Which Set class must be preferred in multithreading environment, 
 	 * considering performance constraint?
 	 * CopyOnWriteArraySet (allows null and elements aren't sorted in natural 
 	 * order) or ConcurrentSkipListSet (doesn’t allows null and elements are 
 	 * sorted in natural order)
 	 * 
 	 * 
 	 * 49.Which Map class must be preferred in multithreading environment, 
 	 * considering performance constraint?
 	 * ConcurrentHashMap(keys aren't sorted in natural order) or 
 	 * ConcurrentSkipListMap(keys are sorted in natural order) 
 	 * 
 	 * 
 	 * 50.Why to use java.util.WeakHashMap map which is so inconsistent and 
 	 * unpredictable in behaviour?
 	 * Let's say we have huge application which consists of lots n lots of object
 	 * and may run short of memory at any time, we will like garbage collector to 
 	 * quickly discard less used key value pair to free up some memory. As, 
 	 * behavior of the WeakHashMap class depends upon garbage collector. 
 	 * I believe discarding less used key-value is always going to a better option 
 	 * than running out of memory.
	 */

}
