package com.corejava.ExceptionHandling;

public class ExceptionHandling 
{
	/* 1. What is exception in java?
	 * Java Exception handling provides a mechanism to handle compile and runtime 
	 * errors in java. 
	 * To make application robust Exception must be handled appropriately, 
	 * by handling exceptions we end up giving some meaningful message to end user 
	 * rather than giving meaningless message in java.
	 * 
	 * 
	 * 2. Explain exception hierarchy in java?
	 * java.lang.Object is superclass of all classes in java.
	 * 
	 * java.lang.Throwable is superclass of java.lang.Exception and java.lang.Error
	 * 
	 * java.lang.Exception is superclass of java.lang.RuntimeException, IOException, 
	 * SQLException, BrokenBarrierException and many more other classes in java.
	 * 
	 * java.lang.RuntimeException is superclass of java.lang.NullPointerException, 
	 * ArithmeticException and many more other classes in java.
	 * 
	 * java.lang.Error is superclass of java.lang.VirtualMachineError, IOError, 
	 * AssertionError, ThreadDeath and many more other classes in java.
	 * 
	 * java.lang.VirtualMachineError is superclass of java.lang.OutOfMemoryError, 
	 * StackOverflowError and many more other classes in java.
	 * 
	 * 
	 * 3.Differences between checked and unchecked exceptions >
	 * 
	 * Property                   checked exception                  unchecked exception
	 * 
	 * 1.Also known as        checked exceptions are also            unchecked exceptions are also
	 *                        known as compileTime exceptions.       known as runtime exceptions.
	 * 
	 * 2.Should be solved     Checked exceptions are those           Unchecked exceptions are those
	 * at compile or          which need to be taken care            which need to be taken care at 
	 * runtime?               at compile time.                       runtime.
	 * 
	 * 
	 * 3.Benefit/             We cannot proceed until we			  Whenever runtime exception occurs
	 * Advantage              fix compilation issues which            execution of program is interrupted,
	 *                        are most likely to happen in            but by handling these kind
	 *                        program, this helps us in avoiding      of exception we avoid such interruptions
	 *                        runtime problems upto lot of extent.    and end up giving some meaningful message to user.
	 *                        
	 * 4.Creating            class UserException extends Exception    class UserException extends RuntimeException {
	 * custom/own 			 {                                        UserException(String s) {
	 * exception             UserException(String s) {                super(s);
	 *                          super(s);                             }}
	 *                           } }
	 *                       By extending java.lang.Exception, we     By extending java.lang.RuntimeException
	 *                       can create checked exception.            we can create unchecked exception.
	 *          
	 *          
	 * 5.Exception           For propagating checked exceptions         unchecked exceptions are automatically
	 * propagation           method must throw exception by             propagated in java.
	 * 					     using throws keyword.                      ExceptionTest2.java
	 *                       ExceptionTest1.java
	 * 
	 * 6.handling checked     If superclass method throws/             If superclass method throws/
	 * and unchecked 		  declare checked exception >              declare unchecked >
	 * exception while        overridden method of subclass can        overridden method of subclass can 
	 * overriding 			  declare/throw narrower (subclass         declare/throw any unchecked /RuntimeException 
	 * superclass method      of)checked exception. or                 declare/throw any unchecked /RuntimeException 
	 *                        overridden method of subclass            (superclass or subclass) (As shown in Program),
	 *                        cannot declare/throw broader              or
	 *                        (superclass of) checked exception        overridden method of subclass cannot 
	 *                        (As shown in Program), or                declare/throw any checked exception (As shown in Program), 
	 *                         overridden method of subclass can 
	 *                         declare/throw any unchecked /
	 *                         RuntimeException (As shown in Program)
	 *                         
	 * Which classes are       The class Exception and all               The class RuntimeException and
	 * which type of           its subclasses that are not               all its subclasses are unchecked exceptions.
	 * exception?  either      also subclasses of RuntimeException       Likewise,
	 * checked or              are checked exceptions.                   The class Error and all its 
	 * unchecked exception?                                              subclasses are unchecked exceptions.
	 * 
	 * 
	 * 7.Most frequently      SQLException,IOException,                  NullPointerException,
	 * faced exceptions       ClassNotFoundException                     ArithmeticException
	 *                                                                   ArrayIndexOutOfBoundsException.
	 *  					  
	 *                         
	 *                        
     * 4.What are 5 exception handling keywords in java? 
     *try - Any exception occurring in try block is catched by catch block.
     *
     *catch - catch block is always followed by try block in java.
     *
     *finally - finally block can can only exist if try or try-catch block is there, 
     *finally block can’t be used alone in java.
     *
     *Features of finally >
     *finally block is always executed irrespective of exception is thrown or not.
     *finally is keyword in java.
     *finally block is optional in java, we may use it or not.
     *
     *finally block is not executed in following scenarios >
     *finally is not executed when System.exit is called.
     *if in case JVM crashes because of some java.util.Error. 
     *
     *finally block is executed when exception is not thrown.(ExceptionTest4.java)
	 * 
	 * finally block is executed when exception is thrown, in this case catch and 
	 * finally both blocks are executed.(ExceptionTest5.java)
	 * 
	 * finally block is executed when exception is thrown and not handled properly, 
	 * in this case catch blocks does not executes, finally block executes alone.
	 * (ExceptionTest6.java)
	 * 
	 * finally is not executed when System.exit is called.(ExceptionTest7.java)
	 * 
	 * What will happen when catch and finally block both return value, also when 
	 * try and finally both return value in java.(ExceptionTest8.java,ExceptionTest9.java)
	 * 
	 * 
	 * Application of finally block in java programs >
	 * We may use finally block to execute code for database connection closing, 
	 * because closing connection in try or catch block may not be safe.
	 * 
	 * Why closing connection in try block may not be safe?
	 * Because exception may be thrown in try block before reaching connection 
	 * closing statement.
	 * 
	 * Why closing connection in catch block may not be safe?
	 * Because inappropriate exception may be thrown in try block and we might 
	 * not enter catch block to close connection.
	 * 
	 * Does finally block always execute? Will finally block execute when 
	 * System.exit is called?
	 * finally is not executed when System.exit is called, finally block is 
	 * also not executed when JVM crashes because of some java.util.Error.
     *
     *throw - throw is a keyword in java.
     *throw keyword allows us to throw checked or unchecked exception.
     *
     *throws - throws is written in method’s definition to indicate that method can 
     *throw exception in java.
     *
     *(ExceptionTest3.java)
     *
     *
     * 5. Explain what is Error in java?
     *  java.lang.Error 
     *  Error is a subclass of Throwable  in java.
     *  Error indicates some serious problems that our application should not try to 
     *  catch in java. 
     *  Errors are abnormal conditions in application. 
     *  Error and its subclasses are regarded as unchecked exceptions in java.
     *  
     *  ThreadDeath is an error which application must not try to catch but it 
     *  is normal condition.
     *  
     *  
     * 6.Why application should not try to catch Error?
     * Because, in most of cases recovery from an Error is almost impossible. 
     * So, application must be allowed to terminate. 
     * Example>
     * Let’s say errors like OutOfMemoryError and StackOverflowError occur and are 
     * caught then JVM might not be able to free up memory for rest of application 
     * to execute, so it will be better if application don’t catch these errors 
     * and is allowed to terminate.
     * (StackOverflowError.java)
     * 
     * 
     * 7.Differences between Exception and Error in java >
     * property                       Exception                         Error
     * 
     *1.serious problem?          Exception does not indicate           Error indicates some serious problems
     *                            any serious problem.                  that our application should not try to catch.
     *                            
     *2.divided into              Exception are divided into            Error are not divided further
     *checked and unchecked       checked and unchecked exceptions.     into such classifications
     *
     *3.Which classes are         The class Exception and all its       Error and its subclasses are
     *which type of exception?    subclasses that are not also          regarded as unchecked exceptions
     *either checked or           subclasses of RuntimeException
     *unchecked exception?        are checked exceptions.
     *                            The class RuntimeException and 
     *                            all its subclasses are unchecked 
     *                            exceptions.
     *                            Likewise,The class Error and 
     *                            all its subclasses are unchecked 
     *                            exceptions.
     *                            
     *4.Most frequently faced     checked exceptions>                   VirtualMachineError, IOError,
     * exception and errors       SQLException,                         AssertionError, ThreadDeath,
     * 							  IOException,                          OutOfMemoryError, StackOverflowError.
     * 							  ClassNotFoundException
     * 							  unchecked exceptions>
     *                            NullPointerException,
     *                            ArithmeticException,
     * 
     *5.Why to catch or           Application must catch the             Application must not catch the Error
     * not to catch?              Exception because they does not        because they does cause any major threat to application.
     *                            cause any major threat to              Example >
     *                            application.                           Let’s say errors like OutOfMemoryError 
     *                            										 and StackOverflowError occur and are caught
     *                                                                   then JVM might not be able to free up memory for
     *                                                                   rest of application to execute, so it will be 
     *                                                                   better if application don’t catch these errors 
     *                                                                   and is allowed to terminate.
	 * 
	 * 8.throw keyword?
	 * throw is a keyword in java.
	 * throw keyword allows us to throw checked or unchecked exception.
	 * 
	 * throw unchecked exception:(ExceptionTest10.java)
	 * We need not to handle unChecked exception either by catching it or throwing it.
	 * 
	 * throw checked exception:(ExceptionTest11.java)
	 * We need to handle checked exception either by catching it, or 
	 * throwing it by using throws keyword. (When thrown, exception must be handled 
	 * in calling environment)
	 * 
	 * 9.throws keyword?
	 * throws is written in method’s definition to indicate that method can throw exception.
	 * 
	 * throws unChecked exception:(ExceptionTest12.java)
	 * We need not to handle unChecked exception either by catching it or throwing it.
	 * 
	 * throws Checked exception:(ExceptionTest13.java)
	 * We need to handle checked exception either by catching it or throwing it further, 
	 * if not handled we will face compilation error.
	 * 
	 * 10.Nested try-catch block in java?
	 * Java exception handling allows us to use nested try-catch block.
	 * Nested try-catch block means using try-catch block inside another try-catch block.
	 * (ExceptionTest14.java)
	 * 
	 * 11.Multiple catch block in java?
	 * Exception class handled in starting catch block must be subclass of 
	 * Exception class handled in following catch blocks (otherwise we will 
	 * face compilation error).
	 * Either one of the multiple catch block will handle exception at time. 
	 * 
	 * syntax like this way :
	 * try{
                  //code . . . . . 
           }catch(IOException ex1){
                  //code . . . . .
           } catch(SQLException ex2){
                  //code . . . . .
           }      
	 * (ExceptionTest15.java)
	 * 
	 * 12.Why shouldn’t you use Exception for catching all exceptions in java?
	 * Catching Exception rather than handling specific exception can be vulnerable to 
	 * our application. Multiple catch blocks must be used to catch specific exceptions, 
	 * because handling specific exception gives developer the liberty of taking appropriate 
	 * action and develop robust application.
	 * 
	 * 13.What will happen when catch and finally block both return value, also when 
	 * try and finally both return value in java?
	 * (ExceptionTest16.java)
	 * 
	 * 14.Creating User defined checked and unchecked Exception/ custom Exception in java?
	 * 
	 * Creating user defined checked exception >
	 * class UserDefinedException extends Exception {
	 * UserDefinedException(String s) {
	 * super(s);
	 *  }
	 * }
	 * By extending java.lang.Exception, we can create checked exception.
	 * 
	 * Creating user defined unchecked exception >
	 * class UserDefinedException extends RuntimeException {
	 * UserDefinedException(String s) {
	 * super(s);
	 *   }
	 * }
	 * By extending java.lang.RuntimeException, we can create unchecked exception.
	 * (UserDefinedExceptionTest.java)
	 * 
	 * 15.Catch block and Automatic Resource Management in java 7?
	 * Features of multi catch syntax :
	 * Has improved way of catching multiple exceptions.
	 * This syntax does not looks clumsy.
	 * Reduces developer efforts of writing multiple catch blocks.
	 * Allows us to catch more than one exception in one catch block.
	 * Helps in automatic resource management.
	 * 
	 * multi catch syntax >
              try{
                  //code . . . . . 
           }catch(IOException | SQLException ex){
                  //code . . . . .
           }      
We could separate different exceptions using pipe ( | )
	 *
	 *(ExceptionTest17.java)(ExceptionTest18.java)
	 * 
	 * 16.Try-with-resources in java - java.lang.AutoCloseable interface - java7?
	 * (TryWithResourseTest.java)
	 * 
	 * why we need not to close file when we are using Try-with-resources?
	 * Because FileInputStream implements java.lang.AutoCloseable interface 
	 * (AutoCloseable interface’s close method automatically closes resources 
	 * which are no longer needed.)
	 * 
	 * Which classes can be used inside Try-with-resources?
	 * All the classes which implements AutoCloseable interface can be used inside 
	 * Try-with-resources.
	 * 
	 * 
	 * 17.Exception propagation in java - deep understanding of how checked 
	 * and unchecked exceptions are propagated?
	 * 
	 * 
	 * 18.Exception chaining and other names for it in java?
	 * Exception chaining is also known as exception wrapping in java.
	 * 
	 * 19.What is Exception chaining/ exception wrapping in java?
	 * When Exception is thrown we catch it and throws some other Exception than the 
	 * concept is called Exception chaining in java.
	 * (ExceptionChainingExample.java)
	 * 
	 * 20. What is a stack trace in exceptions in java?
	 * A stack trace is the list of the methods from which the method is called 
	 * which throws some Exception in java
	 * (StackTraceExample.java)
	 * 
	 * 21.How to access stack trace information in java?
	 * (ExceptionChainingExample1.java)
	 * 
	 * 22.When to use stack trace information in java?
	 * When we want to stack trace to be printed user defined format in java.
	 * 
	 * 23.Throw/declare checked and unchecked exception while overriding superclass
	 *  method in java?
	 *  (ExceptionTest19.java)
	 *  
	 * 24.Let's say one method handles Exception and other handles ArithmeticException. 
	 * Which method will be invoked when ArithmeticException is thrown?
	 *Method which handles more specific exception will be called.
	 *(ExceptionTest20.java)
	 *
	 * 25.some important scenarios:
	 * 
	 * 1.Throw exceptions when the method cannot handle the exception, and more importantly,
	 *   must be handled by the caller. 
	 * Example - In Servlets - doGet() and doPost() throw ServletException or IOException 
	 * in certain circumstances where the request could not be read correctly. 
	 * Neither of these methods are in a position to handle the exception, but the 
	 * container is (which generally results in the 404 error page in most cases).
	 * 
	 * 2.Bubble the exception if the method cannot handle it.
	 * 
	 * 3.Throw the exception right away.
	 * 
	 * 4.Either log the exception or bubble it, but don't do both.
	 * 
	 * 5.Application should not try to catch Error
	 * 
	 * 6.Use subclasses of checked exceptions, when you except the caller to handle 
	 * the exception.
	 * 
	 * 7.Throwing RuntimeException
	 * 
	 * 8.Use exception class hierarchies for communicating information about exceptions 
	 * across various tiers.
	 * 
	 * 9.Avoid catching exceptions you cannot handle.
	 * 
	 * 10.Wrap exceptions with care
	 * 
	 * 11.Convert checked exceptions into unchecked ones only when required.
	 * 
	 * 12.Throwable should be caught.
	 * 
	 * 26.How to handle exception or error thrown from static block or initializing 
	 * static variable in java?
	 * Java does not allows static initialization block to throw any exception, though 
	 * it is allowed to use use try-catch block inside static initialization block.
	 * 
	 * If any RuntimeException occurs in static initialization block of class then 
	 * java.lang.ExceptionInInitializerError is thrown. So, we can catch 
	 * ExceptionInInitializerError and handle exception thrown from static block in java.
	 * (SolveStaticBlockExceptionExample.java)
	 * 
	 * 27.what are static blocks in java? what are features of static block in java?
	 * static blocks are called as soon as class is loaded even before instance of 
	 * class is created (i.e. before constructor is called)
	 * 
	 * static blocks executes before instance blocks.
	 * 
	 * static block are also known as static initialization blocks in java.
	 * 
	 * Any code written inside static block is thread safe.
	 * 
	 * Only static variables can be accessed inside static block
	 * 
	 * static blocks can be used for initializing static variables or calling any 
	 * static method.
	 * 
	 * this keyword cannot be used in static block.
	 * 
	 * 28.Why throw not allowed in static block?
	 * We don’t have any control over the execution of static blocks because they are 
	 * executed when class is loaded. 
	 * We cannot call static block at our will i.e. after class has been loaded or in 
	 * between program execution. So, throwing exception from static initialization block 
	 * does not make any sense.
	 * 
	 * 29.What static initialization blocks allows regarding Exceptions in java?
	 * Java allows to use use try-catch block inside static initialization block.
	 * If any RuntimeException (Example - ArithmeticException by using 1/0) is thrown 
	 * it is propagated automatically in java.
	 * 
	 * 30.What static initialization blocks doesn’t allows?
	 * Java does not allows static initialization block to throw any exception in java.
	 * Explicitly it does not allow you to throw even RuntimeException . 
	 * Example - throw new RuntimeException() is not allowed.
	 * throw and throws both are not allowed in static initialization block.
	 * 
	 * 31.checked (compile time) in java?
	 * IOException in java:
	 * -java.lang.Object
	 *  -java.lang.Throwable
	 *   -java.lang.Exception
	 *    -java.lang.IOException
	 *    
	 * java.lang.IOException is a Checked (compile time) Exception in java.
	 * 
	 * 
	 * 
	 * FileNotFoundException in java:
	 * -java.lang.Object
	 *  -java.lang.Throwable
	 *   -java.lang.Exception
	 *    -java.lang.IOException
	 *     -java.lang.FileNotFoundException
	 *     
	 * java.lang.FileNotFoundException is a Checked (compile time) Exception in java.
	 * 
	 * EOFException occurs and how to avoid it in java:
	 * -java.lang.Object
	 *  -java.lang.Throwable
	 *   -java.lang.Exception
	 *    -java.lang.IOException
	 *     -java.lang.EOFException
	 *     
	 * java.lang.EOFException is a Checked (compile time) Exception in java.
	 * 
	 * SQLException in java:
	 * 
	 * What is java.lang.InterruptedException in java
	 * when java.lang.ClassNotFoundException occurs in java
	 * Solve InvalidClassException in java
	 * 
	 * 32.unchecked (runtime) in java.?
	 *What is java.lang.NullPointerException in java, when it occurs,how to handle, 
	 *avoid and fix it
	 *NumberFormatException in java
	 *IndexOutOfBoundsException in java
	 *When java.lang.ArrayIndexOutOfBoundsException occurs in java
	 *When java.lang.StringIndexOutOfBoundsException occurs in java
	 *java.lang.ArithmeticException in java - Divide number by zero
	 *When dividing by zero does not throw ArithmeticException in java
	 *When java.lang.IllegalStateException occurs in java
	 *when java.lang.IllegalMonitorStateException is thrown in java
	 *Solve java.lang.UnsupportedOperationException in java
	 * 
	 * 33.Errors in java > 
	 *OutOfMemoryError in java
	 *When java.lang.StackOverflowError occurs in java
	 *Solve java.lang.ExceptionInInitializerError in java
	 *How to solve java.lang.NoClassDefFoundError in java 
	 * 
	 * 
	 * 34.Differences between throw and throws in java >
	 *     throw                                           throws
	 * 
	 * 1.throw keyword is used to                    throws keyword is used to
	 * throw an exception explicitly.                declare an exception.
	 * 
	 * 2.throw is used inside method.                throws is used in method declaration.
	 * Example >                                     Example >
	 * static void m(){                              static void m() throws FileNotFoundException{
	 * throw new FileNotFoundException();            }
	 * }
	 * 
	 * 3.throw is always followed by                 throws is always followed by .
	 * instanceof Exception class.                   name of Exception class
	 * Example >                                     Example> 
	 * throw new FileNotFoundException()             throws FileNotFoundException
	 * 
	 * 4.throw can be used to throw                  throws can be used to throw 
	 * only one exception at time.                   multiple exception at time.
	 * Example >                                     Example >
	 * throw new FileNotFoundException()             throws FileNotFoundException, 
	 * 												 NullPointerException and many more...
	 * 
	 * 5.throw cannot propagate exception            throws can propagate exceptions
	 *  to calling method.                           to calling method.
	 *  
	 * 
	 * 35.Differences between Final, Finally and Finalize in java?
	 * 
	 * 36.Difference between multiple catch block and multi catch syntax in java?
	 * 
	 *  
	 * 
	 * 
	 */
	
}
