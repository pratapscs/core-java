package com.corejava.ExceptionHandling;

public class ExceptionTest7 
{
	public static void main(String[] args) {
        try{
               System.out.println("in try block");
               System.exit(0);
               
               /* finally block is not executed when System.exit is called.
                * 
                * System.exit(n) method >
                * System.exit terminates JVM. 
                * 
                * Parameter : Passing zero as parameter means normal termination &
                * Passing non-zero as parameter means abnormal termination.
                * 
                * System.exit(n) internally calls Runtime.getRuntime().exit(n).
                * 
                */
        }
        finally
        {
               System.out.println("finally block executed");              
        }
 }

}
