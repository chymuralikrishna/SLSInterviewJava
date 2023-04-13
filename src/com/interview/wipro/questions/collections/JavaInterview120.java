package com.interview.wipro.questions.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class JavaInterview120 {

	public static void main(String[] args) {
//		 equals()
	Integer x=new Integer(20);
	Integer y=new Integer(20);
	System.out.println(x.equals(y));
	
	
	System.out.println(x.compareTo(y));
	
	
	HashSet ts=new HashSet<Object>();
	ts.add(new Integer(20));
	ts.add(new String("Hi"));
	
	
	
	
	
	
	
	
	
	
	/*
// super
	Car car=new Car();
	car.printMaxSpeed();
	
	
	Set<Car> s=new HashSet<Car>();
	
	for(int i=0;i<1000;i++) {
		s.add(new Car());
	}
	Iterator<Car> val=s.iterator();
//	val.forEachRemaining(v->System.out.println(v.maxSpeed));
	
	while(val.hasNext()) {
		System.out.println(val.next().maxSpeed);
	}
	System.out.println();
*/	
	}

}
