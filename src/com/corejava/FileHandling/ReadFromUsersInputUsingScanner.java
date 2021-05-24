package com.corejava.FileHandling;

import java.io.IOException;
import java.util.Scanner;
 
public class ReadFromUsersInputUsingScanner 
{
    public static void main(String[] args) throws IOException 
    {
           
           Scanner scan = new Scanner(System.in);
           
           System.out.print("enter your name : ");
           String name = scan.next(); // //will wait for user to enter name
           System.out.println("enter your name : " + name);
 
           System.out.print("\nenter your age : ");
           int age = scan.nextInt();//will wait for user to enter age
           System.out.println("Your age is : " + age);
 
           System.out.print("\nenter your salary : ");
           double salary = scan.nextDouble();//will wait for user to enter salary
           System.out.println("Your salary is : " + salary);
 
           scan.close();
    }
 }