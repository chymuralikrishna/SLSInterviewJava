package com.sls.interview;

public class ThreadWithThreadExtends extends Thread {
	
	public void run() {
		try {
			System.out.println("ThreadWithThreadExtends "+Thread.currentThread().getId()+" is running");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
