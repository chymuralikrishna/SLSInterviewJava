package com.sls.interview;

public class GenericsDemo {
	
	public static void main(String[] args) {
		Box<Integer,String> integerBox = new Box<Integer,String>();
		integerBox.set(10);
		integerBox.setP("Hello");
		
		System.out.println(integerBox.get());
		System.out.println(integerBox.getP());
		
		Box<String,Integer> stringBox = new Box<String,Integer>();
		stringBox.setP(10);
		stringBox.set("Hello");
		
		System.out.println(stringBox.get());
		System.out.println(stringBox.getP());
	}
	
	

}
