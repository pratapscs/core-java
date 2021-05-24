package com.corejava.SerializationDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Super implements Serializable{
 
    private static final long serialVersionUID = 1L;
 
}
 
class Sub extends Super {
    
    private static final long serialVersionUID = 1L;
    private Integer id;
    
    public Sub(Integer id) {
           this.id = id;
    }
 
    @Override
    public String toString() {
           return "Employee [id=" + id + "]";
    }
    
    /*
     * define how Serialization process will write objects.  
     */
    private void writeObject(ObjectOutputStream os) throws NotSerializableException {
           throw new NotSerializableException("This class cannot be Serialized");
    } 
    
 
}
 
public class SerializeDeserialize 
{
 
    public static void main(String[] args) {
 
           Sub object1 = new Sub(8);
 
           try {
                  OutputStream fout = new FileOutputStream("ser.txt");
                  ObjectOutput oout = new ObjectOutputStream(fout);
                  System.out.println("Serialization process has started, serializing objects...");
                  oout.writeObject(object1);
                  fout.close();
         oout.close();
         System.out.println("Object Serialization completed.");
                  
           
           } catch (IOException  e) {
                  e.printStackTrace();
           }
 
    }
 
}