package com.corejava.FileHandling;

import java.io.IOException;

public class ExecuteCMDprogramThroughJava 
{
	 public static void main(String... args) {    
         
         try {
                Runtime.getRuntime().exec("cmd.exe /c c:/myFile.txt");
                System.out.println("CMD commands has been executed through java program.");
         } catch (IOException e) {
                e.printStackTrace();
         }
     
  }

}
