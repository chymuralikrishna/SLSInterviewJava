package com.sls.interview;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorExample {
	
	
	public static void main(String[] args) {
		Executor executor=Executors.newFixedThreadPool(1);
		for(int i=1; i<=10;i++) {
			executor.execute(new Task(i));
		}
	}
	
	private static class Task implements Runnable{
		private int taskId;
		public Task(int taskId) {
			this.taskId=taskId;
		}
       

        public void run() {
            // Simulate some work
            System.out.println("Task " + taskId + " is starting...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle exception
            }
            System.out.println("Task " + taskId + " is complete.");
        }

		
	}
}
