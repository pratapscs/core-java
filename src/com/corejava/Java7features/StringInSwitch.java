package com.corejava.Java7features;

import java.util.Scanner;

public class StringInSwitch 
{
 
   @SuppressWarnings("resource")
public static void main(String[] args)
   {
 
 Scanner scanner = new Scanner(System.in);
 
 for(int i = 0; i < 3; i++) {
 
  String companyName = scanner.nextLine();
 
  // Instead of using integers in switch statements
  // for earlier versions, Java 7 allows us to use
  // Strings in switch statements 
  switch(companyName) { 
 
                   case "TCS": 
   System.out.println("You have selected TCS");
   break;
 
     case "Wipro": 
   System.out.println("You have selected Wipro");
   break;
 
     case "Accenture": 
   System.out.println("You have selected Accenture");
   break;
 
     case "Apple": 
   System.out.println("You have selected Apple");
   break;
 
     case "Amdocs": 
   System.out.println("You have selected Amdocs");
   break; 
 
     default: 
   System.out.println("Boom Boom ... Wrong selection");
 
  }
         }
    }
}