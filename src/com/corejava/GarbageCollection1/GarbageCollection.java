package com.corejava.GarbageCollection1;

public class GarbageCollection
{
	/* What is Throughput in gc(garbage collection) in java ?
	 * In short, Throughput is the time not spent in garbage collection (GC) 
	 * (in percent).
	 * Throughput focuses on maximizing the amount of work by an application 
	 * in a specific period of time. 
	 * Examples of how throughput might be measured include >
	 * The number of transactions completed in a given time.
	 * The number of jobs that a batch program can complete in an hour.
	 * The number of database queries that can be completed in an hour.
	 * 
	 * 
	 * What are pauses in gc(garbage collection) in java ?
	 * Pauses is applications pauses i.e. when application doesn’t gives any 
	 * response because of garbage collection (GC).
	 * 
	 * 
	 * features of finalize method in java:
	 * 
	 * 1.Finalize method is defined in which class - finalize() method is defined 
	 * in java.lang.Object. So finalize method is inherited in all the classes, 
	 * because all the classes inherit Object class by default in java. 
	 * Signature of finalize method in java is >
	 * protected void finalize() throws Throwable { }
	 * 
	 * 
	 * 2.Why finalize is protected method in java?
	 * Definition of protected method is - The subclass can use protected method 
	 * only through inheritance in java.
	 * finalize method for object can’t be called from some other class outside 
	 * the package without inheritance.
	 * finalize method is protected because class itself or any of its subClass is 
	 * only allowed to invoke finalize method in java.
	 * 
	 * 3.Who calls finalize method in java?
	 * finalize method is called on an object by garbage collector. 
	 * finalize method is called only once by garbage collector for an object.
	 * 
	 * 4.When garbage collector calls finalize method in java?
	 * When there are no more references to the object. A subclass overrides the 
	 * finalize method to dispose of system resources or to perform other cleanup.
	 * 
	 * finalize method is called when JVM determines that no live thread can 
	 * access the object in java.
	 * 
	 * 
	 * 5.Can finalize method make object again available in java ?
	 * The finalize method may make an object available again to other threads.
	 * 
	 * If object is made available in finally method by some thread, will 
	 * finalize method be called again by garbage collector in java?
	 * 
	 * No, finalize method won’t be called again by thread, though it may be 
	 * called explicitly.
	 * 
	 * 
	 * 6.Perform clean actions - General purpose of finalize is to perform 
	 * cleanup actions before the object is permanently discarded in java.
	 * 
	 * For an example - the finalize method for some input/output connection 
	 * might perform some I/O transactions to break the connection before the 
	 * object is permanently discarded.
	 * 
	 * 
	 * 7.Java code in finalize method - The finalize method does not have any 
	 * code. It is just called by garbage collector before discarding object. 
	 * So, subclasses of Object can override the method in java.
	 * 
	 * 8.Which thread invokes finalize method in java?
	 * Daemon threads are low priority threads which runs intermittently 
	 * in background for doing garbage collection. 
	 * But, the JVM does not guarantee which thread will invoke the finalize 
	 * method for an object
	 * 
	 * 
	 * 9.thread calling finalize method does not hold any locks in java -  
	 * It is guaranteed that thread that invokes finalize will not be holding any 
	 * user-visible synchronization locks at invocation of finalize method.
	 * 
	 * 
	 * 10.What if Exception is thrown in finalize method in java?
	 * If any uncaught exception is thrown inside finalize method -
	 * exception is ignored, 
	 * thread is terminated and 
	 * object is discarded.
	 * Note : Any exception thrown by the finalize method causes the finalization 
	 * of this object to be halted, but is otherwise ignored.
	 * 
	 * why exception is ignored in java?
	 * When Exception occurs in finally method it is ignored because JVM 
	 * itself executes the finalize method via garbage collector. So there is no 
	 * scope of propagating exception further  i.e. beyond JVM, hence exception 
	 * is ignored.
	 * 
	 * 
	 * 11.How to call finalize method explicitly in java?
	 * Though finalize method is called by garbage collector but we may call 
	 * the method explicitly in java.
	 * FinalizeTest.java
	 * 
	 * 
	 * 12.When to override finalize method of class in java?
	 * Closing file input stream in finalize method is good idea because when 
	 * there are no references left to it we must call close method, 
Example -
java.io.FileInputStream class overrides finalize method and calls close method.
code of finalize() method of java.io.FileInputStream class >

    protected void finalize() throws IOException {
        if ((fd != null) &&  (fd != FileDescriptor.in)) {
 
         
          * Finalizer should not release the FileDescriptor if another
          * stream is still using it. If the user directly invokes
          * close() then the FileDescriptor is also released.
          
         runningFinalize.set(Boolean.TRUE);
         try {
             close();
         } finally {
             runningFinalize.set(Boolean.FALSE);
         }
        }
 }

Closing Database connections could also be done in this method in java.


When application is heavy and it is likely to run out of space, we may override finalize method and call it periodically so that JVM reclaims space from all the discarded objects in java. 
     *
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
