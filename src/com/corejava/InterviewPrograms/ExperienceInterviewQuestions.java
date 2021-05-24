package com.corejava.InterviewPrograms;

public class ExperienceInterviewQuestions 
{
	/* 1.is servlet is thread safe?
	 * Servlet is not thread-safe by itself. You can make it thread-safe by making 
	 * the service method synchronized. you need to implement SingleThreadInterface 
	 * to make it thread-safe. Servlet containers usually manage concurrent requests 
	 * by creating a new Java thread for each request.
	 * 
	 * 2.Why MVC design pattern came into picture what was the need of this pattern?
	 * Previously the codes were either written fully in JSP or servlet so maintaing 
	 * and working simultaneously over the code created a lot of problem.
	 * So in order to make everything simple and easy to maintain and work through 
	 * this pattern was bought which just distributed all the work into different 
	 * chambers or layers.Which just improved working speed and made development 
	 * more easy.
	 * 
	 * 
	 * 3.Star patterns.
	 * 
	 * 
	 * 4.Collection Framework-If huge amount of data keeps pouring in then which 
	 * data structure you will prefer? 
	 * Linked List(insertion high ,retrevels low)
	 * Array List(for fast retrevels and search also not for deletions)
	 * 
	 *
	 * 5.Difference between jdk 1.5/1.6/1.7?
	 * 1.7 watcher classes(for files and  floders watching)
	 * ConcurrentPackages(countdown latch(it will hold the objets for doing any work))
	 * 
	 * 
	 * 6.How to remove the duplicates in array list?
	 * (RemoveDuplicatesInArrayList.java)
	 * 
	 * 
	 * 7.explain the multiple inheritance,in real time?
	 * Multiple inheritance where derived class will extend from multiple base classes.
	 * 
	 * java8,Multiple Inheritance of Behavior with Default Methods:
	 * Until Java 7 multiple interface inheritance was possible but interfaces were not 
	 * allowed to have concrete methods. Thus, behavior inheritance was not possible. 
	 * With Java 8, where interfaces can now have default methods implemented in them, 
	 * it is now possible to have a derived class inherit methods from multiple parent 
	 * interfaces. So, multiple inheritance of behavior is now possible.
	 * 
	 * 
	 * 8.Explain association / aggregation / composition?
	 * 
	 * 
	 * 9.How hash map works?
	 * HashMap works on the principle of Hashing.To understand Hashing , we should 
	 * understand the three terms first i.e  Hash Function , Hash Value and Bucket.
	 * 
	 * 
	 * 10.Which one is best in single thread model,arrays,array list,vector?
	 * 
	 * 
	 * 11.write down the soap structure?
	 * <?xml version="1.0"?>
	 * <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://www.w3.org/2001/12/soap-envelope" SOAP-ENV:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
	 * <SOAP-ENV:Header>
	 * ...
	 * ...
	 * </SOAP-ENV:Header>
	 * 
	 * <SOAP-ENV:Body>
	 * ...
	 * ...
	 * <SOAP-ENV:Fault>
	 * ...
	 * ...
	 * </SOAP-ENV:Fault>
	 * ...
	 * </SOAP-ENV:Body>
	 * </SOAP_ENV:Envelope>
	 * 
	 * 
	 * 12.Web service top down and bottom up approach?
	 * Top-down means you start with a WSDL(Web Services Description Language)
	 * and then create all the necessary scaffolding in Java all the way down.
	 * Bottom-up means you start with a Java method, and generate the WSDL from it.
	 * SOAP means that the URL is the same for all invocations, and only the parameters 
	 * to the Java method differs. REST means that the URL reflects the operation 
	 * to be done.
	 * 
	 * 
	 * 13.Spring DI / IOC explain?
	 * DI is subset of IoC
	 * IoC means that objects do not create other objects on which they rely to do 
	 * their work. Instead, they get the objects that they need from an outside service 
	 * (for example, xml file or single app service). 2 implementations of IoC I use 
	 * are DI and ServiceLocator.
	 * DI means the IoC principle of getting dependent object is done without using 
	 * concrete objects but abstractions (interfaces). This makes all components 
	 * chain testable, cause higher level component doesn't depend on lower level 
	 * component, only from interface. Mocks implements these interfaces.
	 * 
	 * 
	 * 14.Explain about the Singletone pattern and rules?
	 * Ensure that only one Object need to create for entire mainstack(per 
	 * main() method) (per application only one single instance)
	 * Ex:servlet Web application
	 * 
	 * 15.Explain Abstract factory pattern?
	 * Abstract Factory Pattern is to "Provide an interface for creating families 
	 * of related or dependent objects without specifying their concrete classes.".
	 * 
	 * 16.Explain about the class loader architecture ? and how its loads the class?
	 * A Java program is made up of a number of custom classes (written by programmers
	 * like us) and core classes (which come pre-packaged with Java). When a program 
	 * is executed, JVM needs to load the content of all the needed class. 
	 * JVM uses a ClassLoader to find the classes.
	 * System Class Loader - Loads all classes from CLASSPATH
	 * Extension Class Loader - Loads all classes from extension directory
	 * Bootstrap Class Loader - Loads all the Java core files
	 * When JVM needs to find a class, it starts with System Class Loader. 
	 * If it is not found, it checks with Extension Class Loader. 
	 * If it not found, it goes to the Bootstrap Class Loader. 
	 * If a class is still not found, a ClassNotFoundException is thrown.
	 * 
	 * 
	 * 17.Difference between Collections and collection?
	 * Collections is an utility class to Define several Utility Methods for 
	 * Collection object. As per Java Doc Collection is: The root interface in the 
	 * collection hierarchy. A collection represents a group of objects, 
	 * known as its elements.
	 * 
	 * 18.Difference between comparable and comparator?
	 * 
	 *
	 * 19.Difference between hash map and hash table?
	 * 
	 * 
	 * 20.why equals and hashcode overrided?
	 * To compare two Java objects, we need to override both equals and hashCode.
	 * 
	 * 
	 * 21.What are the patterns used in your project?
	 * singleton DP,Factory DP
	 * 
	 * 
	 * 22.What are the methods in object class?
	 * clone,equals,finalize,getclass,hashcode,notify,notifyAll,toString,wait
	 * 
	 * 
	 * 23.Why notify and notify all in object class and why not available on thread iteslf?
	 * These methods works on the locks and locks are associated with Object and not Threads. 
	 * Hence, it is in Object class. The methods wait(), notify() and notifyAll() are not 
	 * only just methods, these are synchronization utility and used in communication 
	 * mechanism among threads in Java.
	 * 
	 * 
	 * 24.Can we control Daemon thread? what happens after start?
	 * 
	 * 25.can we set the daemon on after creating the thread?
	 * 
	 * 26.Explain about finally,try,catch and rules on overriding ? Exception rules?
	 * 
	 * 27.Explain the relationships and its weaker and stronger when we uses real time?
	 * 
	 * 28.API using the comparator or comparable?
	 * 
	 * 29.Explain basic collection interface methods?  
	 * 
	 * 30.Inheritence in java?
	 * Inheritance in java is a mechanism in which one object acquires all 
	 * the properties and behaviors of parent object. 
	 * The idea behind inheritance in java is that you can create new classes 
	 * that are built upon existing classes.
	 * 
	 * 
	 * 31.Spring autowiring?
	 * In Spring framework, you can wire beans automatically with auto-wiring feature. 
	 * To enable it, just define the “autowire” attribute in <bean>.
	 * In Spring, 5 Auto-wiring modes are supported(no,byName,byType,constructor,
	 * autodetect)
	 * 
	 * 
	 * 32.Spring Hibernate Integration?
	 * In hibernate framework, we provide all the database information 
	 * hibernate.cfg.xml file.
	 * But if we are going to integrate the hibernate application with spring, 
	 * we don't need to create the hibernate.cfg.xml file. We can provide all 
	 * the information in the applicationContext.xml file.
	 * Spring framework provides HibernateTemplate class, so you don't need to 
	 * follow so many steps like create Configuration, BuildSessionFactory, 
	 * Session, beginning and committing transaction etc.
	 * 
	 * 
	 * 33.SOAP vs REST webservices?
	 * 
	 * 
	 * 34.write bubble sort?
	 * 
	 * 
	 * 35.create singleton class?
	 * 
	 * 
	 * 36.scope of bean in spring?
	 * singleton,prototype,request,session,globalsession
	 * 
	 * 37.what is polymorphism?
	 * 
	 * 38.Why String is immutable?  
	 * 
	 * 39.what is the best software you have designed or developed, and why?
	 * 
	 * 40.different types of injections?
	 * setter DI,Constructor DI,(Static Varable DI,Interface DI)
	 * 
	 * 
	 * 41.one program, which had all oops concepts implemented and I was asked to 
	 * describe compile time, run time behavior and what will be the output?
	 * (OOPsConcepts.java)
	 * 
	 * 42.Linked list, when to use linked list and when to use array, time 
	 * complexities involved in them?
	 * 
	 * 
	 * 
	 * 43.how to make JSP thread safe?
	 *  <%@page isThreadSafe="false" %>
	 *  
	 *  
	 * 44.how concurrent requests are handled in servlets?
	 * 
	 * 
	 * 45.difference between int and Integer in java? 
	 *   
	 * 
	 * 46.Give me an example of you leading a project and your team members not 
	 * agreeing to each other. How did you handle it?  
	 * 
	 * 
	 * 47.what was the toughest technical challenge and how did you resolve it, 
	 * have you ever taught someone something? 
	 * 
	 * 
	 * 48.What is reflection in java?  
	 * 
	 * 
	 * 49.Given a number and an array. Find three numbers from the array that 
	 * their sum equal to the given number?
	 * 
	 * 
	 * 50.Given a list of passages filter out the duplicate passages by comparing 
	 * only alphanumeric characters?
	 * 
	 * 
	 * 51.Spring default scope?
	 * 
	 * 52.How to remove all elements from hashmap?
	 * 
	 * 53.how to handle an exception when there is no catch , what does finally does?
	 * 
	 * 54.Reverse a string?
	 * 
	 * 55.Can a class be final?
	 * 
	 * 56.Difference between Application context and bean factory?  
	 * 
	 * 57.what is serialization?
	 * 
	 * 58.synchronization?
	 * 
	 * 59.marker interface?
	 * 
	 * 60.jsp directives
	 * 
	 * 61.jsp implicit objects
	 * 
	 * 62.difference bw hashmap and hashtable
	 * 
	 * 63.difference between methodoverriding and overloding?
	 * 
	 * 64.hibernate object types?
	 * 
	 * 65.difference bw get() and load() methods  
	 * 
	 * 66.In spring mvc how to configure url mapping?
	 * 
	 * 67.How to create immutable class in java?
	 * 
	 * 68.features of java 7?
	 * 
	 * 69.Can we override a static private method?
	 * 
	 * 70.In a class a method throws Null-pointer exception, in the 
	 * subclass can we override that method with method which throws runtime exception?
	 * Yes,you can because NullPointerException is a child class of RuntimeException . 
	 * Both are UnChecked Exception .
	 * 
	 * 71.In a hash map i have inserted a key-value, if we update the key will it happen?
	 * 
	 * 72.When do you override equal method?
	 * 
	 * 73.String str = new String(); String str1 = "test"; where are string objects created?
	 * 
	 * 74.What is enumerator?
	 * 
	 * 75.What is difference between vector and array-list?
	 * 
	 * 76.How are vector and array list size incremented?
	 * 
	 * 77.What are lambda expressions?
	 * 
	 * 78.Difference between iterator and Enumeration?
	 * 
	 * 79.What is persistence in java?
	 * A persistent object is an object that has been assigned a storage location in a 
	 * federated database. When you commit the transaction in which you create a persistent 
	 * object, that object's data is saved in the database; the object can then be 
	 * accessed by other processes. A persistent object continues to exist beyond 
	 * the duration of the process that creates it. In contrast, a transient object 
	 * exists only within the memory of the process that creates it; when that process 
	 * terminates, the transient object ceases to exist.
	 * 
	 * 80.Difference Between Save And SaveOrUpdate Methods In Hibernate?
	 * session.save() - It can be used to save a new object. It returns the serialiable 
	 * identity.
	 * session.saveOrUpdate() - This method will work for both new and old objects. 
	 * sIf object is new, it will work like simple save or if object is already persistent, 
	 * it will work like update.
	 * 
	 * 81.Collection Mapping in hibernate?
	 * 
	 * 82.what is first level caching, second level & third level caching?
	 * http://www.dineshonjava.com/p/cacheing-in-hibernate-first-level-and.html#.WGDkk_l97IU
	 * 
	 * 83.Difference Between Merge And Update Methods In Hibernate?
	 * http://www.java4s.com/hibernate/difference-between-merge-and-update-methods-in-hibernate/
	 * 
	 * session.update() - It is used for a scenario when you have load an object Person1 
	 * from hibernate session. Now it is being used in application - may be on client side 
	 * also, has been updated. We want to save it again. We know that no change has been 
	 * done in Person object in data base. So we can simply use update.
	 * 
	 * session.merge() - In above scenario, if changes have been done in person data before 
	 * saving the changed Person1 object, then we should use merge. It will merge the 
	 * changes.
	 * 
	 * 84.What is the difference between String Builder and String Buffer?
	 * 
	 * 85.How to configure multiple databases in hibernate?
	 * 
	 * 86.Can we connect to DB without app server and connection pool? 
	 * Who handles the connection?  
	 * 
	 * 87.lazy loading and eager loading ?
	 * 
	 * 88.what is coupling?
	 * coupling is a measure of how much a class is dependent on other classes.
	 * there should be minimal dependencies between classes.
	 * 
	 * 89.What are Wrapper classes?
	 * wrapper are the classes using which we can warp the concept of object on the top of the 
	 * primitive data,and represent the primitive data in the form of its equealent object.
	 * 
	 * in order to represent 8 primitve datatypes of java there are 8 wrapper classes 
	 * (Byte,Integer,Short,Long,Float,Double,Character,Boolean)
	 * 
	 * Ex:Integer in1=new Integer(66);//int
	 *    Integer in2=new Integer("66");//String
	 *    
	 * 90.Why do we need Wrapper classes in Java?
	 * 
	 * 91.What are the different ways of creating Wrapper class instances?
	 * 
	 * 92.What are differences in the two ways of creating Wrapper classes?
	 * 
	 * 93.What is auto boxing autounboxing?
	 * 
	 * 94.What are the advantages of auto boxing?
	 * 
	 * 95.What is casting?
	 * 
	 * 96.What is implicit casting?
	 * 
	 * 97.What is explicit casting?
	 * 
	 * 98.Why Java is considered dynamic?
	 * Java is considered as Dynamic because of Bytecode[a class file]. 
	 * A source code writen in one platform, the same code can be executed in any 
	 * platform[ which JDK is installed.]. And it also loads the class files at runtime. 
	 * anything that happes at runtime is considered as Dynamic, so the java is.
	 * 
	 * 99.Why is Java Architectural Neutral?
	 * To enable a Java application to execute anywhere on the network, the compiler 
	 * generates an architecture-neutral object file format--the compiled code is 
	 * executable on many processors, given the presence of the Java runtime system. 
	 * This is useful not only for networks but also for single system software 
	 * distribution.
	 * 
	 * 100. What is Java Virtual Machine and how it is considered in context of 
	 * Java’s platform independent feature?
	 * When Java is compiled, it is not compiled into platform specific machine, 
	 * rather into platform independent byte code. This byte code is distributed over 
	 * the web and interpreted by virtual Machine (JVM) on whichever platform it is being run.
	 * 
	 * 
	 * 101.What are the diff utility methods present in wrapper classes?
	 * A no.of utility methods are defined in wrapper classes to cretae
	 * and convert them primitives.
	 * 
	 * value of method: providing another way of creating a wrapper object
	 * Integer hundred= Integer.value("100");
	 * 
	 * xxxValue methods:xxxValue methods help in creating primitives.
	 * Integer integer=Integer.valueOf(57);
	 * int primitive=integer.intValue();
	 * float primitivefloat=integer.floatValue();
	 * 
	 * parseXxx methods: parseXxxmethods are similar to valueOf but they return
	 * primitive values.
	 * Int hudred=Integer.parseInt("100");
	 * 
	 * 102.what is boxing and unboxing?
	 * boxing : the concep of representing the primitive dat in the form of its
	 * equalent and corresponding object/wrapper class object known as boxing
	 * 
	 * ex: String s1="123";
	 * Integer i1=new Integer
	 * 
	 * 
	 * 
	 */


}

