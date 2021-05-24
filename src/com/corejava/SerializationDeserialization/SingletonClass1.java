package com.corejava.SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;

public class SingletonClass1 implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private static SingletonClass1 INSTANCE = null;
 
    //method returns instance of Singleton class.
    public static SingletonClass1 getInstance() {
        if (INSTANCE == null) {
           synchronized (SingletonClass1.class) {
                  INSTANCE = new SingletonClass1();
                  }         
        }
        return INSTANCE;
    }
 
    //constructor
    private SingletonClass1() {}
 
    /**
     *customize Serialization process.
     */
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
       System.out.println("in readObject()");
           ois.defaultReadObject();
        synchronized (SingletonClass1.class) {
         if (INSTANCE == null) {
               INSTANCE = this;
         }
        }
    }
 
    /**
     * Method ensures that we don't break singleton pattern during DeSerialization process- method must not be called other than DeSerialization time.
     */
    private Object readResolve() throws ObjectStreamException {
       System.out.println("in readResolve()");
       return INSTANCE;
    }
 
    public static void main(String[] args) throws Throwable {
           System.out.println("Are objects same before serialization : "+ (getInstance() == getInstance()) );
 
                  OutputStream fout = new FileOutputStream("ser.txt");
                  ObjectOutput oout = new ObjectOutputStream(fout);
           System.out.println("Serialization process has started...");
         oout.writeObject(getInstance());
         fout.close();
         oout.close();
           System.out.println("Object Serialization completed.");
 
           //DeSerialization process >>>>>>>.
                      
           InputStream fin=new FileInputStream("ser.txt");
           ObjectInput oin=new ObjectInputStream(fin);
           System.out.println("\nDeSerialization process has started...");
         SingletonClass1 deSerializedObj = (SingletonClass1)oin.readObject();
            fin.close();
         oin.close();
         System.out.println("Object DeSerialization completed.");
           System.out.println("Are objects same after serialization : "+ (deSerializedObj == getInstance()));
           
    }
}
 