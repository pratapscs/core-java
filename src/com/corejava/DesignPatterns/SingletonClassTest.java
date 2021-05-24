package com.corejava.DesignPatterns;

/**
* Singleton class - with Double checked Locking
*/
class Singleton 
{
 
    //private > So that INSTANCE variable cannot be accessed outside class.
    //static > So that INSTANCE variable can be accessed in static methods of class.
    private static Singleton INSTANCE;
 
    /**
     * private constructor - so that class can't be instantiated outside this
     * class
     */
    private Singleton() {
    }
 
    /**
     * Method which will return instance (only instance) of Singleton class.
     * 
     * Method will perform double check and ensure no two threads form more than one instance.
     * 
     * Method is public so that it could be accessed outside class.
     * 
     * Method is static so that it could be accessed without creating instance of class.
     * 
     * Use synchronized block inside method-so that 2 threads don’t create more 
     * than 1 instance of class concurrently.
     */
    public static Singleton getInstance() 
    {
           synchronized (Singleton.class) {
              
        	   if (INSTANCE == null)
                        INSTANCE = new Singleton();
                  return INSTANCE;
           }
 
    }
 
    /**
     * instance method of Singleton class.
     */
    public void m() {
           System.out.println("m()");
    }
 
}
 
 
/**
 *  Main class
 */
public class SingletonClassTest 
{
    public static void main(String... a) 
    {
           
           //obj1 will be the reference variable to Singleton instance.
           Singleton obj1 = Singleton.getInstance();
           obj1.m();
           
           
           //Let's conduct test to ensure instance return by 
           //Singleton are same
           
           //obj2 will be the reference variable to Singleton instance. 
           Singleton obj2 = Singleton.getInstance();
           obj2.m();
           
           //Now, let's do equality test using == operator.
           System.out.println(obj1==obj2); //True
           
    }
}