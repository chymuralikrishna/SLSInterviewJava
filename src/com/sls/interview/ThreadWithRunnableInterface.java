package com.sls.interview;

public class ThreadWithRunnableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadWithRunnableInterface "+Thread.currentThread().getName()+" is running");
		
	}
	


}
