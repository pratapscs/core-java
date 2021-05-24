package com.corejava.RMI;

/* 2) Provide the implementation of the remote interface
 * 
 * For providing the implementation of the Remote interface, we need to
 * 
 * Either extend the UnicastRemoteObject class,
 * or use the exportObject() method of the UnicastRemoteObject class
 * 
 * In case, you extend the UnicastRemoteObject class, you must define 
 * a constructor that declares RemoteException.
 * 
 */
import java.rmi.*;  
import java.rmi.server.*;  

@SuppressWarnings("serial")
public class AdderRemote extends UnicastRemoteObject implements Adder
{  
AdderRemote()throws RemoteException
{  
super();  
}  
public int add(int x,int y)
{
	return x+y;
 }  
}  