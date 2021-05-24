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

class Super1 implements Serializable{
 
    private static final long serialVersionUID = 1L;
 
    public Super1(){
           System.out.println("No-arg constructor of Super class");
    }
 
}
 
class Sub1 extends Super1 {  //it automatically implements Serializable (because it's subclass implements Serializable).
    
    private static final long serialVersionUID = 1L;
    private Integer id;
    
    public Sub1(){
           System.out.println("No-arg constructor of sub class");
    }
    
    public Sub1(Integer id) {
           System.out.println("1-arg constructor sub class");
           this.id = id;
    }
 
    @Override
    public String toString() {
           return "Employee [id=" + id + "]";
    }
 
}
 
public class SerializeDeser1
{
 
    public static void main(String[] args) {
 
           Sub1 object1 = new Sub1(8);
 
           try {
                  OutputStream fout = new FileOutputStream("ser.txt");
                  ObjectOutput oout = new ObjectOutputStream(fout);
                  System.out.println("Serialization process has started, serializing objects...");
                  oout.writeObject(object1);
                  fout.close();
         oout.close();
                  System.out.println("Object Serialization completed.");
                  
 
                  //DeSerialization process >
                  
                  
                  InputStream fin=new FileInputStream("ser.txt");
                  ObjectInput oin=new ObjectInputStream(fin);
                  System.out.println("\nDeSerialization process has started, displaying objects...");
                  Sub1 subObj=(Sub1)oin.readObject();
                  System.out.println(subObj);
                  fin.close();
         oin.close();
         System.out.println("Object DeSerialization completed.");
                  
                  
           } catch (IOException | ClassNotFoundException  e) {
                  e.printStackTrace();
           }
 
    }
 
}