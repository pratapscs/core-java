package com.corejava.ExceptionHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResourseTest 
{
//	public static void main(String[] args) throws IOException 
//	{
//        InputStream inputStream = null;
//        try{
//               inputStream = new FileInputStream("com/corejava/ExceptionHandling/txtFile.txt");
//               //code......
//        }finally{
//               if(inputStream!=null)
//               inputStream.close();
//        }
// }
	
	//In java 7, using Try-with-resources >
	//we need not to write explicit code for closing file.
	
//	public static void main(String[] args) throws IOException {
//        try (InputStream inputStream = new FileInputStream("c:/txtFile.txt")) {
//            //code...
//        }
// }
	
	/* Using multiple resources inside Try-with-resources >
	 * Try-with-resources allows us to use multiple resources inside it, all that we need 
	 * to do is separate resources by semicolon (;)
	 */
	public static void main(String[] args) throws IOException {
        try (InputStream inputStream = new FileInputStream("c:/txtFile.txt") ;
              InputStream bInputStream = new BufferedInputStream(inputStream) ){
               //code...
        }
 }

}
