package com.corejava.FileHandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 

public class WriteToFileUsingBufferedOutputStream {
    public static void main(String... args) {
 
           FileOutputStream fos = null;
           BufferedOutputStream bos = null;
           
           try {
                  fos = new FileOutputStream("c:/myFile.txt");
                  bos = new BufferedOutputStream(fos);
 
                  String str="hi java programming";
                  bos.write(str.getBytes()); //convert String into byte array to write in file
                  
                  bos.flush(); //bytes in buffer are written in file
                  
                  System.out.println("String str has been written successfully in file "
                               + "using BufferedOutputStream");
 
           } catch (IOException e) {
                  e.printStackTrace();
           } finally {
                  try { 
                        if (bos != null){
                               bos.close(); //close BufferedOutputStream
                                            //it will close FileOutputStream
                        }
                     } catch (IOException e) {
                        e.printStackTrace();
                  }
           }
 
    }
}