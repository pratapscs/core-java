package com.corejava.Multithreading.ThreadConcurrency;

import java.util.LinkedList;
import java.util.List;
 
/**
 * Implementing custom BlockingQueue interface .
 * This BlockingQueue implementation follows FIFO (first-in-first-out).
 * New elements are inserted at the tail of the queue,
 * and removal elements is done at the head of the queue.
 *
 */
interface BlockingQueueCustom1<E> {
 
      /**
       * Inserts the specified element into this queue
       * only if space is available else 
       * waits for space to become available.
       */
      void put(E item)  throws InterruptedException ;
 
 
      /**
       * Retrieves and removes the head of this queue
       * only if elements are available else 
       * waits for element to become available.
       */
      E take()  throws InterruptedException;
}

/**
 * Implementing custom LinkedBlockingQueue class.
 * This BlockingQueue implementation follows FIFO (first-in-first-out).
 * New elements are inserted at the tail of the queue,
 * and removal elements is done at the head of the queue.
 *
 */
class LinkedBlockingQueueCustom1<E> implements BlockingQueueCustom1<E>{
 
      private List<E> queue;
      private int  maxSize ; //maximum number of elements queue can hold at a time.
 
      public LinkedBlockingQueueCustom1(int maxSize){
     this.maxSize = maxSize;
     queue = new LinkedList<E>();
      }
 
 
      /**
       * Inserts the specified element into this queue
       * only if space is available else 
       * waits for space to become available.
       */
      public synchronized void put(E item)  throws InterruptedException  {
            
               //check space is available or not.
               if (queue.size() == maxSize) {
             this.wait();
               }
               
               //space is available, insert.
         queue.add(item);
         this.notify();
      }
 
 
      /**
       * Retrieves and removes the head of this queue
       * only if elements are available else 
       * waits for element to become available.
       */
      public synchronized E take()  throws InterruptedException{
 
             //waits element is available or not.
        if (queue.size() == 0) {
            this.wait();
        }
 
        //element is available, remove.
        this.notify();
         return queue.remove(0);
      }  
}
 
 
/**
 * Producer Class in java
 */
class Producer implements Runnable {
 
    private final BlockingQueueCustom1<Integer> sharedQueue;
 
    public Producer(BlockingQueueCustom1<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
         try {
             System.out.println("Produced : " + i);
             //put/produce into sharedQueue.
             sharedQueue.put(i);          
         } catch (InterruptedException ex) {
             
         }
        }
    }
 
}
 
/**
 * Consumer Class in Java
 */
class Consumer implements Runnable{
 
    private BlockingQueueCustom1<Integer> sharedQueue;
 
    public Consumer (BlockingQueueCustom1<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
    @Override
    public void run() {
        while(true){
         try {
           //take/consume from sharedQueue.
             System.out.println("CONSUMED : "+ sharedQueue.take());  
         } catch (InterruptedException ex) {
             
         }
        }
    }
 
 
}
 

/**
 * Main class in java
 */
public class ProducerConsumerBlockingQueueCustom {
 
    public static void main(String args[]){
     
     BlockingQueueCustom1<Integer> sharedQueue = new LinkedBlockingQueueCustom1<Integer>(10); //Creating shared object
    
     Producer producer=new Producer(sharedQueue);
     Consumer consumer=new Consumer(sharedQueue);
    
     Thread producerThread = new Thread(producer, "ProducerThread");
     Thread consumerThread = new Thread(consumer, "ConsumerThread");
     producerThread.start();
     consumerThread.start();
 
    }
 
}