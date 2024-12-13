package com.qapitol.multithreading;

public class ThreadRunnableImplements implements Runnable {
	 @Override
	    public void run() {
	        // Task to be executed by the thread
		 for (int i = 0; i<=10; i++) {
			 System.out.println("Running Thread1 "+i+ " Thread Name -1 :: "+Thread.currentThread().getName());
			}
	    }
	 

	    public static void main(String[] args) {
	        // Create a Runnable instance
	    	ThreadRunnableImplements  task = new ThreadRunnableImplements();

	        // Create threads by passing the Runnable task
	        Thread thread1 = new Thread(task);
	        Thread thread2 = new Thread(task);
	        
	        // Start the threads
	        thread1.start();
	        thread2.start();
	    }
	}


