package com.sls.interview;
@FunctionalInterface
public interface Vehicle {
	int i=0;
	public abstract void say(String msg);
	public static void say2(String msg) {
		
	}
public default void say3(String msg) {
		System.out.println(msg);
	}

}
