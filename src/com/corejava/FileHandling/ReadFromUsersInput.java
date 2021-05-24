package com.corejava.FileHandling;

import java.io.DataInputStream;
import java.io.IOException;
 
public class ReadFromUsersInput 
{
    public static void main(String...args) 
    {
           
           //will wait for user to type some text and press enter
           DataInputStream dis = null;
           
           try {
           System.out.println("Type some text and press enter...");
           
           dis=new DataInputStream(System.in);
           
           char ch;
                  while((ch=(char)dis.read())!=0) {
                        System.out.print(ch); //Display text typed by user in console
                  }
           } catch (IOException e) {
                  e.printStackTrace();
           }
           
           finally {
                  try {
                        if (dis != null)
                               dis.close(); //close DataInputStream
                  } catch (IOException e) {
                        e.printStackTrace();
                  }
           }
           
           
    }
 
}