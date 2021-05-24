package com.corejava.SerializationDeserialization;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class Employee1 implements Externalizable {
    
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
 
    public Employee1(){}  //This constructor is called during deSerializaition process, as we have implemented Externalizable. 
    
    public Employee1(Integer id, String name) {
        this.id = id;
           this.name = name;
    }
 
    @Override
    public String toString() {
           return "Employee [id=" + id + ", name=" + name + "]";
    }
 
    
    /*
     * define how Serialization process will write objects.  
     */
    @Override
    public void writeExternal(ObjectOutput oo) throws IOException {
           System.out.println("in writeExternal()");
           oo.writeInt(id);
           oo.writeObject(name);
    }
    
 
    /*
     * define how deSerialization process will read objects.  
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException,  ClassNotFoundException {
           System.out.println("in readExternal()");
           this.id=in.readInt();
           this.name=(String)in.readObject();
    }
           
}
 
public class SerializeEmployee1
{
 
    public static void main(String[] args) {
           Employee1 object1 = new Employee1(1, "pratap");
           Employee1 object2 = new Employee1(2, "chitti");
 
           
           try {
                  OutputStream fout = new FileOutputStream("ser.txt");
                  ObjectOutput oout = new ObjectOutputStream(fout);
                  
                  System.out.println("Serialization process has started, serializing employee objects...");
                  oout.writeObject(object1);
                  oout.writeObject(object2);
                  fout.close();
                  oout.close();
                  System.out.println("Object Serialization completed.");
                  
           } catch (IOException ioe) {
                  ioe.printStackTrace();
           }
           
           
      
 
    }
 
}