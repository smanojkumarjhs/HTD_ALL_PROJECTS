package com.qapitol.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThread implements Runnable {
	
	
	    @Override
	    public void run() {
	    	for (int i = 0; i<=10; i++) {
				System.out.println("Running Thread1 "+i+ " Thread Name -1 :: "+Thread.currentThread().getName());
			}
	    }

	    public static void main(String[] args) {
	        // Create a thread pool with 3 threads
	        ExecutorService executor = Executors.newFixedThreadPool(3);

	        // Submit tasks to the executor
	        executor.submit(new ExecutorThread());
	        executor.submit(new ExecutorThread());
	        executor.submit(new ExecutorThread());

	        // Shut down the executor after the tasks are completed
	        executor.shutdown();
	    }
	}


