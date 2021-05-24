package com.corejava.IO;

import java.io.IOException;


public class JavaIO 
{
	/* Java I/O (Input and Output) :
	 * 
	 * It is used to process the input and produce the output based on the input.
	 * 
	 * java.io package contains all the classes required for input and output operations.
	 * 
	 * We can perform file handling in java by java IO API.
	 * 
	 * Stream:
	 * stream is a sequence of data.
	 * 
	 * In Java a stream is composed of bytes. 
	 * It's called a stream because it's like a stream of water that 
	 * continues to flow.
	 * 
	 * In java, 3 streams are created for us automatically. 
	 * All these streams are attached with console.
	 * 
	 * 1) System.out: standard output stream
	 * 2) System.in : standard input stream
	 * 3) System.err: standard error stream
	 * 
	 * 
	 * OutputStream:
	 * Java application uses an output stream to write data to a destination, 
	 * it may be a file,an array,peripheral device or socket.
	 * 
	 * InputStream:
	 * Java application uses an input stream to read data from a source, 
	 * it may be a file,an array,peripheral device or socket.
	 * 
	 *    file  console  socket 								  file  console  socket
	 *       --------------                ------------               -----------
	 *     |               | InputStream  |            |OutputStream |           |
	 *     |    source     |------------- |  Java App  |-------------|Destination|
	 *     |               | 1010101010   |            |  1010101010 |           |
	 *      ---------------     Read       ------------      Write    -----------
	 * 
	 * 
	 * OutputStream class:
	 * It is an abstract class.
	 * It is the superclass of all classes representing an output stream of bytes. 
	 * An output stream accepts output bytes and sends them to some sink.
	 * 
	 * 
	 *  OutputStream : ----
	 *                    |
	 *                    |
	 *  FileOutputStream ,ByteArrayOutputStream,PipedOutputStream,ObjectOutputStream
	 *  FilterOutputStream (DataOutputStream,BufferedOutputStream,PrintStream).
	 *  
	 *  InputStream class:
	 *  InputStream class is an abstract class.
	 *  It is the superclass of all classes representing an input stream of bytes.
	 *  
	 *  InputStream : ----
	 *                    |
	 *                    |
	 *  FileInputStream ,ByteArrayInputStream,PipedInputStream,ObjectInputStream
	 *  FilterInputStream (DataInputStream,BufferedInputStream,PushBackInputStream).
	 *  
	 *                                      
	 * 
	 */
	public static void main(String[] args) throws IOException 
	{
		//int i=System.in.read();//returns ASCII code of 1st character  
		//System.out.println((char)i);//will print the character  
		
		//System.out.println("simple message");  
		//System.err.println("error message");  
	}

}
