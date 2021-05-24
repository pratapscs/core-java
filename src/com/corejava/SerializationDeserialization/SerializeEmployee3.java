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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class MyClass1 implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private List<Integer> list;
    private Set<Integer> set;
    private Map<Integer,Integer> map;
    
    public MyClass1(List<Integer> list, Set<Integer> set,
                  Map<Integer, Integer> map) {
           super();
           this.list = list;
           this.set = set;
           this.map = map;
    }
 
    @Override
    public String toString() {
           return "MyClass1 [list=" + list + ", set=" + set + ", map=" + map + "]";
    }
    
 
}
 
public class SerializeEmployee3
{
 
    public static void main(String[] args) {
 
           List<Integer> list=new ArrayList<Integer>();
           list.add(2);
           list.add(3);
           Set<Integer> set=new HashSet<Integer>();
           set.add(4);
           set.add(5);
           Map<Integer, Integer> map=new HashMap<Integer,Integer>();
           map.put(6, 34);
           map.put(7, 35);
           MyClass1 object1 = new MyClass1(list,set,map);
 
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
                  MyClass1 object=(MyClass1)oin.readObject();
                  System.out.println(object);
                  fin.close();
         oin.close();
         System.out.println("Object DeSerialization completed.");
                  
           } catch (IOException | ClassNotFoundException  e) {
                  e.printStackTrace();
           }
 
    }
 
}