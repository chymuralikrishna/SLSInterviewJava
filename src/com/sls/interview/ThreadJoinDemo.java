package com.sls.interview;

public class ThreadJoinDemo {
	 public static void main(String[] args) throws InterruptedException {
	        Thread t1 = new Thread(() -> {
	            System.out.println("Thread t1 started");
	            // some code
	            System.out.println("Thread t1 ended");
	        });
	        Thread t2 = new Thread(() -> {
	            System.out.println("Thread t2 started");
	            // some code
	            System.out.println("Thread t2 ended");
	        });
	        Thread t3 = new Thread(() -> {
	            System.out.println("Thread t3 started");
	            // some code
	            System.out.println("Thread t3 ended");
	        });

	        t1.start();
	        t2.start();
	        t3.start();

	        t1.join();
	        t2.join();
	        t3.join();

	        System.out.println("All threads completed");
	    }
}

