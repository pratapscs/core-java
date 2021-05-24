package com.corejava.Multithreading.ThreadConcurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* The java.util.concurrent.ExecutorService interface represents an asynchronous 
 * execution mechanism which is capable of executing tasks in the background. ... 
 * In fact, the implementation of ExecutorService present in the 
 * java.util.concurrent package is a thread pool implementation.
 * An error occurred.
 */

public class ExecutorServiceExamples 
{
	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	public static void main(String[] args) throws InterruptedException,ExecutionException
	{
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		executorService.execute(new Runnable() 
		{
			public void run() {
				System.out.println("From ExecutorService");
			}
		});

		System.out.println("End of Main");

		executorService.shutdown();

		// Creates an Executor that uses a single worker thread operating off an
		// unbounded queue.
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();

		// Creates a thread pool that reuses a fixed number of threads
		// operating off a shared unbounded queue. At any point, the parameter
		// specifies the most threads that will be active processing tasks.

		ExecutorService executorService2 = Executors.newFixedThreadPool(10);

		// Creates a thread pool that can schedule commands to run after a
		// given delay, or to execute periodically.
		ExecutorService executorService3 = Executors.newScheduledThreadPool(10);

		Future future = executorService1.submit(new Runnable() {
			public void run() {
				System.out.println("From executorService1");
			}
		});

		future.get(); // returns null if the task has finished correctly.

		Future futureFromCallable = executorService1.submit(new Callable() {
			public String call() throws Exception {
				return "RESULT";
			}
		});

		System.out.println("futureFromCallable.get() = "
				+ futureFromCallable.get());

	}

}