package com.corejava.GarbageCollection1;

/* It deals with the removal of unwanted objects from the heap memory.
 * 
 * 
 */
public class GarbageCollector
{
	  public static void main( String[] args)
	  {
	    Runtime rt = Runtime.getRuntime();
	     
	    System.out.println("Total JVM memory " + "available = "+ rt.totalMemory());
	    System.out.println("Free memory before " + "Garbage Collection = " + rt.freeMemory());
	     
	    rt.gc();
	     
	    System.out.println("Free memory after " + "Garbage Collection = " + rt.freeMemory());
	        }
	}