package com.corejava.RMI;

/*1) create the remote interface
 * 
 * For creating the remote interface, extend the Remote interface and 
 * declare the RemoteException with all the methods of the remote interface.
 * 
 */
import java.rmi.*;  

public interface Adder extends Remote
{  
public int add(int x,int y)throws RemoteException;  
}  