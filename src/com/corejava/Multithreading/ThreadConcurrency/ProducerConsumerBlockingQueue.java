package com.corejava.Multithreading.ThreadConcurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
 
/**
 * Producer Class in java.
 */
class Producer3 implements Runnable 
{ 
    private final BlockingQueue<Integer> sharedQueue;
 
    public Producer3(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
         try {
             System.out.println("Produced : " + i);
             //put/produce into sharedQueue.
             sharedQueue.put(i);      //used by producer to put/produce in sharedQueue.    
         } catch (InterruptedException ex)
         {
             
         }
        }
    }
 
}
 
/**
 * Consumer Class in java.
 */
class Consumer3 implements Runnable{
 
    private BlockingQueue<Integer> sharedQueue;
 
    public Consumer3 (BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
    @Override
    public void run() {
        while(true){
         try {
           //take/consume from sharedQueue.
             System.out.println("CONSUMED : "+ sharedQueue.take());  
           //used by consumer to take/consume from sharedQueue.
         } catch (InterruptedException ex) {
             
         }
        }
    }
  
}

public class ProducerConsumerBlockingQueue 
{
 
    public static void main(String args[]){
     
     //Creating shared object  
     BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();
    
     Producer3 producer=new Producer3(sharedQueue);
     Consumer3 consumer=new Consumer3(sharedQueue);
    
     Thread producerThread = new Thread(producer, "ProducerThread");
     Thread consumerThread = new Thread(consumer, "ConsumerThread");
     producerThread.start();
     consumerThread.start();
 
    }
 
}