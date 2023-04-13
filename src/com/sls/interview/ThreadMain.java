package com.sls.interview;

public class ThreadMain {
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			Thread obj=new Thread(new ThreadWithThreadExtends());
			obj.start();
			Thread objRun=new Thread(new ThreadWithRunnableInterface());
			objRun.start();
		}

		}
}
