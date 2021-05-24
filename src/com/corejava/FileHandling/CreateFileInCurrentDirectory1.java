package com.corejava.FileHandling;

import java.io.File;
import java.io.IOException;
 

public class CreateFileInCurrentDirectory1 
{
    public static void main(String[] args) 
    {
      try {
 
           String fileName = "myFile.txt";
           
           String currentPath = System.getProperty("user.dir");
           System.out.println("currentPath = "+ currentPath);
           
           String absoluteFilePath = new String( currentPath + File.separator + fileName);
 
           System.out.println("File will be created in (absoluteFilePath)> "+
                      absoluteFilePath);
 
           
           //Now, let's create file in absoluteFilePath
 
           File file = new File(absoluteFilePath);
 
           if (file.createNewFile())
                  System.out.println("File has been created successfully > "
                         + absoluteFilePath);
           else
                  System.out.println("File with the given name already exists > "
                         + absoluteFilePath);
 
      } catch (IOException e) {
           e.printStackTrace();
      }
    }
}