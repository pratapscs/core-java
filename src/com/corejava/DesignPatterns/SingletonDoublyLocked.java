package com.corejava.DesignPatterns;

/**
* Singleton class - with Double checked Locking
*/
class SingletonDoublyLocked 
{
 
 private static SingletonDoublyLocked INSTANCE;
 
    /**
     * private constructor
     */
    private SingletonDoublyLocked() {
    }
 
    public static SingletonDoublyLocked getInstance() {
           //First check - To avoid more than one instance creation of Singleton class.
           if (INSTANCE == null) {
                  synchronized (SingletonDoublyLocked.class) {
                        //Second check - To avoid more than one instance creation of 
    //Singleton class.
                        if (INSTANCE == null) {
                               INSTANCE = new SingletonDoublyLocked();
                        }
                  }
           }
           return INSTANCE;
    }
 
    
}