package com.corejava.String;

/*21.can we use String in switch case?
 *  yes, java 7 feature
 */
import java.util.Scanner;

public class String21
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