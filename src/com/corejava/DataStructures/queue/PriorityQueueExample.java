package com.corejava.DataStructures.queue;

/* Priority Queue is Collection of entities or elements.
 * 
 * Addition of element is done on basis of priority.
 * Removal of element is done at FRONT.
 * 
 * Ex:
 * There might be a case where patients are waiting for some regular check up 
 * with the doctor, but certainly some patient might come with some emergency, 
 * he will surely be given priority as compared to regular patients in java.
 * 
 */

class PriorityQueue 
{
    private int[] prioQueueAr;
    private int size;//Size of Queue
    private int number;  //holds number of elements in Priority Queue, initialized with 0 by default
 
    public PriorityQueue(int size)
    {
           this.size = size;
           prioQueueAr = new int[this.size];
           number = 0;
    }
 
    /**
     * Insert element in Priority Queue, element will be inserted on basis of priority.
     */
    public void insert(int value)
    {
           int i;
           if(isFull())
           {
                  throw new QueueFullException("Cannot insert "+value+", Queue is full");
           }                       
           if (number == 0)
                  prioQueueAr[number++] = value; //If no values in PriorityQueue- insert at starting position, i.e. at 0th position.
           else{
                  for (i=number - 1; i>= 0; i--){              
                        if (value > prioQueueAr[i])
                               prioQueueAr[i + 1] = prioQueueAr[i]; //if value is larger, shift elements upward till value is larger.
                        else
                               break;
                  }
                  prioQueueAr[++i] = value; // insert element in space created by upward shift of elements.
                  number++;
           }
    }
 
 
    /**
     * Remove elements from Priority Queue
     */
    public int remove()
    {
           if(isEmpty())
           {
                  throw new QueueEmptyException("Queue is empty");
           }
           return prioQueueAr[--number];
    }
 
    /**
     * Returns true if Priority Queue is full
     * @return
     */
    public boolean isFull()
    {
           return (number == size);
    }
    
    /**
     * Returns true if Priority Queue is empty
     * @return
     */
    public boolean isEmpty()
    {
           return (number == 0);
    }   
}
 
/**
 * Main Class
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
           PriorityQueue priorityQueue = new PriorityQueue(10); // Priority Queue holds 10 elements
           
           priorityQueue.insert(81);
           priorityQueue.insert(72);
           priorityQueue.insert(52);
           priorityQueue.insert(61);
           
           System.out.print("Deleted elements from queue: ");
           System.out.print(priorityQueue.remove()+" ");
           System.out.print(priorityQueue.remove()+" ");
           System.out.print(priorityQueue.remove()+" ");
           System.out.print(priorityQueue.remove()+" ");
                  
    }
           
}