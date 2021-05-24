package com.corejava.Java7features;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
 
public class FileCreation {
 
    public static void main(String[] args) {
 
        Path pathToDirectory = FileSystems.getDefault().getPath("C:/Ablage/dev/workspace");
         
        try {
             
            Files.createDirectories(pathToDirectory);
            System.out.println("Directory created at path : " + pathToDirectory);
         
        } catch (IOException e) {
             
            e.printStackTrace();
        }
 
        Path pathToFile = FileSystems.getDefault().getPath("C:/Ablage/dev/workspace/hello.pdf");
         
        try {
             
            Files.createFile(pathToFile);
            System.out.println("File created at path : " + pathToFile);
             
        } catch (IOException e) {
         
            e.printStackTrace();
        }
         
    }
 
}