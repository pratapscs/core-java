package com.corejava.SerializationDeserialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
 

public class DeSerializeEmployee 
{
 
    public static void main(String[] args)
    {
           InputStream fin;
           try {
                  fin = new FileInputStream("ser.txt");
                  ObjectInput oin = new ObjectInputStream(fin);
 
                  System.out.println("DeSerialization process has started, "
                               + "displaying employee objects...");
                  Employee emp;
                  
                  while ((emp = (Employee) oin.readObject()) != null) {
                        System.out.println(emp);
                  }
                  oin.close();
 
           } catch (EOFException e) 
           {
                  System.out.println("File ended");
           }  catch (FileNotFoundException e) {
                  e.printStackTrace();
           } catch (IOException e) {
                  e.printStackTrace();
           } catch (ClassNotFoundException e) {
                  e.printStackTrace();
           }
 
           System.out.println("Object DeSerialization completed.");
 
    }
}