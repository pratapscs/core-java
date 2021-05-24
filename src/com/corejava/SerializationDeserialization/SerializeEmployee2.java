package com.corejava.SerializationDeserialization;

//to Serialize Object (without serialVersionUID)
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Employee2 implements Serializable 
{
    
       //we haven’t declared SerialVersionUId  
    private Integer id;
    private String name;
    @SuppressWarnings("unused")
	private String addedField;
    

    public Employee2(Integer id, String name) {
           this.id = id;
           this.name = name;
    }
 
    @Override
    public String toString() {
           return "Employee [id=" + id + ", name=" + name + "]";
    }
 
}
 
public class SerializeEmployee2 {
 
    public static void main(String[] args) {
 
           Employee2 object1 = new Employee2(1, "pratap");
           Employee2 object2 = new Employee2(2, "tarun");
 
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