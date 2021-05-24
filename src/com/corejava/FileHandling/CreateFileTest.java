package com.corejava.FileHandling;

import java.io.File;
import java.io.IOException;
 
public class CreateFileTest {
    public static void main(String[] args) { 
           try {
 
                  String fileName = "c:/myFile.txt";
                  File file = new File(fileName);
 
                  /*
                   * File's createNewFile() creates file in path specified above,
                   * Method return true - if file does not exist and was created successfully.
                   * Method return false - if file file already exists.
                   */
                  if (file.createNewFile())
                        System.out.println("File has been created successfully > "
                                                    +fileName);
                  else
                        System.out.println("File with the given name already exists > "
                                                    +fileName);
                  
           } catch (IOException e) {
                  e.printStackTrace();
           }
       }
}