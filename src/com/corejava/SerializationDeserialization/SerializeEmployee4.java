package com.corejava.SerializationDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
 
 
/*
 * Class whose instance will be written at EOF during serialization
 * to indicate EOF during deSerialization process.
 */
@SuppressWarnings("serial")
class EofIndicatorClass implements Serializable{}
 
 
class Employee5 implements Serializable 
{
    
    private static final long serialVersionUID = 1L;
    private String name;
 
    public Employee5(String name) {
           this.name = name;
    }
 
    @Override
    public String toString() {
           return "Employee [name=" + name + "]";
    }
 
}
 
 
/*
 * Serialization class
 */
public class SerializeEmployee4 {
 
    public static void main(String[] args) {
 
           Employee5 object1 = new Employee5( "pratap");
           Employee5 object2 = new Employee5( "viswa");
 
           try {
                  OutputStream fout = new FileOutputStream("ser.txt");
                  ObjectOutput oout = new ObjectOutputStream(fout);
 
                  System.out.println("Serialization process has started, "
                               + "serializing employee objects...");
                  oout.writeObject(object1);
                  oout.writeObject(object2);
                  
                  //write instance of EofIndicatorClass at EOF
                  oout.writeObject(new EofIndicatorClass());
 
                  oout.close();
                  System.out.println("Object Serialization completed.");
                  
           } catch (IOException ioe) {
                  ioe.printStackTrace();
           }
 
    }
 
}
 