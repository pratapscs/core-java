package com.corejava.SerializationDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
 
class MyClass {}
 

class Employee3 implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Integer id;
    @SuppressWarnings("unused")
	private MyClass myClass ;
    
    public Employee3(Integer id) {
           this.id = id;
           myClass=new MyClass();
    }
 
    @Override
    public String toString() {
           return "Employee [id=" + id + "]";
    }
 
}
 
public class SerializeDeser 
{
 
    public static void main(String[] args) {
 
           Employee3 object1 = new Employee3(8);
 
           try {
                  OutputStream fout = new FileOutputStream("ser.txt");
                  ObjectOutput oout = new ObjectOutputStream(fout);
                  System.out.println("Serialization process has started, serializing objects...");
                  oout.writeObject(object1);
                  System.out.println("Object Serialization completed.");
                  fout.close();
         oout.close();
           
           } catch (IOException  e) {
                  e.printStackTrace();
           }
 
    }
 
}