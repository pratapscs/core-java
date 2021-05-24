package com.corejava.FileHandling;

import java.io.File;

public class FindParentDirectory 
{
	 public static void main(String[] args) 
	 {
		 
         String fileName = "c:/myFile.txt";
         File file = new File(fileName);

         System.out.println("Parent directory of " + fileName + " is "+ file.getParent());

  }

}
