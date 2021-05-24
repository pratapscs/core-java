package com.corejava.Java7features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 
public class CreateAndDeleteFile {
 
 public static void main(String[] args) {
 
  // Create a path to the file which is
  // to be created and deleted later
  // here "D:\\books\\java\\" is the address 
  // to reach the file created by name "hubberspot.java" 
  Path filePath = Paths.get("D:\\books\\java\\hubberspot.java");
 
  // First we check whether file already exists
  // at the filePath by using Files class static
  // method by name exists()
  if (!Files.exists(filePath)) {
 
   try {
 
    // Second we create a file at 
    // the specified filePath by using
    // Files class createFile() method.
    Files.createFile(filePath);
 
   } catch (IOException e) {
 
    e.printStackTrace();
   }
  }
 
  // In order to delete there must be a file,
  // here we check whether file already exists
  // at the filePath by using Files class static
  // method by name exists()
  if (Files.exists(filePath)) {
 
   try {
 
    // here we delete a file at 
    // the specified filePath by using
    // Files class delete() method.
    Files.delete(filePath);
 
   } catch (IOException e) {
 
    e.printStackTrace();
   }
  }
 }
}
