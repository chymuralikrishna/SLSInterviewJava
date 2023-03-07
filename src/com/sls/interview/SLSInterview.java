package com.sls.interview;

import java.util.Vector;

public class SLSInterview {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.say("say1");
		b.say2("say2");
		b.say3("say3");
		
		Vehicle v=(String msg)->System.out.println("This is from lamda: "+msg);
		v.say("hello");
	}
	
}

class Bike implements Vehicle{
	
	
	
	public void say2(String msg) {
		System.out.println(msg);
	}

	@Override
	public void say(String msg) {
		// TODO Auto-generated method stub
		
	}
}