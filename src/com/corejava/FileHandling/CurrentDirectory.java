package com.corejava.FileHandling;

public class CurrentDirectory 
{
    public static void main(String[] args) 
    {
           String currentPath = System.getProperty("user.dir");
           System.out.println("currentPath = "+ currentPath);
 
    }
}