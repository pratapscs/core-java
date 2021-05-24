package com.corejava.FileHandling;

import java.io.File;
import java.io.IOException;
 

public class CreateFileInCurrentDirectory
{
    public static void main(String[] args) 
    {
      try {
 
           String fileName = "myFile.txt";
           
           String currentPath = System.getProperty("user.dir");
           System.out.println("currentPath = "+ currentPath);
 
           //Now, let's create file using new File(currentPath, fileName) method
 
           File file = new File(currentPath, fileName);
 
           if (file.createNewFile())
                  System.out.println("File has been created successfully > "
                               + (currentPath + File.separator + fileName));
           else
                  System.out.println("File with the given name already exists > "
                               + (currentPath + File.separator + fileName));
 
      } catch (IOException e) {
           e.printStackTrace();
      }
    }
}