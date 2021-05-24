package com.corejava.Java7features;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
 
public class ReadAndWriteFiles {
 
 public static void main(String[] args) {
 
  // Create a path to the file which is
  // to be written and read later
  // here "D:\\books\\java\\" is the address 
  // to reach the file created by name "hubberspot.txt" 
  Path filePath = Paths.get("D:\\books\\java\\hubberspot.txt");
 
  try { 
 
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
 
 
   // Create a BufferedWriter instance by calling 
   // Files class newBufferedWriter() method which
   // returns back BufferedWriter object
   // This method takes in three parameters such as:
   // 1. Path to the file created above
   // 2. Charsets for the format of the file
   // 3. Open options which defines the standard open options
   BufferedWriter writer = Files.newBufferedWriter(filePath, 
     StandardCharsets.UTF_16, StandardOpenOption.WRITE);
 
   // Here we use write() method to write some content
   // to the file at the path specified above
   writer.write("Hello World !!! \n");
   writer.write("Welcome to Hubberspot.com.\n");
   writer.write("Learn Java By Examples !!!!... \n");
 
   // close the writer 
   writer.close();
 
  } catch(Exception e) { 
 
   e.printStackTrace();
 
  }
 
  try { 
 
   // Create a BufferedReader instance by calling 
   // Files class newBufferedReader() method which
   // returns back BufferedReader object
   // This method takes in two parameters such as:
   // 1. Path to the file created above
   // 2. Charsets for the format of the file
   BufferedReader reader = Files.newBufferedReader(filePath,
     StandardCharsets.UTF_16);
 
   String line;
 
   // To read contents of file line by line 
   // we use BufferedReader readLine()
   // method and prints contents to console
   while((line = reader.readLine()) != null) {
 
    System.out.println(line);
 
   }
 
  }
  catch(Exception e) { 
 
   e.printStackTrace();
 
  }
 
 }
}
