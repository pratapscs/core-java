package com.corejava.ExceptionHandling.Exceptions;

//when we try to acces file from invalid path using RandomAccessFile.

/*
 RandomAccessFile allows us to read/write at random positions
 By using seek method we can move to random position,if seek is set beyond the length the file 
 and we try to read from there than java.io.EOFException is thrown.
*/
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {
      	try {
             	String fileName = "c:/myFile.txt";
             	String data = "abcdef";
             	
             	RandomAccessFile randomAccessFile;
             	
             	// ---- Writing in file using RandomAccessFile ----
             	// 'rw' means opening file in Read-Write mode
             	randomAccessFile = new RandomAccessFile(fileName, "rw");
             	randomAccessFile.seek(5);
             	randomAccessFile.writeUTF(data);
             	System.out.println("Data written in "+" = "+data);
             	randomAccessFile.close();

             	// ---- Reading from file using RandomAccessFile ----
             	// 'r' means opening file in Read mode
             	randomAccessFile = new RandomAccessFile(fileName, "r");
             	randomAccessFile.seek(5);
             	data = randomAccessFile.readUTF();
             	System.out.println("Data read from file = "+data);
             	randomAccessFile.close();

      	} catch (FileNotFoundException fnfe) {
             	fnfe.printStackTrace();
      	} catch (IOException ioe) {
             	ioe.printStackTrace();
      	}
	}
}
