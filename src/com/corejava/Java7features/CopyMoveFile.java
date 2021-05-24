package com.corejava.Java7features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;
 
public class CopyMoveFile {
 
 public static void main(String[] args) {
 
  // Let say we have a file placed at the directory
  // D:\books\java by the name CopyAndMove.txt and 
  // we want to copy or move it to a different directory
  // by name D:\books\CopyAndMove. 
  // In order to do that we create two Path instances 
  // in which one path represent the source and other
  // represents the target
  Path source = Paths.get("D:\\books\\java\\CopyAndMove.txt");
  Path target = Paths.get("D:\\books\\CopyAndMove\\CopyAndMove.txt");
 
  // In order to take a backup we usually use copy()
  // method of Files class by passing three parameters
  // such as source from where it picks the file
  // the target where it tranfers the file and 
  // lastly the CopyOption which tells that 
  // whether to replace existing file if it exists 
  // by the name provided already.
  try {
 
   Files.copy(source, target, REPLACE_EXISTING);
 
  } catch (IOException e) {
 
   e.printStackTrace();
  }
 
  // In order to move a file completely we usually 
  // use move() method of Files class by passing 
  // three parameters such as source from 
  // where it picks the file the target where 
  // it tranfers the file and lastly the 
  // CopyOption which tells that whether 
  // to replace existing file if it exists 
  // by the name provided already.
 
  try {
 
   Files.move(source, target, REPLACE_EXISTING);
 
  } catch (IOException e) {
 
   e.printStackTrace();
  }
 
 }
 
}
