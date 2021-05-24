package com.corejava.SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* In order to serialize object our class needs to implement java.io.Serializable 
 * interface. Serializable interface is Marker interface i.e. it does not have any 
 * methods of its own, but it tells Jvm that object has to converted into byte stream.
 */

class Employee implements Serializable 
{
    private static final long serialVersionUID = 1L;
   
    private Integer id;
    private String name;
 
    public Employee(Integer id, String name) {
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
    private void writeObject(ObjectOutputStream os)
    {
           System.out.println("In, writeObject() method.");    
           try {
                  os.writeInt(this.id);
                  os.writeObject(this.name);
           } 
           catch (Exception e) 
           {
                  e.printStackTrace();
           }
    } 
    
 
    /*
     * define how deSerialization process will read objects.  
     */
    private void readObject(ObjectInputStream ois) 
    {
           System.out.println("In, readObject() method.");
           try {
                  id=ois.readInt();
                  name=(String)ois.readObject();
           } catch (Exception e) {
                  e.printStackTrace();
           }
    } 
    
}
public class SerializeEmployee 
{
    public static void main(String[] args)
    {
           Employee object1 = new Employee(1, "pratap");
           Employee object2 = new Employee(2, "viswa");
 
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
           
           //Start deSerialization process.
           //Create object of ObjectInput and give it’s reference variable 
           //name oin and call readObject() method 
 
           try{
                  InputStream fin=new FileInputStream("ser.txt");
                  ObjectInput oin=new ObjectInputStream(fin);
                  
                  System.out.println("\nDeSerialization process has started, displaying deSerialized employee objects...");
                  
                  Employee emp;
                  
                  while( (emp=(Employee)oin.readObject())!=null )
                  {
                        System.out.println(emp);
                  }
                  fin.close();
                  oin.close();
         
           }
           catch(IOException | ClassNotFoundException e){
                  //e.printStackTrace();
           }
           System.out.println("Object DeSerialization completed.");
           
 
    }
 
}