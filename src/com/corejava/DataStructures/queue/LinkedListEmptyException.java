package com.corejava.DataStructures.queue;

/**
 *Exception to indicate that LinkedList is empty.
 */
@SuppressWarnings("serial")
class LinkedListEmptyException extends RuntimeException
{
       public LinkedListEmptyException(){
         super();
       }
      
     public LinkedListEmptyException(String message){
         super(message);
       }  
}