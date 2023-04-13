package com.sls.interview;


public class FunctionalInterface1 {
	
	    public static void main(String args[])
	    {
	        // create anonymous inner class object
	        new Thread(new Runnable() {
	            @Override public void run()
	            {
	                System.out.println("New thread created");
	            }
	        }).start();
	        
	        
	        new Thread(()->{System.out.println("New Thread created");}).start();
	    }
	

}
