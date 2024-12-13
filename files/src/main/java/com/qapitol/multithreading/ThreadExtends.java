package com.qapitol.multithreading;

public class ThreadExtends extends Thread{

		// TODO Auto-generated method stub
		   @Override
		    public void run() {
		        // Task to be executed by the thread
			   for(int i=0;i<=10;i++) {
				   
			   
			   System.out.println("Running Thread1 "+i+ " Thread Name -1 :: "+Thread.currentThread().getName());
			}
		   }

		    public static void main(String[] args) {
		        // Creating multiple threads
		    	ThreadExtends thread1 = new ThreadExtends();
		    	ThreadExtends thread2 = new ThreadExtends();
		        
		        // Start the threads
		        thread1.start();
		        thread2.start();
		    }
		}

