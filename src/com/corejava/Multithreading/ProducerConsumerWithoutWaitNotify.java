package com.corejava.Multithreading;

import java.util.LinkedList;
import java.util.List;
 
/**
 * Producer Class in java, Producer will allow consumer to consume only
 * when 10 products have been produced (i.e. when production is over).
 */
class Producer2 implements Runnable{
    
    boolean productionInProcess;
    List<Integer> list;
    
    Producer2()
    {
           //initially Producer will be producing, so make this productionInProcess true.
           productionInProcess=true; 
           list=new LinkedList<Integer>();
    }
    
    @Override
    public void run(){
    
           for(int i=1;i<=10;i++){ //Producer will produce 10 products
                  list.add(i);
                  System.out.println("Producer is still Producing, Produced : "+i);
                  
                  try{
                        Thread.sleep(1000);
                  }catch(InterruptedException e){e.printStackTrace();}
           
           }
           
           /* Once production is over, make this productionInProcess false.
            * Production is over, consumer can consume.
            */
           productionInProcess=false;
           
    }
    
}
 
/**
 * Consumer Class.
 */
class Consumer2 extends Thread{
    Producer2 prod;
    
    Consumer2(Producer2 obj){
     prod=obj;
    }
    
    public void run(){
           /*
            * consumer checks whether productionInProcess is true or not,
            * if it's true, consumer will sleep and wake up after certain time
            * and again check whether productionInProcess is true or false.
            * process will repeat till productionInProcess is true.
            * Once productionInProcess is false we'll exit below while loop.
            */
           while(this.prod.productionInProcess){ 
              System.out.println("Consumer waiting for production to get over.");
              try{
                  Thread.sleep(4000);
              }catch(InterruptedException e){e.printStackTrace();}
           
           }
           
           
           /*productionInProcess is false means production is over,
            * consumer will start consuming. */
           System.out.println("Production is over, consumer can consume.");
           int productSize=this.prod.list.size();
           for(int i=0;i<productSize;i++)
                  System.out.println("CONSUMED : "+ this.prod.list.remove(0) +" "); 
           
    }
    
}
 
public class ProducerConsumerWithoutWaitNotify
{
	
    public static void main(String args[]){
           
           Producer2 prod=new Producer2();
           Consumer2 cons=new Consumer2(prod);
           
           Thread prodThread=new Thread(prod,"prodThread");
           Thread consThread=new Thread(cons,"consThread");
           
           prodThread.start();     //start producer thread.
           consThread.start();     //start consumer thread.
           
           
    }
 
}