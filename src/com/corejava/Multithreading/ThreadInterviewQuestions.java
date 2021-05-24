package com.corejava.Multithreading;

public class ThreadInterviewQuestions
{
	/* 1.What is Thread in java?
	 * Threads consumes CPU in best possible manner, hence enables multi processing. 
	 * Multi threading reduces idle time of CPU which improves performance of application.
	 * 
	 * Thread are light weight process.
	 * A thread class belongs to java.lang package.
	 * 
	 * We can create multiple threads in java, even if we don’t create any Thread, 
	 * one Thread at least  do exist i.e. main thread.
	 * 
	 * Multiple threads run parallely in java.  
	 * 
	 * Threads have their own stack.
	 * 
	 * Advantage of Thread : Suppose one thread needs 10 minutes to get certain task,
	 * 10 threads used at a time could complete that task in 1 minute, because 
	 * threads can run parallely.
	 * 
	 * * using complee power of CPU
	 * * asynctask  in android.
	 * * web applications
	 * * gaming
	 * 
	 * 
	 * 2.What is difference between Process and Thread in java?
	 * One process can have multiple Threads,
	 * 
	 * Thread are subdivision of Process. One or more Threads runs in the context 
	 * of process. Threads can execute any part of process. And same part of process 
	 * can be executed by multiple Threads.
	 * 
	 * Processes have their own copy of the data segment of the parent process 
	 * while Threads have direct access to the data segment of its process.
	 * 
	 * Processes have their own address while Threads share the address space of 
	 * the process that created it.
	 * 
	 * Process creation needs whole lot of stuff to be done, we might need to copy
	 * whole parent process, but Thread can be easily created.
	 * 
	 * Processes can easily communicate with child processes but interprocess 
	 * communication is difficult. While, Threads can easily communicate with other 
	 * threads of the same process using wait() and notify() methods.
	 * 
	 * In process all threads share system resource like heap Memory etc. 
	 * while Thread has its own stack.
	 * 
	 * Any change made to process does not affect child processes, but any change 
	 * made to thread can affect the behavior of the other threads of the process.
	 * (Thread1.java,Thread2.java)
	 *  
	 *  
	 * 3.How to implement Threads in java?
	 * Threads can be created in two ways i.e. 
	 * by implementing java.lang.Runnable interface or extending java.lang.Thread 
	 * class and then extending run method.
	 * 
	 * Thread has its own variables and methods, it lives and dies on the heap. 
	 * But a thread of execution is an individual process that has its own call stack.
	 * Thread are lightweight process in java.
	 * (Thread3.java,Thread4.java)
	 * 
	 * 
	 * 4.We should implement Runnable interface or extend Thread class ?
	 * Well the answer is you must extend Thread only when you are looking to 
	 * modify run() and other methods as well. If you are simply looking to modify 
	 * only the run() method implementing Runnable is the best option
	 * (Runnable interface has only one abstract method i.e. run() ). 
	 * 
	 * 
	 * 5.Does Thread implements their own Stack, if yes how? 
	 * Yes, Threads have their own stack.
	 * (Thread5.java)
	 * 
	 * 
	 * * 6.What are differences between implementing Runnable and extending Thread?
	 * Multiple inheritance in not allowed in java : When we implement Runnable 
	 * interface we can extend another class as well, but if we extend Thread 
	 * class we cannot extend any other class because java does not allow multiple 
	 * inheritance. So, same work is done by implementing Runnable and extending 
	 * Thread but in case of implementing Runnable we are still left with option 
	 * of extending some other class. So, it’s better to implement Runnable.
	 * 
	 * Thread safety : When we implement Runnable interface, same object is shared 
	 * amongest multiple threads, but when we extend Thread class each and every 
	 * thread gets associated with new object. 
	 * 
	 * Inheritance (Implementing Runnable is lightweight operation) : When we extend
	 * Thread unnecessary all Thread class features are inherited, but when we 
	 * implement Runnable interface no extra feature are inherited, as 
	 * Runnable only consists only of one abstract method i.e. run() method.  
	 * So, implementing Runnable is lightweight operation.
	 * 
	 * Coding to interface : Even java recommends coding to interface. So, we must 
	 * implement Runnable rather than extending thread. Also, Thread class 
	 * implements Runnable interface.
	 * 
	 * Don’t extend unless you wanna modify fundamental behaviour of class,
	 * Runnable interface has only one abstract method i.e. run()  : 
	 * We must extend Thread only when you are looking to modify run() and other 
	 * methods as well. If you are simply looking to modify only the run() method 
	 * implementing Runnable is the best option (Runnable interface has only one 
	 * abstract method i.e. run() ). We must not extend Thread class unless 
	 * we're looking to modify fundamental behaviour of Thread class.
	 *  
	 * Flexibility in code when we implement Runnable : When we extend Thread first
	 * a fall all thread features are inherited and our class becomes direct 
	 * subclass of Thread , so whatever action we are doing is in Thread class. 
	 * But, when we implement Runnable we create a new thread and pass runnable 
	 * object as parameter, we could pass runnable object to executorService & 
	 * much more. So, we have more options when we implement Runnable and our 
	 * code becomes more flexible.
	 * 
	 * ExecutorService : If we implement Runnable, we can start multiple thread 
	 * created on runnable object  with ExecutorService (because we can start 
	 * Runnable object with new threads), but not in the case when we extend 
	 * Thread (because thread can be started only once). 
	 * 
	 * Conclusion : I’ll recommend you to go for implementing Runnable rather
	 * than extending Thread class.
	 * 
	 * 
	 * 7.How can you say Thread behaviour is unpredictable? 
	 * Thread behaviour is unpredictable because execution of Threads depends 
	 * on Thread scheduler, thread scheduler may have different implementation 
	 * on different platforms like windows, unix etc. Same threading program may 
	 * produce different output in subsequent executions even on same platform.
	 * (Thread6.java)
	 * 
	 * 
	 * 8.When threads are not lightweight process in java?
	 * Threads are lightweight process only if threads of same process are 
	 * executing concurrently. But if threads of different processes are executing
	 * concurrently then threads are heavy weight process.
	 * (Thread1.java,Thread2.java)
	 * 
	 * 
	 * * 9.How can you ensure all threads that started from main must end in order 
	 * in which they started and also main should end in last?
	 * We can use join() method to ensure all threads that started from main must
	 * end in order in which they started and also main should end in last.
	 * In other words waits for this thread to die. Calling join() method 
	 * internally calls join(0);
	 * (MyClass.java)
	 * 
	 * 
	 * * 10.What is difference between starting thread with run() and start() method? 
	 * When you call start() method, main thread internally calls run() method 
	 * to start newly created Thread. So run() method is ultimately called by 
	 * newly created thread. -> (Thread4.java)
	 * When you call run() method main thread rather than starting run() method 
	 * with newly thread it start run() method by itself.->(Thread8.java)
	 * 
	 * 
	 * 11.What is significance of using Volatile keyword? 
	 * Java allows threads to access shared variables. As a rule, to ensure that 
	 * shared variables are consistently updated, a thread should ensure that it 
	 * has exclusive use of such variables by obtaining a lock that enforces 
	 * mutual exclusion for those shared variables.
	 * If a field is declared volatile, in that case the Java memory model ensures
	 * that all threads see a consistent value for the variable.
	 * 
	 * 
	 * 12.What could be impact of not using volatile keyword? 
	 *   (Thread9.java,Thread10.java(synchronized),Thread11.java(volatile) )
	 * 
	 * 
	 * 13.Can we have volatile methods in java?
	 * No, volatile is only a keyword, can be used only with variables.
	 * 
	 * 
	 * 14.Can we have synchronized variable in java?
	 * No, synchronized can be used only with methods, i.e. in method declaration.
	 * 
	 * 
	 * what is synchronization ? why go for this ?
	 * synchronized keyword applicable only for methods.
	 * if there is any data inconsistency at that time use synchronization
	 * 
	 * 
	 * 15.Differences between synchronized and volatile keyword in Java?
	 * 1.Volatile can be used as a keyword against the variable, we cannot use 
	 * volatile against method declaration.
	 *  volatile void method1(){} //it’s illegal, compilation error.
	 *  volatile int i; //legal
	 *  
	 *  While synchronization can be used in method declaration or we can 
	 *  create synchronization blocks. Variables cannot be synchronized.
	 *  Synchronized method: 
	 *  synchronized void method2(){} //legal
	 *  
	 *  Synchronized block: 
	 *    void method2(){
	 *    synchronized (this) {
	 *      //code inside synchronized block.
	 *       }
	 *     }
	 *  
	 *  Synchronized variable (illegal): 
	 *  synchronized int i; //it’s illegal, compilation error.
	 * 
	 * 2.Volatile does not acquire any lock on variable or object, but 
	 * Synchronization acquires lock on method or block in which it is used.
	 * 
	 * 3.Volatile variables are not cached, but variables used inside 
	 * synchronized method or block are cached.
	 * 
	 * 4.When volatile is used will never create deadlock in program, as volatile
	 *  never obtains any kind of lock . But in case if synchronization is not
	 *  done properly, we might end up creating dedlock in program.
	 *  
	 * 5.Synchronization may cost us performance issues, as one thread might be 
	 * waiting for another thread to release lock on object. But volatile is 
	 * never expensive in terms of performance.
	 * (Thread12.java)
	 * 
	 * 
	 * 16. Can you again start Thread?
	 * No, we cannot start Thread again, doing so will throw runtimeException java.
	 * lang.IllegalThreadStateException. The reason is once run() method is 
	 * executed by Thread, it goes into dead state. 
	 * ex:
	 * Thinking of starting thread again and calling start() method on it 
	 * (which internally is going to call run() method) for us is some what like
	 * asking dead man to wake up and run. As, after completing his life person 
	 * goes to dead state.
	 * (MyClass1.java)
	 * 
	 * 
	 * 17.What is race condition in multithreading and how can we solve it? 
	 * When more than one thread try to access same resource without synchronization
	 * causes race condition.
	 * So we can solve race condition by using either synchronized block or 
	 * synchronized method. 
	 * When no two threads can access same resource at a time phenomenon 
	 * is also called as mutual exclusion.
	 * (Thread14.java,Thread15.java)
	 * 
	 * 
	 * 18.What if two threads try to read same resource without synchronization?
	 * When two threads try to read on same resource without synchronization, 
	 * it’s never going to create any problem.
	 * 
	 * 
	 * 19.What if two threads try to write to same resource without synchronization?
	 * When two threads try to write to same resource without synchronization, 
	 * it’s going to create synchronization problems.
	 * 
	 * 
	 * 20.How threads communicate between each other?
	 * Threads can communicate with each other by using wait(), notify() and 
	 * notifyAll() methods.
	 * 
	 * 
	 * 21.Why wait(), notify()  and notifyAll() are in Object class and not 
	 * in Thread class? 
	 * 1. Every Object has a monitor, acquiring that monitors allow thread to hold 
	 * lock on object. But Thread class does not have any monitors. 
	 * 
	 * 2.wait(), notify() and notifyAll() are called on objects only ,When wait() 
	 * method is called on object by thread it waits for another thread on that 
	 * object to release object monitor by calling notify() or notifyAll() method
	 * on that object.
	 * When notify() method is called on object by thread it notifies all the threads 
	 * which are waiting for that object monitor that object monitor is available now.
	 * So, this shows that wait(), notify() and notifyAll() are called on objects 
	 * only.(Thread16.java,Thread17.java,Thread18.java,Thread19.java)
	 * 
	 * 3.Wait(), notify() and notifyAll() method being in Object class allows all 
	 * the threads created on that object to communicate with other.  
	 * [As multiple threads may exist on same object]. 
	 * 
	 * 4.As multiple threads exists on same object. Only one thread can hold object
	 *  monitor at a time. As a result thread can notify other threads of same 
	 *  object that lock is available now. But, thread having these methods does 
	 *  not make any sense because multiple threads exists on object its not other 
	 *  way around (i.e. multiple objects exists on thread).
	 *  
	 *  
	 * 22.what will happen if Thread class contains wait(), notify() and notifyAll() methods?
	 * Having wait(), notify() and notifyAll() methods means Thread class also
	 * must have their monitor. 
	 * Every thread having their monitor will create few problems -
	 *   * Thread communication problem.
	 *   * Synchronization on object won’t be possible- Because object has monitor,
	 *     one object can have multiple threads and thread hold lock on object by 
	 *     holding object monitor. But if each thread will have monitor, we won’t 
	 *     have any way of achieving synchronization. 
	 *   * Inconsistency in state of object (because synchronization won't be 
	 *     possible). 
	 *  
	 *  
	 * 23.Difference between object Lock and class Lock?
	 *        Object lock                                           Class lock
	 * 1.Thread can acquire object lock by-          1.Thread can acquire lock on class’s class object by-
	 * Entering synchronized block or				   Entering synchronized block or
	 * by entering synchronized methods.               by entering synchronized methods.
	 * 
	 * 2.Multiple threads may exist on same          2.Multiple threads may exist on same or different  
	 * object but only one thread of that object       objects of class but only one thread can enter static 
	 * can enter synchronized method at a time.        synchronized method at a time.
	 * Threads on different object can enter 
	 * same method at same time.
	 *
	 * 3.Multiple objects of class may exist and      3.Multiple objects of class may exist but there is
	 *  every object has it’s own lock.					always one class’s class object lock available.
	 *
	 * 
	 * 24. Is it important to acquire object lock before calling wait(), notify() 
	 * and notifyAll()?
	 * Yes, it’s mandatory to acquire object lock before calling these methods 
	 * on object. 
	 * If we call these methods without acquiring object lock i.e. from outside 
	 * synchronize block then java.lang. IllegalMonitorStateException is thrown 
	 * at runtime.
	 * Wait() method needs to enclosed in try-catch block, because it 
	 * throws compile time exception i.e. InterruptedException.
	 * 
	 * 
	 * 25.How can you solve consumer producer problem by using wait() and notify() 
	 * method?
	 * (ProducerConsumerWithWaitNotify.java)
	 * 
	 * 
	 * 26. How to solve Consumer Producer problem without using wait() and notify() 
	 * methods, where consumer can consume only when production is over.?
	 * (ProducerConsumerWithoutWaitNotify.java)
	 * 
	 * 
	 * 25.How can you solve consumer producer pattern by using BlockingQueue?
	 *  java concurrent Api’s, this Api use consumer producer pattern in very 
	 *  optimized manner, BlockingQueue is designed is such a manner that it 
	 *  offer us the best performance. 
	 *  BlockingQueue is a interface and we will use its implementation class 
	 *  LinkedBlockingQueue.
	 *  (com.corejava.Multithreading.ThreadConcurrency.ProducerConsumerBlockingQueue.java,
	 *  BlockingQueueCustomTest.java,ProducerConsumerBlockingQueueCustom.java)
	 * 
	 * 
	 * 26.What is deadlock in multithreading? Write a program to form DeadLock in 
	 * multi threading and also how to solve DeadLock situation. What measures you 
	 * should take to avoid deadlock?
	 * 
	 * Deadlock is a situation where two threads are waiting for each other to 
	 * release lock holded by them on resources.
	 * (how deadlock could be formed in multithreading , DeadlockCreation.java ,
	 * how above formed deadlock could be solved , DeadlockSolution.java)
	 * 
	 * measures to avoid Deadlock:
	 * 1.Lock specific member variables of class rather than locking whole class: 
	 * We must try to lock specific member variables of class rather than locking 
	 * whole class.
	 * 
	 * ex:class CustomClass
	 *          {
	 *             Integer i;
	 *             String str;
	 *          }
	 *  Avoid such kind of locking : in class level
	 *  CustomClass customClassObj=new CustomClass();
	 *  synchronized (customClassObj) {
	 *  }
	 *  
	 *  Try to use such kind of locking (locking specific member variable of class):
	 *  synchronized (customClassObj.str) {}
	 * 
	 * 2.Use join() method: (DeadlockAvoidingUsingJoin.java)
	 * 
	 * 3.If possible try avoid using nested synchronization blocks.
	 * (DeadlockCreationUsingInnerClasses.java)
	 * 
	 * 
	 * 27. Have you ever generated thread dumps or analyzed Thread Dumps?
	 * VisualVM,jstack are most popular way to generate Thread Dump.
	 * (It helps us in analyzing threads performance, thread states, 
	 * CPU consumed by threads, garbage collection )
	 * 
	 * 
	 * 28.What is life cycle of Thread, explain thread states? 
	 * New
	 * Runnable
	 * Running
	 * Waiting/blocked/sleeping
	 * Terminated (Dead) 
	 * 
	 *                        waiting/sleeping/blocking
	 *  notify()/notifyAll()    |              |wait()
	 *  when sleep time is up   |              |sleep()
	 *        resume()          |              |suspend()
	 *                          |              |
	 *             new ----> Runnable ----->  running ----> Terminated(Dead state)                    
	 *                                <-----
	 *                                yield()
	 *                                
	 * New : When instance of thread is created using new operator it is in new state, 
	 *       but the start() method has not been invoked on the thread yet, thread is 
	 *       not eligible to run yet.
	 *       Thread object is considered alive but thread is not alive yet. 
	 *                                     
	 * Runnable :  When start() method is called on thread it enters runnable state. 
	 *             >As soon as Thread enters runnable state it is eligible to run,
	 *             but not running. (Thread scheduler has not scheduled the Thread 
	 *             execution yet, Thread has not entered in run() method yet)
	 *             >A thread first enters the runnable state when the start() method 
	 *             is invoked, but a thread can also return to the runnable state after 
	 *             either running or coming back from a blocked, waiting, or sleeping 
	 *             state. 
	 *             >Thread is considered alive in runnable state.
	 *             >Thread is in Runnable pool.
	 *             
	 * Running : Thread scheduler selects thread to go from runnable to running state. 
	 *           In running state Thread starts executing by entering run() method.
	 *           >Thread scheduler selects thread from the runnable pool on basis of 
	 *           priority, if priority of two threads is same, threads are scheduled 
	 *           in unpredictable manner. Thread scheduler behaviour is completely 
	 *           unpredictable
	 *           >When threads are in running state, yield() method can make thread to 
	 *           go in Runnable state.
	 *        
	 * Waiting/blocked/sleeping : In this state a thread is not eligible to run. 
	 * >Thread is still alive, but currently it’s not eligible to run. In other words.
	 * 
	 * > How can Thread go from running to waiting state ?
	 * By calling wait() method thread go from running to waiting state. 
	 * In waiting state it will wait for other threads to release object monitor/lock. 
	 * 
	 * > How can Thread return from waiting to runnable state ?
	 * Once notify() or notifyAll() method is called object monitor/lock becomes available 
	 * and thread can again return to runnable state.
	 * 
	 * > How can Thread go from running to sleeping state ?
	 * By calling sleep() method thread go from running to sleeping state. 
	 * In sleeping state it will wait for sleep time to get over.
	 * 
	 * > How can Thread return from sleeping to runnable state ?
	 * Once specified sleep time is up thread can again return to runnable state.
	 * 
	 * Suspend() method can be used to put thread in waiting state and resume() method 
	 * is the only way which could put thread in runnable state.
	 * 
	 * Thread also may go from running to waiting state if it is waiting for some I/O 
	 * operation to take place. Once input is available thread may return to running state.
	 * 
	 * Terminated (Dead) : A thread is considered dead when its run() method completes. 
	 * >Once thread is dead it cannot be started again doing so will throw runtimeException 
	 * i.e. IllegalThreadStateException.
	 * destroy() method puts thread directly into dead state. 
	 *
	 *
	 *                       
	 * 29. Are you aware of preemptive scheduling and time slicing?
	 * In preemptive scheduling,the highest priority thread executes until it 
	 * enters into the waiting or dead state. 
	 * In time slicing, a thread executes for a certain predefined time and then 
	 * enters runnable pool. Than thread can enter running state when selected by 
	 * thread scheduler.
	 * 
	 * 
	 * 30.What are daemon threads? 
	 * Daemon threads are low priority threads which runs intermittently in 
	 * background for doing garbage collection. 
	 * 
	 * 12 salient features of daemon() threads >
	 * Thread scheduler schedules these threads only when CPU is idle.
	 * 
	 * Daemon threads are service oriented threads, they serves all other threads.
	 * 
	 * These threads are created before user threads are created and die after 
	 * all other user threads dies.
	 * 
	 * Priority of daemon threads is always 1 (i.e. MIN_PRIORITY).
	 * 
	 * User created threads are non daemon threads.
	 * 
	 * JVM can exit when only daemon threads exist in system.
	 * 
	 * Daemon threads are low priority threads which runs intermittently in 
	 * background for doing garbage collection.
	 * 
	 * we can use isDaemon() method to check whether thread is daemon thread or not.
	 * 
	 * we can use setDaemon(boolean on) method to make any user method a daemon 
	 * thread. Generally, We must not make user threads as daemon.
	 * 
	 * If setDaemon(boolean on) is called on thread after calling start() method 
	 * than IllegalThreadStateException is thrown.
	 * 
	 * You may like to see how daemon threads work, for that you can use VisualVM 
	 * or jStack. I have provided Thread dumps over there which shows daemon 
	 * threads which were intermittently running in background.
	 * 
	 * Some of the daemon threads which intermittently run in background are >
	 * "RMI TCP Connection(3)-10.175.2.71" daemon
	 * "RMI TCP Connection(idle)" daemon
	 * "RMI Scheduler(0)" daemon
	 * "C2 CompilerThread1" daemon
	 * "GC task thread#0 (ParallelGC)"
	 * 
	 * (DaemonTest.java,DaemonTestException.java)
	 * 
	 * 
	 * 31.Why suspend() and resume() methods are deprecated?
	 * Suspend() method is deadlock prone. If the target thread holds a lock on 
	 * object when it is suspended, no thread can lock this object until the target
	 * thread is resumed. If the thread that would resume the target thread attempts
	 * to lock this monitor prior to calling resume, it results in deadlock 
	 * formation.
	 * These deadlocks are generally called Frozen processes.
	 * 
	 * Suspend() method puts thread from running to waiting state. 
	 * And thread can go from waiting to runnable state only when resume() method 
	 * is called on thread. It is deprecated method.
	 * Resume() method is only used with suspend() method that’s why it’s also 
	 * deprecated method.
	 * (SuspendResumeDeadlock.java,SuspendResumeDeadlockSolve.java)
	 * 
	 * 
	 * 
	 * 32. Why destroy() methods is deprecated?
	 * destroy() method is deadlock prone. 
	 * If the target thread holds a lock on object when it is destroyed, 
	 * no thread can lock this object.
	 * calling destroy() method on Threads throw runtimeException 
	 * i.e. NoSuchMethodError.
	 * Destroy() method puts thread from running to dead state.
	 * (DestroyTest.java)
	 * 
	 * 
	 * 33.What will happen if we don’t override run method of thread?
	 * When we call start() method on thread, it internally calls run() method with 
	 * newly created thread. So, if we don’t override run() method newly created 
	 * thread won’t be called and nothing will happen.
	 * (DontOverrideRun.java)
	 * 
	 * 
	 * 34.What will happen if we override start method of thread?
	 * When we call start() method on thread, it internally calls run() method with 
	 * newly created thread. So, if we override start() method, run() method will not 
	 * be called until we write code for calling run() method.
	 * (OverrideStartMethod.java)
	 * 
	 * 
	 * 35.Features of sleep() method?
	 * 1.sleep() is a native method, its implementation is provided by JVM.
	 * 
	 * 2.Definition : sleep() methods causes current thread to sleep for specified number 
	 * of milliseconds (i.e. time passed in sleep method as parameter). Ex- Thread.sleep(10) 
	 * causes currently executing thread to sleep for 10 millisec.
	 * 
	 * 3.Thread state : when sleep() is called on thread it goes from running to waiting 
	 * state and can return to runnable state when sleep time is up.
	 * 
	 * 4.Exception : sleep() method throws compile time exception i.e. InterruptedException.
	 * 
	 * 5.Waiting time : 1.sleep(long millis)  2.sleep(long millis, int nanos)
	 * 
	 * 6.static method : sleep() is a static method, causes the currently executing 
	 * thread to sleep for the specified number of milliseconds.(SleepStatic.java)
	 * 
	 * 7.Native method : implementation of sleep() method is provided by JVM.
	 * public static native void sleep(long millis) throws InterruptedException;
	 * 
	 * 8.Belongs to which class : sleep() method belongs to java.lang.Thread class.
	 * 
	 * 9.synchronized block : thread need not to to acquire object lock before calling 
	 * sleep() method i.e. sleep() method can be called from outside synchronized block.
	 * 
	 * 
	 * 36.Features of Wait() and notify() methods in java?
	 * 1.notify() - Wakes up a single thread that is waiting on this object's monitor. 
	 * If any threads are waiting on this object, one of them is chosen to be awakened. 
	 * The choice is random and occurs at the discretion of the implementation. 
	 * A thread waits on an object's monitor by calling one of the wait methods. 
	 * The awakened threads will not be able to proceed until the current thread 
	 * relinquishes the lock on this object. 
	 * 
	 * notifyAll() - Wakes up all threads that are waiting on this object's monitor. 
	 * A thread waits on an object's monitor by calling one of the wait methods. 
	 * The awakened threads will not be able to proceed until the current thread 
	 * relinquishes the lock on this object. 
	 * 
	 * wait() - Causes the current thread to wait until another thread invokes the notify() 
	 * or notifyAll() method for this object. 
	 * The current thread must own this object's monitor. The thread releases ownership of 
	 * this monitor and waits until another thread notifies threads waiting on this object's 
	 * monitor to wake up either through a call to the notify()/ notifyAll() method. 
	 * The thread then waits until it can re-obtain ownership of the monitor and resumes execution.
	 * 
	 *  EX: (ProducerConsumerWithWaitNotify.java)
	 *      (ProducerConsumerWithoutWaitNotify.java)
	 *  
	 *  
	 * 37.
	 *  
	 *  
	 *  37.What is ThreadPool?
	 *  ThreadPool is a pool of threads which reuses a fixed number of threads  to execute
	 *  tasks.
	 *  
	 *  nThreads threads will be active processing tasks. If additional tasks are submitted 
	 *  when all threads are active, they will wait in the queue until a thread is available.
	 *  
	 *  ThreadPool implementation internally uses LinkedBlockingQueue for adding and 
	 *  removing tasks. 
	 * 
	 * 
	 * 38.Advantage of ThreadPool?
	 * Instead of creating new thread every time for executing tasks, we can create 
	 * ThreadPool which reuses a fixed number of threads for executing tasks. 
	 * As threads are reused, performance of our application improves drastically. 
	 * 
	 * 
	 * 39.Life cycle of threads in ThreadPool?
	 *  1.When threads are created in constructor of ThreadPool they are in New state.
	 *        new ThreadPoolsThread(taskQueue,this);
	 *  
	 *  2.When threads are started in constructor of ThreadPool they enter Runnable state.
	 *        threadPoolsThread.start();
	 *        
	 *  3.When threads enter run() method of ThreadPoolsThread class they enter Running 
	 *    state.
	 *  class ThreadPoolsThread extends Thread {
	 *     . . . 
	 *  public void run() {    
	 *     . . . 
	 *     }
	 *   . . .
	 *  }
	 *  Thread can go from running to waiting state when taskQueue.take() is called and 
	 *  taskQueue’s size is 0. Thread will wait for tasks to become available. 
	 *  
	 *  
	 * 40.How can task become available/ Threads could go from waiting to runnable state?
	 * When execute() method of ThreadPool is called, it internally calls put() method on 
	 * taskQueue to add tasks.
	 *             taskQueue.put(task);
	 *             
	 * Once task is available thread can go from waiting to runnable state. 
	 * And later thread scheduler puts thread from runnable to running state at discretion 
	 * of implementation. 
	 * Once shutdown of ThreadPool is initiated, previously submitted tasks are executed 
	 * by threads and then threads enter dead state.
	 * 
	 * 
	 * 41.How ThreadPool works?
	 *  We will instantiate ThreadPool, in ThreadPool’s constructor nThreads number of 
	 *  threads are created and started.  
	 *  
	 *  Ex : ThreadPool threadPool=new ThreadPool(2);//2 threads will be created and started in ThreadPool.
	 * (ThreadPoolTest.java)
	 * 
	 * 
	 * 42.wha is the use of Executer and ExecutorService ?
	 * Executor and ExecutorService are used for  following purposes in java >
	 * creating thread,starting threads,managing whole life cycle of Threads.
	 * Executor creates pool of threads and manages life cycle of all threads in it in java.
	 * 
	 * 
	 * 43.What is java.util.concurrent.Executor and ExecutorService in java?
	 * (ExecutorServiceExample.java)
	 * 
	 * 
	 * 44.what is java.util.concurrent.Callable and Future in java?
	 * (CallableFutureExample .java)
	 * 
	 *  Future interface provides methods in java >
     * for returning result of computation, wait until computation is not completed and
     * for cancelling the computation in between in java.
     * 
     * Callable interface provides method for computing a result and returning that 
     * computed result or throws an exception if unable to do so
     * Any class implementing Callable interface must override call() method.
	 * 
	 * what type of results Callable’s call() method can return in java?
	 * The Callable<V> is a generic interface, so its call method can return 
	 * generic result spcified by V.
	 * 
	 * How Callable and Future are related in java?
	 * If you submit a Callable object to an Executor returned object is of Future type.
	 * 
	 * Future<Double> futureDouble=executor.submit(new SquareDoubleCallable(2.2));
	 * 
	 * This Future object can check the status of a Callable call’s method and wait until 
	 * Callable’s call() method is not completed.
	 * SquareDoubleCallable is a class which implements Callable.
	 * 
	 * 
	 * 45.Difference between java.util.concurrent.Callable and  java.lang.Runnable?
	 * Class implementing Callable interface must override call() method. 
	 * call() method returns computed result or throws an exception if unable to do so.
	 * 
	 * Class implementing Runnable interface must override run() method.
	 * A Runnable does not return a result and can neither throw a checked exception. 
	 * 
	 * 
	 * 46.Differences between execute() and submit() methods?
	 * 
	 *         execute()                               submit()
	 * 1.execute() method is defined              1.submit() method is defined in 
	 * in Executor interface in java.        		ExecutorService interface in java.
	 *    
	 * 2.It can be used for executing             2.It can be used for executing runnable  task or 
	 * runnable task.                               callable task, submitted callable returns future and 
	 *          									Future's get method will return the task's result.
	 *
	 * 3.void execute(Runnable task)              3.Future<T> submit(Callable<T> task)
	 *  											Future<T> submit(Runnable task, T result)
	 *  											Future<?> submit(Runnable task)
	 *  											(SubmitRunnableExample.java)
	 *  
	 *  
	 *  
	 *  
	 */

}
