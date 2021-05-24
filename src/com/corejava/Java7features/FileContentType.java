package com.corejava.Java7features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 
public class FileContentType {
 
    public static void main(String[] args) {
         
        printContentType("D:/Downloads/java.txt");
        printContentType("D:/Downloads/java.ppt");
        printContentType("D:/Downloads/java.doc");
        printContentType("D:/Downloads/java.jar");
 
    }
 
    private static void printContentType(String pathToFile) {
         
        Path path = Paths.get(pathToFile);
        String contentType = null;
        try {
            contentType = Files.probeContentType(path);
        } catch (IOException e) {
      
            e.printStackTrace();
        }
        System.out.println("File content type is : " + contentType);
         
    }
 
}