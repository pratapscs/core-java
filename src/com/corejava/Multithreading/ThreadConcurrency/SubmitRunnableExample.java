package com.corejava.Multithreading.ThreadConcurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 
 
class MyRunnable1 implements Runnable {
    @Override
    public void run() {
           System.out.println("MyRunnable's run()");
           
    }
}

public class SubmitRunnableExample 
{
  private static final int NTHREDS = 10;
 
  public static void main(String[] args) throws InterruptedException, ExecutionException {
 
    ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
 
    //submit(Runnable task, T result)
    Future<Integer> futureInteger=executor.submit(new MyRunnable1(), 1);
    System.out.println("futureInteger.get() > "+futureInteger.get());
     
    //submit(Runnable task)
    Future<?> future=executor.submit(new MyRunnable1());
    System.out.println("future.get() > "+future.get());
  }
}
 