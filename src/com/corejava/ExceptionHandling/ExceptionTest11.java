package com.corejava.ExceptionHandling;

import java.io.FileNotFoundException;

public class ExceptionTest11 
{
//public static void main(String[] args) {
//		
//		m();
//	}
//	static void m()
//	{
//		throw new FileNotFoundException(); //Unhandled exception type FileNotFoundException
//	}
	
	/*Handling Exception in try-catch block where it was thrown.*/
	
//	 public static void main(String[] args)
//	 {
//         m();
//         System.out.println("after calling m()");
//  }
//  static void m()
//  {
//         try {
//               throw new FileNotFoundException();
//         } catch (FileNotFoundException e) {
//               System.out.println("FileNotFoundException handled in try-catch block");
//         }
//  }
	
	/*method m() propagated exception to calling method (i.e. main method) using throws.*/

//	public static void main(String[] args)
//	{
//        try 
//        {
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
//        throw new FileNotFoundException();
// }

	/*Throwing Exception from m() method and then again throwing it from calling 
	 * method [ i.e. main method]
	 */
	
	public static void main(String[] args) throws FileNotFoundException 
	{
        m();
        System.out.println("after calling m()");
     }
 static void m() throws FileNotFoundException
 {
        throw new FileNotFoundException();
 }
}
