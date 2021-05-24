package com.corejava.java.lang.ObjectClass;

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
import java.util.HashMap;
import java.util.Map;
 
class Employee2 implements Serializable  {
    
    private static final long serialVersionUID = 1L;
 
    private String name;
    private Map<Integer,Integer> map;
    
    public Employee2(String name,Map<Integer,Integer> map) {
           this.name = name;
           this.map=map;
    }
 
    @Override
    public String toString() {
           return "Employee [name=" + name + "]";
    }
 
    public String getName() {
           return name;
    }
 
    public Map<Integer, Integer> getMap() {
           return map;
    }
 
} 
/**
 * Main class
 */
public class CloneUsingSerialization 
{
    public static void main(String[] args)
    {

           Map<Integer,Integer> map=new HashMap<Integer,Integer>();
           map.put(1, 11);
           
           Employee2 emp = new Employee2("pratap",map);
 
           try {
                  OutputStream fout = new FileOutputStream("ser.txt");
                  ObjectOutput oout = new ObjectOutputStream(fout);
                  System.out.println("Serialization process has started, "
                                                           + "serializing employee object...");
                  oout.writeObject(emp);
                  fout.close();
                  oout.close();
                  System.out.println("employee Serialization completed.");
                  
 
                  //DeSerialization process >
                  
                  
                  InputStream fin=new FileInputStream("ser.txt");
                  ObjectInput oin=new ObjectInputStream(fin);
                  System.out.println("\nDeSerialization process has started, "
                                                           + "deSerializing employee object...");
                  Employee2 deSerializedEmp=(Employee2)oin.readObject();
                  fin.close();
                oin.close();
                  System.out.println("employee DeSerialization completed.");
                   
                  System.out.println(emp==deSerializedEmp);                     //false
                  System.out.println(emp.getName()==deSerializedEmp.getName()); //false
                  System.out.println(emp.getMap()==deSerializedEmp.getMap()); //false
                  
           } catch (IOException | ClassNotFoundException  e) {
                  e.printStackTrace();
           }
 
    }
    
    /* In serialization and deserialization process, different object is created after 
     * deserialization ( i.e. deSerializedEmp is created from emp) , also member variables
     * starts referring to different objects (i.e. name and map).
     * 
     * 
     *                               java heap memory
     * (object to be serialized)                                  (object after deserialization)
     *        emp -------->       (name,map)    (name,map) <------- clonedObj
     *
     * 
     */
 
}
 