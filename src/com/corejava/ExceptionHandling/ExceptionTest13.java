package com.corejava.ExceptionHandling;

import java.io.FileNotFoundException;

public class ExceptionTest13 
{
//public static void main(String[] args) {
//		
//		m();
//	}
//	static void m() throws FileNotFoundException
//	{
//		
//	}
	
	/*Handling Exception by throwing it from m() method (using throws keyword) and 
	 * handling it in try-catch block from where call to method m() was made. */
	
//	public static void main(String[] args) 
//	{
//        try {
//               m();
//        } 
//        catch (FileNotFoundException e) 
//        {
//            System.out.println("FileNotFoundException handled in try-catch block");
//        }
//        System.out.println("after calling m()");
// }
// static void m() throws FileNotFoundException
// {
// }
	
	/* Throwing Exception from m() method and then again throwing it from calling 
	 * method [ i.e. main method] */
	
	public static void main(String[] args) throws FileNotFoundException
	{
        m();
        System.out.println("after calling m()");
    }
 static void m() throws FileNotFoundException{
	 

 }
 
 

}
