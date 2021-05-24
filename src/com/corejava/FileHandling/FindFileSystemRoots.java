package com.corejava.FileHandling;

import java.io.File;

public class FindFileSystemRoots 
{
	public static void main(String[] args)
	{
		 
        System.out.println("List of available filesystem roots - ");
        for(File file :File.listRoots()){
               System.out.println(file);
        }

 }

}
